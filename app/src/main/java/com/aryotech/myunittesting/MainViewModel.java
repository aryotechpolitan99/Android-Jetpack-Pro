package com.aryotech.myunittesting;

public class MainViewModel {

    private final CuboiModel cuboiModel;


    public MainViewModel(CuboiModel cuboiModel) {
        this.cuboiModel = cuboiModel;
    }

    void save (double l, double w, double h){
        cuboiModel.save(l,w,h);
    }

    double getCircumference(){

        return cuboiModel.getCircumference();
    }

    double getSurfaceArea(){

        return cuboiModel.getSurfaceArea();
    }

    double getVolume(){

        return cuboiModel.getVolume();
    }
}
