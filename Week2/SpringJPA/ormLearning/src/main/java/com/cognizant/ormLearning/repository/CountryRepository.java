package com.cognizant.ormLearning.repository;

import com.cognizant.ormLearning.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
    List<Country> findByNameContainingIgnoreCase(String name);

    List<Country> findByNameStartingWith(String prefix);

    List<Country> findByNameEndingWith(String suffix);

    List<Country> findByNameLike(String pattern);

    Country findByCode(String code);

    @Query("FROM Country")
    List<Country> getAllCountriesHQL();

    @Query("FROM Country c WHERE c.code=:code")
    Country getCountryByCodeHQL(@Param("code") String code);

    @Query(value = "SELECT * FROM country",
            nativeQuery = true)
    List<Country> getAllCountriesNative();

    @Query(value =
            "SELECT * FROM country WHERE co_code=:code",
            nativeQuery = true)
    Country getCountryNative(@Param("code") String code);
}
