package org.rafs.pluvapp.infra.persistence.entity.mysqlwjson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity()
@Table(name = "postos")
public class PostoEntity {

    @Id
    @Column(nullable = false)
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

    @Column(columnDefinition = "TEXT")
    String consistencia;

    public PostoEntity(String id, String nome, String municipio, String bacia, int altitude, int latitude, int longitude, int ano_inicial, int ano_final, int intervalo, String consistencia) {
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

    public PostoEntity(String nome, String municipio, String bacia, int altitude, int latitude, int longitude, int ano_inicial, int ano_final, int intervalo, String consistencia) {
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

    public PostoEntity() {

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

    public void setAno_inicial(int anoInicial) {
        this.ano_inicial = anoInicial;
    }

    public int getAno_final() {
        return ano_final;
    }

    public void setAno_final(int anoFinal) {
        this.ano_final = anoFinal;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostoEntity that)) return false;
        return getAltitude() == that.getAltitude() && getLatitude() == that.getLatitude() && getLongitude() == that.getLongitude() && getAno_inicial() == that.getAno_inicial() && getAno_final() == that.getAno_final() && getIntervalo() == that.getIntervalo() && Objects.equals(getId(), that.getId()) && Objects.equals(getNome(), that.getNome()) && Objects.equals(getMunicipio(), that.getMunicipio()) && Objects.equals(getBacia(), that.getBacia()) && Objects.equals(getConsistencia(), that.getConsistencia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getMunicipio(), getBacia(), getAltitude(), getLatitude(), getLongitude(), getAno_inicial(), getAno_final(), getIntervalo(), getConsistencia());
    }
}
