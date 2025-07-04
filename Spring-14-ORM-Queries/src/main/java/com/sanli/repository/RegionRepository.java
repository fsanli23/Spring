package com.sanli.repository;

import com.sanli.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    //display all region in canada

    List<Region> findByCountry(String country); // select * from region where country is

    //display all region in canada without duplicates

    List<Region> findDistinctByCountry(String country);


    // display all regions with country name includes united
    List<Region> findByCountryContaining(String country);

//Display all the regions with country name includes 'united' in order

    List<Region> findByCountryContainingOrderByCountry(String country);

    //display top 2 regions in canada

    List<Region>findTop2ByCountry(String country);



}
