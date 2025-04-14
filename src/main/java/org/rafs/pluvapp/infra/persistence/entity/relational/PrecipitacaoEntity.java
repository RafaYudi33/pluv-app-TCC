package org.rafs.pluvapp.infra.persistence.entity.relational;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity(name = "precip_relational")
@Table(name = "precipitacao")
public class PrecipitacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "posto_id", nullable = false)
    @JsonIgnore
    private PostoEntity posto;

    private int ano;
    private int mes;

    private Integer dia1;
    private Integer dia2;
    private Integer dia3;
    private Integer dia4;
    private Integer dia5;
    private Integer dia6;
    private Integer dia7;
    private Integer dia8;
    private Integer dia9;
    private Integer dia10;
    private Integer dia11;
    private Integer dia12;
    private Integer dia13;
    private Integer dia14;
    private Integer dia15;
    private Integer dia16;
    private Integer dia17;
    private Integer dia18;
    private Integer dia19;
    private Integer dia20;
    private Integer dia21;
    private Integer dia22;
    private Integer dia23;
    private Integer dia24;
    private Integer dia25;
    private Integer dia26;
    private Integer dia27;
    private Integer dia28;
    private Integer dia29;
    private Integer dia30;
    private Integer dia31;

    public PrecipitacaoEntity(){}

    public PrecipitacaoEntity(Integer id, PostoEntity posto, int ano, int mes, Integer dia1, Integer dia2, Integer dia3, Integer dia4, Integer dia5, Integer dia6, Integer dia7, Integer dia8, Integer dia9, Integer dia10, Integer dia11, Integer dia12, Integer dia13, Integer dia14, Integer dia15, Integer dia16, Integer dia17, Integer dia18, Integer dia19, Integer dia20, Integer dia21, Integer dia22, Integer dia23, Integer dia24, Integer dia25, Integer dia26, Integer dia27, Integer dia28, Integer dia29, Integer dia30, Integer dia31) {
        this.id = id;
        this.posto = posto;
        this.ano = ano;
        this.mes = mes;
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.dia3 = dia3;
        this.dia4 = dia4;
        this.dia5 = dia5;
        this.dia6 = dia6;
        this.dia7 = dia7;
        this.dia8 = dia8;
        this.dia9 = dia9;
        this.dia10 = dia10;
        this.dia11 = dia11;
        this.dia12 = dia12;
        this.dia13 = dia13;
        this.dia14 = dia14;
        this.dia15 = dia15;
        this.dia16 = dia16;
        this.dia17 = dia17;
        this.dia18 = dia18;
        this.dia19 = dia19;
        this.dia20 = dia20;
        this.dia21 = dia21;
        this.dia22 = dia22;
        this.dia23 = dia23;
        this.dia24 = dia24;
        this.dia25 = dia25;
        this.dia26 = dia26;
        this.dia27 = dia27;
        this.dia28 = dia28;
        this.dia29 = dia29;
        this.dia30 = dia30;
        this.dia31 = dia31;
    }

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

    public Integer getDia1() {
        return dia1;
    }

    public void setDia1(Integer dia1) {
        this.dia1 = dia1;
    }

    public Integer getDia2() {
        return dia2;
    }

    public void setDia2(Integer dia2) {
        this.dia2 = dia2;
    }

    public Integer getDia3() {
        return dia3;
    }

    public void setDia3(Integer dia3) {
        this.dia3 = dia3;
    }

    public Integer getDia4() {
        return dia4;
    }

    public void setDia4(Integer dia4) {
        this.dia4 = dia4;
    }

    public Integer getDia5() {
        return dia5;
    }

    public void setDia5(Integer dia5) {
        this.dia5 = dia5;
    }

    public Integer getDia6() {
        return dia6;
    }

    public void setDia6(Integer dia6) {
        this.dia6 = dia6;
    }

    public Integer getDia7() {
        return dia7;
    }

    public void setDia7(Integer dia7) {
        this.dia7 = dia7;
    }

    public Integer getDia8() {
        return dia8;
    }

    public void setDia8(Integer dia8) {
        this.dia8 = dia8;
    }

    public Integer getDia9() {
        return dia9;
    }

    public void setDia9(Integer dia9) {
        this.dia9 = dia9;
    }

    public Integer getDia10() {
        return dia10;
    }

    public void setDia10(Integer dia10) {
        this.dia10 = dia10;
    }

    public Integer getDia11() {
        return dia11;
    }

    public void setDia11(Integer dia11) {
        this.dia11 = dia11;
    }

    public Integer getDia12() {
        return dia12;
    }

    public void setDia12(Integer dia12) {
        this.dia12 = dia12;
    }

    public Integer getDia13() {
        return dia13;
    }

    public void setDia13(Integer dia13) {
        this.dia13 = dia13;
    }

    public Integer getDia14() {
        return dia14;
    }

    public void setDia14(Integer dia14) {
        this.dia14 = dia14;
    }

    public Integer getDia15() {
        return dia15;
    }

    public void setDia15(Integer dia15) {
        this.dia15 = dia15;
    }

    public Integer getDia16() {
        return dia16;
    }

    public void setDia16(Integer dia16) {
        this.dia16 = dia16;
    }

    public Integer getDia17() {
        return dia17;
    }

    public void setDia17(Integer dia17) {
        this.dia17 = dia17;
    }

    public Integer getDia18() {
        return dia18;
    }

    public void setDia18(Integer dia18) {
        this.dia18 = dia18;
    }

    public Integer getDia19() {
        return dia19;
    }

    public void setDia19(Integer dia19) {
        this.dia19 = dia19;
    }

    public Integer getDia20() {
        return dia20;
    }

    public void setDia20(Integer dia20) {
        this.dia20 = dia20;
    }

    public Integer getDia21() {
        return dia21;
    }

    public void setDia21(Integer dia21) {
        this.dia21 = dia21;
    }

    public Integer getDia22() {
        return dia22;
    }

    public void setDia22(Integer dia22) {
        this.dia22 = dia22;
    }

    public Integer getDia23() {
        return dia23;
    }

    public void setDia23(Integer dia23) {
        this.dia23 = dia23;
    }

    public Integer getDia24() {
        return dia24;
    }

    public void setDia24(Integer dia24) {
        this.dia24 = dia24;
    }

    public Integer getDia25() {
        return dia25;
    }

    public void setDia25(Integer dia25) {
        this.dia25 = dia25;
    }

    public Integer getDia26() {
        return dia26;
    }

    public void setDia26(Integer dia26) {
        this.dia26 = dia26;
    }

    public Integer getDia27() {
        return dia27;
    }

    public void setDia27(Integer dia27) {
        this.dia27 = dia27;
    }

    public Integer getDia28() {
        return dia28;
    }

    public void setDia28(Integer dia28) {
        this.dia28 = dia28;
    }

    public Integer getDia29() {
        return dia29;
    }

    public void setDia29(Integer dia29) {
        this.dia29 = dia29;
    }

    public Integer getDia30() {
        return dia30;
    }

    public void setDia30(Integer dia30) {
        this.dia30 = dia30;
    }

    public Integer getDia31() {
        return dia31;
    }

    public void setDia31(Integer dia31) {
        this.dia31 = dia31;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
