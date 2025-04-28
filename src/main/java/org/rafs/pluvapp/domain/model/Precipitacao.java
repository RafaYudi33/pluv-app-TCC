package org.rafs.pluvapp.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record Precipitacao(Posto posto,
                           int ano,
                           int mes,
                           Integer dia1, Integer dia2, Integer dia3, Integer dia4, Integer dia5, Integer dia6,
                           Integer dia7, Integer dia8, Integer dia9, Integer dia10, Integer dia11, Integer dia12,
                           Integer dia13, Integer dia14, Integer dia15, Integer dia16, Integer dia17, Integer dia18,
                           Integer dia19, Integer dia20, Integer dia21, Integer dia22, Integer dia23, Integer dia24,
                           Integer dia25, Integer dia26, Integer dia27, Integer dia28, Integer dia29, Integer dia30,
                           Integer dia31) {
}
