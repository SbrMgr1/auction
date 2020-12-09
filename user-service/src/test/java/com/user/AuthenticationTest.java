package com.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.net.MediaType;
import com.user.domains.UserCredential;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration
@TestPropertySource(locations = "classpath:application.properties")
public class AuthenticationTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    public void loginTest() throws Exception {

        UserCredential obj = new UserCredential();
        obj.setUsername("root");
        obj.setPassword("password");
        JsonMapper<UserCredential> jsonMapper = new JsonMapper<UserCredential>();

        mockMvc.perform(
                post("/authenticate")
                        .contentType(String.valueOf(MediaType.JSON_UTF_8))
                        .content(jsonMapper.toJson(obj))
        ).andExpect(
                status().isOk()

        ).andExpect(
                jsonPath("$.status", is(false))
        );
    }

}
