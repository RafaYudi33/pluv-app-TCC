package org.rafs.pluvapp.domain.model;

public record Posto(String id,
                    String nome,
                    String municipio,
                    String bacia,
                    int altitude,
                    int latitude,
                    int longitude,
                    int anoInicial,
                    int anoFinal,
                    int intervalo,
                    String consistencia) {
}
