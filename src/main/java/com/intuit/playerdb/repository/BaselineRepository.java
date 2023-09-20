package com.intuit.playerdb.repository;


import com.intuit.playerdb.model.Baseline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BaselineRepository extends JpaRepository<Baseline, Long> {

//    @Query(name = "SELECT p FROM PLAYERS p WHERE p.birthCountry = :birthCountry")
    List<Baseline> findBaselineByBirthCountry(@Param("birthCountry") String birthCountry);
//    @Query(name = "SELECT p FROM PLAYERS p WHERE LOWER(p.birthCountry) = LOWER(:birthCountry)")
//    public List<Player> findByBirthCountry(@Param("birthCountry") String birthCountry);

}
