package org.rafs.pluvapp.infra.persistence.entity.nosql;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "postos")
public class PostoDocument {

    @Id
    private String id;

    private String nome;
    private String municipio;
    private String bacia;
    private int altitude;
    private int latitude;
    private int longitude; 
    private int ano_inicial;
    private int ano_final;
    private int intervalo;
    private String consistencia;


    public PostoDocument(String id, String nome, String municipio, String bacia, int altitude, int latitude, int longitude, int ano_inicial, int ano_final, int intervalo, String consistencia) {
        this.id = id;
        this.nome = nome;
        this.municipio = municipio;
        this.bacia = bacia;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ano_inicial = ano_inicial;
        this.ano_final = ano_final;
        this.intervalo = intervalo;
        this.consistencia = consistencia;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBacia() {
        return bacia;
    }

    public void setBacia(String bacia) {
        this.bacia = bacia;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getAno_inicial() {
        return ano_inicial;
    }

    public void setAno_inicial(int ano_inicial) {
        this.ano_inicial = ano_inicial;
    }

    public int getAno_final() {
        return ano_final;
    }

    public void setAno_final(int ano_final) {
        this.ano_final = ano_final;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public String getConsistencia() {
        return consistencia;
    }

    public void setConsistencia(String consistencia) {
        this.consistencia = consistencia;
    }
}
