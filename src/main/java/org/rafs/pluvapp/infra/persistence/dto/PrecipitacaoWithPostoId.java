package org.rafs.pluvapp.infra.persistence.dto;



import java.util.Map;
import java.util.LinkedHashMap;

public class PrecipitacaoWithPostoId {
    private String posto_id;
    private int ano;
    private int mes;
    private  Map<String, Integer> dados;


    public PrecipitacaoWithPostoId(String posto_id, int ano, int mes, Map<String, Integer> dados) {
        this.posto_id = posto_id;
        this.ano = ano;
        this.mes = mes;
        this.dados = dados;
    }

    public PrecipitacaoWithPostoId() {

    }

    public PrecipitacaoWithPostoId(String postoId, int ano, int mes,
                                   Integer dia1, Integer dia2, Integer dia3, Integer dia4, Integer dia5, Integer dia6,
                                   Integer dia7, Integer dia8, Integer dia9, Integer dia10, Integer dia11, Integer dia12,
                                   Integer dia13, Integer dia14, Integer dia15, Integer dia16, Integer dia17, Integer dia18,
                                   Integer dia19, Integer dia20, Integer dia21, Integer dia22, Integer dia23, Integer dia24,
                                   Integer dia25, Integer dia26, Integer dia27, Integer dia28, Integer dia29, Integer dia30,
                                   Integer dia31) {
        this.posto_id = postoId;
        this.ano = ano;
        this.mes = mes;

        this.dados = new LinkedHashMap<>();
        dados.put("dia1", dia1);
        dados.put("dia2", dia2);
        dados.put("dia3", dia3);
        dados.put("dia4", dia4);
        dados.put("dia5", dia5);
        dados.put("dia6", dia6);
        dados.put("dia7", dia7);
        dados.put("dia8", dia8);
        dados.put("dia9", dia9);
        dados.put("dia10", dia10);
        dados.put("dia11", dia11);
        dados.put("dia12", dia12);
        dados.put("dia13", dia13);
        dados.put("dia14", dia14);
        dados.put("dia15", dia15);
        dados.put("dia16", dia16);
        dados.put("dia17", dia17);
        dados.put("dia18", dia18);
        dados.put("dia19", dia19);
        dados.put("dia20", dia20);
        dados.put("dia21", dia21);
        dados.put("dia22", dia22);
        dados.put("dia23", dia23);
        dados.put("dia24", dia24);
        dados.put("dia25", dia25);
        dados.put("dia26", dia26);
        dados.put("dia27", dia27);
        dados.put("dia28", dia28);
        dados.put("dia29", dia29);
        dados.put("dia30", dia30);
        dados.put("dia31", dia31);
    }

    public String getPosto_id() {
        return posto_id;
    }

    public void setPosto_id(String posto_id) {
        this.posto_id = posto_id;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDados(Map<String, Integer> dados) {
        this.dados = dados;
    }

    public Map<String, Integer> getDados() {
        return dados;
    }

    public int getAno() { return ano; }
    public int getMes() { return mes; }
}
