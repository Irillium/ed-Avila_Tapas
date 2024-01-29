package com.iris.avilaTapas.feature;

import com.iris.avilaTapas.feature.tapas.domain.Tapa;
import com.iris.avilaTapas.feature.tapas.presentation.MainTapa;

public class Main {
    public static void main(String[] args) {
        MainTapa.printTapas();
        MainTapa.printTapa("02");
        MainTapa.deleteTapa("01");
        MainTapa.addTapa(new Tapa("03","fjif",3.74,"d","https://jfuf"));
        MainTapa.modifyTapa("03","Sopita",6.90,"soja","https://tapas/sopita");
    }
}