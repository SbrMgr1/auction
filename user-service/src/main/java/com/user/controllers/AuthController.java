package com.user.controllers;

import com.user.configs.ApiResponse;
import com.user.domains.UserCredential;
import com.user.util.JwtUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
public class AuthController {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    @Qualifier("MyUserDetailService")
    UserDetailsService userDetailsService;

    @PostMapping(value = "/authenticate")
    @ApiOperation(value = "Api for authentication")
    public ApiResponse authorize(@Valid @RequestBody UserCredential userCredential){
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userCredential.getUsername(),userCredential.getPassword())
            );
            UserDetails userDetails = userDetailsService.loadUserByUsername(userCredential.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);

            return new ApiResponse(true,"Login Successfully.",jwt);
        }catch (BadCredentialsException e){
            return new ApiResponse(false,"Invalid Credentials","");
        }
    }
}
