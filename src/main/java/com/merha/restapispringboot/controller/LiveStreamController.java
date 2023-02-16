package com.merha.restapispringboot.controller;

import com.merha.restapispringboot.model.LiveStream;
import com.merha.restapispringboot.repository.LiveStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") String id){
        repository.deleteById(id);
    }

    @PostMapping
    public LiveStream save(@RequestBody LiveStream stream){
        return repository.save(stream);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable(name = "id") String id, @RequestBody LiveStream stream){
         repository.update(stream,id);
    }
}
