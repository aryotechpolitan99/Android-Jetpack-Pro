package com.aryotech.myunittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void testMockCircumference() {
        when(mainViewModel.getCircumference()).thenReturn(dummyCircumference);
        double volume = mainViewModel.getCircumference();
        verify(cuboiModel).getCircumference();
        assertEquals(dummyCircumference, volume, 0.0001);
    }

    @Test
    public void testMockSurfaceArea() {
        when(mainViewModel.getSurfaceArea()).thenReturn(dummySurfaceArea);
        double volume = mainViewModel.getSurfaceArea();
        verify(cuboiModel).getSurfaceArea();
        assertEquals(dummySurfaceArea, volume, 0.0001);
    }

    @Test
    public void testMockVolume() {
        when(mainViewModel.getVolume()).thenReturn(dummyVolume);
        double volume = mainViewModel.getVolume();
        verify(cuboiModel).getVolume();
        assertEquals(dummyVolume, volume, 0.0001);
    }
}