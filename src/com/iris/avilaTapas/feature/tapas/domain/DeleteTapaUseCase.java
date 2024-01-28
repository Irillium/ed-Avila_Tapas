package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class DeleteTapaUseCase {
    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public ArrayList<Tapa> execute(String tapaId){
        return tapaRepository.deleteTapa(tapaId);
    }
}
