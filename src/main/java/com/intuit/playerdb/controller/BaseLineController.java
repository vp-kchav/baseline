package com.intuit.playerdb.controller;

import com.intuit.playerdb.model.Baseline;
import com.intuit.playerdb.model.Baselines;
import com.intuit.playerdb.service.BaselineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping(value = "v1/baselines",  produces = "application/json")
public class BaseLineController {

    @Autowired
    BaselineService baselineService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Baselines> getAllBaseline() {
        Baselines baselines = baselineService.getAllBaseline();
        return ok(baselines);
    }

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Baseline> getBaselineById(@PathVariable Long id) {
        Baseline baseline = baselineService.getBaselineById(id);
        return new ResponseEntity<>(baseline, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Baseline> addNewBaseline(@RequestBody Baseline baseline) {
        Baseline saved = baselineService.addNewBaseline(baseline);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }


    @GetMapping(value = "/birth/{birthCountry}")
    public ResponseEntity<List<Baseline>> getBaselineBCountryBirth(@PathVariable String birthCountry) {
        return new ResponseEntity<>(baselineService.getBaselineByBirthCountry(birthCountry), HttpStatus.OK);
    }

}
