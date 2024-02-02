package com.nasctecnology.subscribe.services;

import com.nasctecnology.subscribe.domain.UserSubscribe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserSubscribeServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void createUserSubscribe_ReturnsUser() {
        UserSubscribe user = new UserSubscribe(null, "User Root", "12345");
        ResponseEntity<UserSubscribe> response = restTemplate.postForEntity("/usersubscribe", user, UserSubscribe.class);

        assertNotNull(response.getBody().getId());
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(user.getName(), response.getBody().getName());
        assertEquals(user.getEmail(), response.getBody().getEmail());
    }

}