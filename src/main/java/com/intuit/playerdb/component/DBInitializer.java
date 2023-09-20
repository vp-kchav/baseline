package com.intuit.playerdb.component;

import com.intuit.playerdb.model.Baseline;
import com.intuit.playerdb.service.BaselineService;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@Component
public class DBInitializer {

    private BaselineService baselineService;
    @Autowired
    public DBInitializer(BaselineService baselineService) throws FileNotFoundException {
        this.baselineService = baselineService;
        addPlayerData();
    }

    public void addPlayerData() throws FileNotFoundException {
        String fileName = "baseline-data.csv";
        URL resource = getClass().getClassLoader().getResource(fileName);
        try (CSVReader reader = new CSVReader(new FileReader(resource.getPath()))) {
            List<String[]> r = reader.readAll();
            buildDTOFromCvs(r);
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public void buildDTOFromCvs(List<String[]> datas) {
        datas.forEach(data -> {
            Baseline baseline = new Baseline();
            baseline.setPlayerID(data[0]);
            baseline.setBirthYear(data[1]);
            baseline.setBirthMonth(data[2]);
            baseline.setBirthDay(data[3]);
            baseline.setBirthCountry(data[4]);
            baseline.setBirthState(data[5]);
            baseline.setBirthCity(data[6]);
            baselineService.addNewBaseline(baseline);
        });

    }


}
