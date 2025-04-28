package org.rafs.pluvapp.infra.persistence.entity.hybrid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "precipitacao")
public class PrecipitacaoDocument {
    @Id
    private String id;

    private String posto_id;

    private int ano;
    private int mes;
    private Map<String, Integer> dados;

    public PrecipitacaoDocument() {
    }

    public PrecipitacaoDocument(String id, String posto_id, int ano, int mes, Map<String, Integer> dados) {
        this.id = id;
        this.posto_id = posto_id;
        this.ano = ano;
        this.mes = mes;
        this.dados = dados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosto_id() {
        return posto_id;
    }

    public void setPosto_id(String posto_id) {
        this.posto_id = posto_id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Map<String, Integer> getDados() {
        return dados;
    }

    public void setDados(Map<String, Integer> dados) {
        this.dados = dados;
    }
}
