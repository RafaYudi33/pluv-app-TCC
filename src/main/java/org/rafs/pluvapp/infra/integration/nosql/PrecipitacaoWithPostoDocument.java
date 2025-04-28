package org.rafs.pluvapp.infra.integration.nosql;


import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;

import java.util.Map;

public record PrecipitacaoWithPostoDocument(String id,
                                            int ano,
                                            int mes,
                                            Map<String, Integer> dados,
                                            PostoDocument posto)  {
}
