package com.user.services;

import com.user.domains.UserCredential;

import javax.transaction.Transactional;

@Transactional
public interface UserCredentialService {
    public UserCredential getByUserName(String userName);
}
