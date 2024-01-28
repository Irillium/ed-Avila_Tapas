package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public class GetAllTapasUseCase {
    private TapaRepository tapaRepository;

    public GetAllTapasUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();
    }
}
