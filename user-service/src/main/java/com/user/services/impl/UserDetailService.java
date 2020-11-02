package com.user.services.impl;

import com.user.domains.UserCredential;
import com.user.repositories.UserCredentialRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("MyUserDetailService")
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserCredentialRepository userCredentialRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        try{
            UserCredential userCredential = userCredentialRepository.findUserCredentialByUsername(s);
//            return new User(userCredential.getUsername(),userCredential.getPassword(),new ArrayList<>());
            return new User("root","password",new ArrayList<>());
        }catch (Exception e){
            throw new UsernameNotFoundException("Username Not Found");
        }

    }
}
