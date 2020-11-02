package com.user.services;

import com.user.domains.UserCredential;

public interface UserCredentialService {
    public UserCredential getByUserName(String userName);
}
