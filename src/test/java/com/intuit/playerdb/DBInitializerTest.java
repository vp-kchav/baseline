package com.intuit.playerdb;

import com.intuit.playerdb.component.DBInitializer;
import com.intuit.playerdb.model.Baseline;
import com.intuit.playerdb.service.BaselineService;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.FileNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class DBInitializerTest {

    @Mock
    private BaselineService baselineService;

    private DBInitializer dbInitializer;

    @Before
    public void init() throws FileNotFoundException {
        MockitoAnnotations.initMocks(this);
        dbInitializer = new DBInitializer((baselineService));
    }


    @Test
    @Ignore
    public void test_doubleLong_Pass() throws FileNotFoundException {
//        dbInitializer = new DBInitializer((baselineService));
//        Mockito.when(baselineService.addNewBaseline(Mockito.any())).thenReturn(new Baseline());
//        dbInitializer.addPlayerData();
    }

}
