package com.merha.restapispringboot.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

class LiveStreamTest {

    @Test
     void create_new_live_stream_test(){
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building REST APIs with Spring Boot");
        stream.setDescription("""
                Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations.\s
                                But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in\s
                                developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                """);
        stream.setUrl("https://www.twtich.tv/merha");
        stream.setStartDate(LocalDateTime.of(2022, 2, 16, 11, 0));
        stream.setEndDate(LocalDateTime.of(2022, 2, 16, 12, 0));


        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot",stream.getTitle(),"wrong tittle");
    }

    @Test
    void create_new_immtable_livestream_test(){
        ImmutableLiveStream immutableStream = new ImmutableLiveStream(UUID.randomUUID().toString(),"Building REST APIs with Spring Boot using immutable", """
                 Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations.\s
                                But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in\s
                                developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                ""","https://www.twtich.tv/merha",LocalDateTime.of(2022, 2, 16, 11, 0),
                LocalDateTime.of(2022, 2, 16, 12, 0));


        assertNotNull(immutableStream);
        assertEquals("Building REST APIs with Spring Boot using immutable",immutableStream.getTitle());
    }

    @Test
    void create_new_record_live_stream(){
        LiveStream recordStream = new LiveStream(UUID.randomUUID().toString(),"Building REST APIs with Spring Boot using record", """
                 Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations.\s
                                But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in\s
                                developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                ""","https://www.twtich.tv/merha",LocalDateTime.of(2022, 2, 16, 11, 0),
                LocalDateTime.of(2022, 2, 16, 12, 0));

        assertNotNull(recordStream);
        assertEquals("Building REST APIs with Spring Boot using record",recordStream.title());
        assertTrue(recordStream.getClass().isRecord());
        assertEquals(6,recordStream.getClass().getRecordComponents().length,"this is not the number of components");


    }

}
