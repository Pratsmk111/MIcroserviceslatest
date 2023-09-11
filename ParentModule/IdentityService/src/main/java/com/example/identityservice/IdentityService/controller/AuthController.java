package com.example.identityservice.IdentityService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.identityservice.IdentityService.Entity.UserCredential;
import com.example.identityservice.IdentityService.dto.AuthRequest;
import com.example.identityservice.IdentityService.service.AuthService;
@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

	@Autowired
	private AuthService service;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	//this method is used to save the user details in db
	@PostMapping("/register")
	public ResponseEntity<String> addnewuser(@RequestBody UserCredential user) {
		return service.saveuser(user);
	}
	
//	@PostMapping("/token")
//	public String getToken(@RequestBody AuthRequest authRequest) {
//		
//		
//		Authentication authenticate= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
//		if(authenticate.isAuthenticated()) {
//			return service.generateToken(authRequest.getUsername());
//		}
//		else {
//			throw new RuntimeException("Invalid access");
//		}
//		
//	}
	
	@PostMapping("/token")

    public ResponseEntity<String> getToken(@RequestBody AuthRequest authRequest) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );
            if (authenticate.isAuthenticated()) {
               return service.generateToken(authRequest.getUsername());
//                return ResponseEntity.ok(token);
            } else {
                // Unauthorized response
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("{\"error\": \"Invalid access\"}");
            }
        }
        catch (Exception e) {
       // Internal server error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("{\"error\": \"An error occurred\"}");
        }
    }
	

	
	@GetMapping("/validate")
	public String validateToken(@RequestParam("token") String token) {
		 service.validateToken(token);
		 return "Token is valid";
	}
	

}
