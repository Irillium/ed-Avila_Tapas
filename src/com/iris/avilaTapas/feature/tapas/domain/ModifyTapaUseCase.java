package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class ModifyTapaUseCase {
    private TapaRepository tapaRepository;

    public ModifyTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(String tapaId,String nombre,double precio,String alergenos,String urlImg){
        return tapaRepository.obtainTapas();
    }
}
