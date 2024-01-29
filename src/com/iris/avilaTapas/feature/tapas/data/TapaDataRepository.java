package com.iris.avilaTapas.feature.tapas.data;

import com.iris.avilaTapas.feature.tapas.domain.Tapa;
import com.iris.avilaTapas.feature.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {
    ArrayList<Tapa> localTapas = new ArrayList<>();

    public TapaDataRepository() {
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }
    @Override
    public Tapa obtainTapa(String tapaId) {


        for(Tapa tapa: localTapas){
            if(tapa.getId().equals(tapaId)){
                return tapa;
            }
        }

        return null;
    }
    @Override
    public ArrayList<Tapa> deleteTapa(String tapaId) {
        for(Tapa tapa: localTapas){
            if(tapa.getId().equals(tapaId)){
                localTapas.remove(tapa);
                return localTapas;
            }
        }
        return localTapas;
    }
    @Override
    public ArrayList<Tapa> addTapa(Tapa tapa){
        localTapas.add(tapa);
        return  localTapas;
    }
    @Override
    public Tapa modifyTapa(String tapaId,String nombre,double precio,String alergenos,String urlImg){
        for(Tapa tapa: localTapas){
            if(tapa.getId().equals(tapaId)){
                tapa.setName(nombre);
                tapa.setPrecio(precio);
                tapa.setAlergenos(alergenos);
                tapa.setUrlImg(urlImg);
                return tapa;
            }
        }
        return null;
    }
    private void initData(){
        localTapas.add(new Tapa("01","Ensaladilla Rusa tradicional",4.10, "Huevo","https//..."));
        localTapas.add(new Tapa("02","Croquetas de Boletus",5.80, "Ninguno","https//..."));
    }
}
