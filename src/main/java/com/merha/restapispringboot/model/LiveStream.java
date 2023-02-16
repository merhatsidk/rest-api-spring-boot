package com.merha.restapispringboot.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record LiveStream(
        @NotEmpty
        String id,
        @NotEmpty
        String title,
        String description,
        String url,
        LocalDateTime startDate,
        LocalDateTime endDate)
{
    // the record will create all neccessary things for me including constructors,getters and equals and hashcode
    // but if i want to do it, i can also create them here as well
    // if i also do validation i can also do here by using compact constructor like this


//    public LiveStream {
//        if(id == null){
//            throw new NullPointerException("id can't be null");
//        }
//    }

}
