package com.user.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.user.entity.UserEntity;
import com.user.repository.UserRepo;

@Service
public class UserService implements UserDetailsService{

//	@Autowired
//	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		Optional<UserEntity> user = userRepo.findById(Long.valueOf(username));
//		if(user.isEmpty()) {
//			throw new UsernameNotFoundException("User not found");
//		}
//		
//		UserDetails u=new UserDetailsImplementor(user.get());
		
		return new User("1","1",new ArrayList<>());
				
	}

}
