package org.example.service;

import jakarta.annotation.PostConstruct;
import org.example.model.Cat;
import org.example.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CatService {
    @Autowired
    private CatRepository repo;

    @PostConstruct
    public void init() {

        repo.save(new Cat(1L, "Мурзик"));
        repo.save(new Cat(2L, "Барсик"));
        repo.save(new Cat(3L, "Мурка"));
    }

    public void start() {
        System.out.println(repo.findAll());
    }

    public List<Cat> getAllCats() {
        return repo.findAll();
    }

    public void createCat(Cat cat) {
        repo.save(cat);
    }

    public Cat getOne(Long id) {
        return repo.getOneById(id);
    }

    public boolean update(Long id, Cat newCat) {
        if (repo.existsById(id)) {
            newCat.setId(id);
            repo.save(newCat);
            return true;
        }
        return false;
    }
}
