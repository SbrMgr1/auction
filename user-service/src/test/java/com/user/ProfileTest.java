package com.user;

import com.google.common.net.MediaType;
import com.user.domains.UserCredential;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class ProfileTest {

    @Autowired
    private MockMvc mockMvc;



//    @Test
//    public void testGet() throws Exception {
//
//        String jwt = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb290IiwiZXhwIjoxNjA0MzMxNDU4LCJpYXQiOjE2MDQyOTU0NTh9.B061Mo8n1Zq80wPy6aQ1HOeCD_fGqxwsKKrv6H-dVKQ";
//
//        mockMvc.perform(
//                get("/profile/get")
//                        .header("Authorization","Bearer "+jwt)
//                        .contentType(String.valueOf(MediaType.JSON_UTF_8))
//        ).andExpect(
//                status().isOk()
//
//        ).andExpect(
//                jsonPath("$.status", is(true))
//        ).andExpect(
//                jsonPath("$.data.username", is("root"))
//        );
//    }

}
