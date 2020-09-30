package com.avelircraft.services;

import com.avelircraft.models.News;
import com.avelircraft.repositories.CustomizedNewsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsDataService {

    @Autowired
    private CustomizedNewsCrudRepository newsCrudRepository;

    public Optional<News> findById(Long id){
        return newsCrudRepository.findById(id);
    }

    public Iterable<News> findAll(){
        return newsCrudRepository.findAll();
    }

    public News save(News var){
        return newsCrudRepository.save(var);
    };

    public Iterable<News> saveAll(List<News> vars){
        return newsCrudRepository.saveAll(vars);
    };

    public void deleteById(Long id){
        newsCrudRepository.deleteById(id);
    }

    public void deleteAll(List<News> vars){
        newsCrudRepository.deleteAll(vars);
    };

    public void deleteAll(){
        newsCrudRepository.deleteAll();
    };
}
