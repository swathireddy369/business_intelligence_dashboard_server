package com.example.business_intelligence_dashboard_server.controller;

import com.example.business_intelligence_dashboard_server.model.User;
import com.example.business_intelligence_dashboard_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
   private PasswordEncoder passwordEncoder;

  public ResponseEntity<> createUserHandler(@RequestBody User user){

      User createdUser=new User();
      createdUser.setEmail(user.getEmail());
      createdUser.setFirstName(user.getFirstName());
      createdUser.setLastName(user.getLastName());
      createdUser.setPassword(passwordEncoder.encode(user.getPassword()));
      User savedUser=userRepository.save(createdUser);

      //To authenticate email and password
      Authentication authentication=new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword());
      SecurityContextHolder.getContext().setAuthentication(authentication);
      String jwt=jwtProvider.g
  }

}
