package com.iris.avilaTapas.feature.tapas.domain;

public class GetOneTapaUseCase {
    private TapaRepository tapaRepository;

    public GetOneTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public Tapa execute(String tapaId){
        return this.tapaRepository.obtainTapa(tapaId);
    }
}
