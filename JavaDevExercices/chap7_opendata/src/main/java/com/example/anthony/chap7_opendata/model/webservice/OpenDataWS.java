package com.example.anthony.chap7_opendata.model.webservice;

import com.example.anthony.chap7_opendata.model.beans.Fields;
import com.example.anthony.chap7_opendata.model.beans.Record;
import com.example.anthony.chap7_opendata.model.beans.Resultat;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by booth09-mgr2 on 22/03/2017.
 */

public class OpenDataWS {

    private static final String WS_URL = "https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=agenda-des-manifestations-culturelles-so-toulouse&facet=type_de_manifestation";


    public static ArrayList<Fields> getFieldsDuServeur() throws Exception {

        //Lancer la requête
        String reponseEnJson = OkHttpUtils.sendGetOkHttpRequest(WS_URL);

        //Parser le résultat
        Gson gson = new Gson();
        Resultat resultat = gson.fromJson(reponseEnJson, Resultat.class);

        //Extraire uniquement le nécessaire à savoir les Fields
        ArrayList<Fields> fields = new ArrayList<>();
        if (resultat == null) {
            throw new Exception("Variable resultat à null");
        } else if (resultat.getRecords() != null) {
            for (Record record : resultat.getRecords()) {
                if (record.getFields() != null) {
                    fields.add(record.getFields());
                }
            }
        }

        return fields;


    }
}
