package com.games.gamefeature.controller;

import com.games.gamefeature.entity.Feature;
import com.games.gamefeature.service.FeatureService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/features")
public class FeatureController {

    private final FeatureService featureService;

    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping
    public List<Feature> getAllFeatures() {
        return featureService.getAllFeatures();
    }

    @GetMapping("/{id}")
    public Feature getFeatureById(@PathVariable Long id) {
        return featureService.getFeatureById(id);
    }

    @PostMapping
    public Feature createFeature(@Valid @RequestBody Feature feature) {
        return featureService.createFeature(feature);
    }

    @PutMapping("/{id}")
    public Feature updateFeature(@PathVariable Long id, @Valid @RequestBody Feature feature) {
        return featureService.updateFeature(id, feature);
    }

    @DeleteMapping("/{id}")
    public void deleteFeature(@PathVariable Long id) {
        featureService.deleteFeature(id);
    }

}