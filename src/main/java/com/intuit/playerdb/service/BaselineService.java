package com.intuit.playerdb.service;

import com.intuit.playerdb.model.Baseline;
import com.intuit.playerdb.model.Baselines;

import java.util.List;

public interface BaselineService {

    Baselines getAllBaseline();

    Baseline getBaselineById(Long id);
    Baseline addNewBaseline(Baseline baseline);

    List<Baseline> getBaselineByBirthCountry(String birthCountry);
}
