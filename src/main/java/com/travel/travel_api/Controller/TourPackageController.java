package com.travel.travel_api.Controller;

import com.travel.travel_api.Entity.TourPackage;
import com.travel.travel_api.Service.TourPackageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tours")
public class TourPackageController {
    private final TourPackageService service; // dependency injection

    public TourPackageController(TourPackageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TourPackage> createTour(@RequestBody TourPackage tour) {
        return ResponseEntity.ok(service.createTour(tour));
    }


    @GetMapping
    public ResponseEntity<List<TourPackage>> getAllTour(@RequestParam(required = false) String location) {
        if (location != null) {
            return ResponseEntity.ok(service.searchByLocation(location));
        }
        return ResponseEntity.ok(service.getAllTours());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourPackage> getTourById(@PathVariable Long id) {
        TourPackage tour = service.getTourById(id);
        if (tour == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tour);
    }
}
