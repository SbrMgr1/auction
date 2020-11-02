package com.user.repositories;

import com.user.domains.UserCredential;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialRepository extends CrudRepository<UserCredential,Long> {
    UserCredential findUserCredentialByUsername(String username);
}
