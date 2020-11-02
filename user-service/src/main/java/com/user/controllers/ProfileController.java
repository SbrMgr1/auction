package com.user.controllers;

import com.user.configs.ApiResponse;
import com.user.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/profile")
@RestController
public class ProfileController {

    @Autowired
    JwtUtil jwtUtil;

    @Qualifier("MyUserDetailService")
    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(value = "/get")
    public ApiResponse get(@RequestHeader(value="Authorization") String Authorization, HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = new ApiResponse(true,
                "Profile has been loaded successfully",
                userDetailsService.loadUserByUsername(httpServletRequest.getParameter("userName")));
        return apiResponse;
    }
}
