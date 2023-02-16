package com.merha.restapispringboot.controller;

import com.merha.restapispringboot.model.LiveStream;
import com.merha.restapispringboot.repository.LiveStreamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;
    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LiveStream> findAll(){
            return repository.findAll();
    }

    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable(name = "id") String id){
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@Valid @PathVariable(name = "id") String id){
        repository.deleteById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream save(@Valid @RequestBody LiveStream stream){
        return repository.save(stream);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@PathVariable(name = "id") String id, @RequestBody LiveStream stream){
         repository.update(stream,id);
    }
}
