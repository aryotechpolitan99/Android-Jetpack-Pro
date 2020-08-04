package com.aryotech.myunittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MainViewModelTest {

    private MainViewModel mainViewModel;
    private CuboiModel cuboiModel;

    private final double dummyLength = 12.0;
    private final double dummyWidth = 7.0;
    private final double dummyHeight = 6.0;
    private final double dummyVolume = 504.0;
    private final double dummyCircumference = 100.0;
    private final double dummySurfaceArea = 396.0;

    @Before
    public void before(){

        cuboiModel = mock(CuboiModel.class);
        mainViewModel = new MainViewModel(cuboiModel);
    }

    @Test
    public void save() {
    }

    @Test
    public void getCircumference() {

        cuboiModel = new CuboiModel();
        mainViewModel = new MainViewModel(cuboiModel);
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight);
        double volume = mainViewModel.getCircumference();
        assertEquals(dummyCircumference, volume, 0.0001);
    }

    @Test
    public void getSurfaceArea() {

        cuboiModel = new CuboiModel();
        mainViewModel = new MainViewModel(cuboiModel);
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight);
        double volume = mainViewModel.getSurfaceArea();
        assertEquals(dummySurfaceArea, volume, 0.0001);
    }

    @Test
    public void getVolume() {

        cuboiModel = new CuboiModel();
        mainViewModel = new MainViewModel(cuboiModel);
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight);
        double volume = mainViewModel.getVolume();
        assertEquals(dummyVolume, volume, 0.0001);
    }
}