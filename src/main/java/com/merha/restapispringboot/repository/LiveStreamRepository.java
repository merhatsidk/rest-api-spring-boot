package com.merha.restapispringboot.repository;

import com.merha.restapispringboot.model.LiveStream;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();
    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                        Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations. 
                    But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in 
                    developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                        """
                ,
                "https://www.twtich.tv/merha",
                LocalDateTime.of(2022,2,16,11,0),
                LocalDateTime.of(2022,2,16,12,0)
        ));
    }

    public List<LiveStream> findAll(){
        return streams;
    }

    public LiveStream findById(String id) throws NullPointerException{
         return  streams.stream().filter(s -> s.id().equals(id)).findFirst().orElseThrow(() -> new NullPointerException("there is no LiveStream with this id"));
    }

    public void update(LiveStream stream, String id){
        LiveStream existing = streams.stream().filter(s -> s.id().equals(id)).findFirst().orElseThrow(NullPointerException::new);
        int index = streams.indexOf(existing);
        streams.set(index,stream);
    }

    public LiveStream save(LiveStream stream){
        streams.add(stream);
        return stream;
    }

    public void deleteById(String id) {
        streams.removeIf(s -> s.id().equals(id));
    }
}
