package com.example.anthony.chap7_opendata.model.beans;

/**
 * Created by booth09-mgr2 on 22/03/2017.
 */

public class Record {

    //Attention ici le nom de la variable « fields » est le nom choisi par le serveur qu'on appelle, on ne peut pas lui en donner un autre
    private Fields fields;

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}
