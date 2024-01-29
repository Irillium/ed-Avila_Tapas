package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class DeleteTapaUseCase {
    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public void execute(String tapaId){
         tapaRepository.deleteTapa(tapaId);
    }
}
