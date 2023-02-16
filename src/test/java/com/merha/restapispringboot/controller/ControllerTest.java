package com.merha.restapispringboot.controller;

import com.merha.restapispringboot.model.LiveStream;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

//    @Test
//    @Order(1)
//    void findAll() {
//        ResponseEntity<List<LiveStream>> entity = findAllStreams();
//        assertEquals(HttpStatus.OK,entity.getStatusCode());
//        assertEquals(MediaType.APPLICATION_JSON,entity.getHeaders().getContentType());
//        assertEquals(1, entity.getBody().size());
//    }
//
//    @Test
//    @Order(3)
//    void create() {
//        String id = UUID.randomUUID().toString();
//        LiveStream stream = new LiveStream(
//                id,
//                "TEST_TITLE",
//                "TEST_DESC",
//                "https://www.twtich.tv/danvega",
//                LocalDateTime.of(2022,3,01,11,0),
//                LocalDateTime.of(2022,3,01,12,0)
//        );
//
//        ResponseEntity<LiveStream> entity = restTemplate.postForEntity("/streams", stream, LiveStream.class);
//        assertEquals(HttpStatus.CREATED,entity.getStatusCode());
//        assertEquals(2,findAllStreams().getBody().size());
//
//        LiveStream newStream = entity.getBody();
//        assertEquals(id,newStream.id());
//        assertEquals("TEST_TITLE",newStream.title());
//        assertEquals("TEST_DESC",newStream.description());
//        assertEquals("https://www.twtich.tv/danvega",newStream.url());
//        assertEquals(LocalDateTime.of(2022,3,01,11,0),newStream.startDate());
//        assertEquals(LocalDateTime.of(2022,3,01,12,0),newStream.endDate());
//    }



}
