package com.iris.avilaTapas.feature.tapas.presentation;
import java.util.ArrayList;

import com.iris.avilaTapas.feature.tapas.data.TapaDataRepository;
import com.iris.avilaTapas.feature.tapas.domain.DeleteTapaUseCase;
import com.iris.avilaTapas.feature.tapas.domain.GetAllTapasUseCase;
import com.iris.avilaTapas.feature.tapas.domain.GetOneTapaUseCase;
import com.iris.avilaTapas.feature.tapas.domain.Tapa;

import java.util.ArrayList;

public class MainTapa {
    public static void printTapas(){
        GetAllTapasUseCase tapasUseCase = new GetAllTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        System.out.println(tapas.toString());

    }
    public static void printTapa(String tapaId){
        GetOneTapaUseCase getOneTapaUseCase = new GetOneTapaUseCase(new TapaDataRepository());
        Tapa tapa = getOneTapaUseCase.execute(tapaId);
       System.out.println(tapa.toString());
    }
    public static void deleteTapa(String tapaId){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas  = deleteTapaUseCase.execute(tapaId);
        System.out.println(tapas.toString());
    }
}
