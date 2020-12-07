package com.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ContextConfiguration
@TestPropertySource(locations = "classpath:application.properties")
class UserApplicationTests {

    @Test
    void contextLoads() {
    }

}
