package com.intuit.playerdb.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Baselines {

    private List<Baseline> baselines;
    public Baselines() {
        this.baselines = new ArrayList<>();
    }
}
