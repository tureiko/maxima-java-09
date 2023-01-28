package org.example.repository;

import org.example.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    public List<Cat> findByWeightGreaterThan(int weight);

    public Cat getOneById(Long id);

    @Query("select с from Cat с where name='Мурка'")
    public List<Cat> findMurzik();
}
