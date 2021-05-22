package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.models.JWTRequest;
import com.user.models.JWTResponse;
import com.user.service.UserService;
import com.user.utility.JWTUtility;

@RestController
public class UserEndpointsImplementor {

	@Autowired
	private JWTUtility utility;
	
	@Autowired
	private AuthenticationManager am;
	
	@Autowired
	private UserService us;
	
	@Autowired
	private RestTemplate callDocService;
	
	@GetMapping("/isValid")
	public String isUserValid() {
		return "Valid User GH " + callDocService.getForObject("http://DOCUMENT-SERVICE/getDoc", String.class);
	}
	
	@GetMapping("/authenticate")
	public JWTResponse authenticate(@RequestBody JWTRequest jwtRequest) throws Exception {
		
		try {
			am.authenticate(
				new UsernamePasswordAuthenticationToken(
						jwtRequest.getUid(),jwtRequest.getPw()));
		}catch(BadCredentialsException e) {
			throw new Exception("INVALID CREDENTIALS",e);
		}
		
		final UserDetails user=us.loadUserByUsername(jwtRequest.getUid());
		
		final String token=utility.generateToken(user);
		
		return new JWTResponse(token);
	}

}
