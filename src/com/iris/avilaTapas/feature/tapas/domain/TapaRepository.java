package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {
     ArrayList<Tapa> obtainTapas();
     Tapa obtainTapa(String tapaId);
     void deleteTapa(String tapaId);
     void addTapa(Tapa tapa);
     void modifyTapa(String tapaId,String nombre,double precio,String alergenos,String urlImg);
}
