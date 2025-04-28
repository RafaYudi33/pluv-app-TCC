package org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.rafs.pluvapp.infra.converter.PrecipitacaoJsonConverter;

import java.util.Map;

@Entity(name = "precip_pg_jsonb")
@Table(name = "precipitacao_jsonb")
public class PrecipitacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "posto_id", nullable = false)
    @JsonIgnore
    private PostoEntity posto;

    private int ano;
    private int mes;

    @Convert(converter = PrecipitacaoJsonConverter.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Integer> dados;

    public PrecipitacaoEntity(Long id, PostoEntity posto, int ano, int mes, Map<String, Integer> dados) {
        this.id = id;
        this.posto = posto;
        this.ano = ano;
        this.mes = mes;
        this.dados = dados;
    }

    public PrecipitacaoEntity() {}

    public PostoEntity getPosto() {
        return posto;
    }

    public void setPosto(PostoEntity posto) {
        this.posto = posto;
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
