package com.games.gamefeature.service;

import com.games.gamefeature.entity.Feature;
import com.games.gamefeature.repository.FeatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final FeatureRepository featureRepository;

    public FeatureService(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    public List<Feature> getAllFeatures() {
        return featureRepository.findAll();
    }

    public Feature getFeatureById(Long id) {
        return featureRepository.findById(id).orElse(null);
    }

    public Feature createFeature(Feature feature) {
        return featureRepository.save(feature);
    }

    public Feature updateFeature(Long id, Feature updatedFeature) {
        Feature feature = featureRepository.findById(id).orElse(null);

        if (feature == null) {
            return null;
        }

        feature.setName(updatedFeature.getName());
        feature.setEnabled(updatedFeature.getEnabled());
        feature.setGame(updatedFeature.getGame());

        return featureRepository.save(feature);
    }

    public void deleteFeature(Long id) {
        featureRepository.deleteById(id);
    }

}