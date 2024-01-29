package com.iris.avilaTapas.feature.tapas.presentation;
import java.util.ArrayList;

import com.iris.avilaTapas.feature.tapas.data.TapaDataRepository;
import com.iris.avilaTapas.feature.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {
    public static void printTapas(){
        GetAllTapasUseCase tapasUseCase = new GetAllTapasUseCase(TapaDataRepository.newInstancia());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        System.out.println(tapas.toString());

    }
    public static void printTapa(String tapaId){
        GetOneTapaUseCase getOneTapaUseCase = new GetOneTapaUseCase(TapaDataRepository.newInstancia());
        Tapa tapa = getOneTapaUseCase.execute(tapaId);
       System.out.println(tapa.toString());
    }
    public static void deleteTapa(String tapaId){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstancia());
        deleteTapaUseCase.execute(tapaId);
        printTapas();
    }
    public static void addTapa(Tapa tapa){
       AddTapaUseCase addTapaUseCase = new AddTapaUseCase(TapaDataRepository.newInstancia());
        addTapaUseCase.execute(tapa);
        printTapas();
        System.out.println("f");
    }
    public static void modifyTapa(String tapaId,String nombre,double precio,String alergenos,String urlImg){
        ModifyTapaUseCase modifyTapaUseCase = new ModifyTapaUseCase(TapaDataRepository.newInstancia());
        modifyTapaUseCase.execute(tapaId,nombre,precio,alergenos,urlImg);
        System.out.println("f");
    }
}
