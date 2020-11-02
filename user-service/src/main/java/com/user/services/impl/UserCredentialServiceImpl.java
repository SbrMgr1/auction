package com.user.services.impl;

import com.user.domains.UserCredential;
import com.user.repositories.UserCredentialRepository;
import com.user.services.UserCredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserCredentialServiceImpl implements UserCredentialService {
    @Autowired
    UserCredentialRepository userCredentialRepository;

    @Override
    public UserCredential getByUserName(String userName) {
        return userCredentialRepository.findUserCredentialByUsername(userName);
    }
}
