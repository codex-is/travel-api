package com.travel.travel_api.Repository;

import com.travel.travel_api.Entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {
    List<TourPackage> findByLocationIgnoreCase(String location);
}