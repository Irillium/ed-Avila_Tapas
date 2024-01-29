package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class AddTapaUseCase {
    private TapaRepository tapaRepository;

    public AddTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(Tapa tapa){
        return tapaRepository.addTapa(tapa);
    }
}
