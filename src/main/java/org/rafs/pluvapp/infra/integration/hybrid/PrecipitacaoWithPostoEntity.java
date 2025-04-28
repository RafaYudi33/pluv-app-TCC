package org.rafs.pluvapp.infra.integration.hybrid;

import org.rafs.pluvapp.infra.persistence.entity.hybrid.PostoEntity;

import java.util.Map;

public record PrecipitacaoWithPostoEntity(String id,
                                          int ano,
                                          int mes,
                                          Map<String, Integer> dados,
                                          PostoEntity posto) {
}
