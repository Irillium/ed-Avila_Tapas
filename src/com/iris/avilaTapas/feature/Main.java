package com.iris.avilaTapas.feature;

import com.iris.avilaTapas.feature.tapas.presentation.MainTapa;

public class Main {
    public static void main(String[] args) {
        MainTapa.printTapas();
        MainTapa.printTapa("02");
        MainTapa.deleteTapa("01");
    }
}