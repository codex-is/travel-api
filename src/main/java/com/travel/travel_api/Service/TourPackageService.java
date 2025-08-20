package com.travel.travel_api.Service;

import com.travel.travel_api.Entity.TourPackage;
import com.travel.travel_api.Repository.TourPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageService {
    private final TourPackageRepository repository;

    public TourPackageService(TourPackageRepository repository) {
        this.repository = repository;
    }

    public TourPackage createTour(TourPackage tour){
        return repository.save(tour);
    }
    public List<TourPackage> getAllTours(){
        return repository.findAll();
    }
    public TourPackage getTourById(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<TourPackage> searchByLocation(String location){
        return repository.findByLocationIgnoreCase(location);
    }


}
