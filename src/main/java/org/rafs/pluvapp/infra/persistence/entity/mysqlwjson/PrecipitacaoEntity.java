package org.rafs.pluvapp.infra.persistence.entity.mysqlwjson;


import jakarta.persistence.*;
import org.rafs.pluvapp.infra.converter.PrecipitacaoMysqlJsonConverter;

import java.util.Map;

@Entity(name = "precip_mysql_json")
@Table(name = "precipitacao_json")
public class PrecipitacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postoId;
    private int ano;
    private int mes;

    @Convert(converter = PrecipitacaoMysqlJsonConverter.class)
    @Column(columnDefinition = "json")
    private Map<String, Integer> dados;

    public PrecipitacaoEntity(Long id, String postoId, int ano, int mes, Map<String, Integer> dados) {
        this.id = id;
        this.postoId = postoId;
        this.ano = ano;
        this.mes = mes;
        this.dados = dados;
    }

    public PrecipitacaoEntity() {}

    public String getPostoId() {
        return postoId;
    }

    public void setPostoId(String postoId) {
        this.postoId = postoId;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
