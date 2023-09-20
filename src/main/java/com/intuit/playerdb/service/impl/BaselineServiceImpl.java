package com.intuit.playerdb.service.impl;

import com.intuit.playerdb.model.Baseline;
import com.intuit.playerdb.model.Baselines;
import com.intuit.playerdb.repository.BaselineRepository;
import com.intuit.playerdb.service.BaselineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaselineServiceImpl implements BaselineService {

    @Autowired
    BaselineRepository baselineRepository;

    @Override
    public Baselines getAllBaseline() {
        Baselines baselinesDb = new Baselines();
        List<Baseline> baselines = baselineRepository.findAll();
        baselines.forEach(baselinesDb.getBaselines()::add);
        return baselinesDb;
    }

    @Override
    public Baseline getBaselineById(Long id) {
        return baselineRepository.getById(id);
    }

    @Override
    public Baseline addNewBaseline(Baseline baseline) {
        return baselineRepository.save(baseline);
    }

    @Override
    public List<Baseline> getBaselineByBirthCountry(String birthCountry) {
        return baselineRepository.findBaselineByBirthCountry(birthCountry);
    }
}
