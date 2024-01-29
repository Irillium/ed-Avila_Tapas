package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class ModifyTapaUseCase {
    private TapaRepository tapaRepository;

    public ModifyTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public void execute(String tapaId,String nombre,double precio,String alergenos,String urlImg){
        tapaRepository.modifyTapa( tapaId, nombre, precio, alergenos, urlImg);
    }
}
