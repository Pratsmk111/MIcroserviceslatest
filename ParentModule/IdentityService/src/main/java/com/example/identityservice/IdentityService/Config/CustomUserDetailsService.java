package com.example.identityservice.IdentityService.Config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.identityservice.IdentityService.Entity.UserCredential;
import com.example.identityservice.IdentityService.repository.UserCredentialsRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserCredentialsRepository repository;
	
	
	@Override
	public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    Optional<UserCredential> credential = repository.findByName(username);
//	    if (credential.isPresent()) {
//	        UserCredential userCredential = credential.get();
//	        return new CustomUserDetails(userCredential);
//	    } else {
//	        throw new UsernameNotFoundException("User not found with name: " + username);
//	    }
	    return credential.map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + username));

    
	}


}
