package com.iris.avilaTapas.feature.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {
     ArrayList<Tapa> obtainTapas();
     Tapa obtainTapa(String tapaId);
     ArrayList<Tapa>  deleteTapa(String tapaId);
}
