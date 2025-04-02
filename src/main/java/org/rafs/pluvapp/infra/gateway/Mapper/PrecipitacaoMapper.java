package org.rafs.pluvapp.infra.gateway.Mapper;

import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrecipitacaoMapper {

    private final PostoMapper postoMapper;

    public PrecipitacaoMapper(PostoMapper postoMapper) {
        this.postoMapper = postoMapper;
    }

    public Precipitacao toPrecipitacaoDomainObj(PrecipitacaoEntity precipitacaoEntity) {
        return new Precipitacao(
                postoMapper.toPostoDomainObj(precipitacaoEntity.getPosto()),
                precipitacaoEntity.getAno(),
                precipitacaoEntity.getMes(),
                precipitacaoEntity.getDia1(), precipitacaoEntity.getDia2(), precipitacaoEntity.getDia3(),
                precipitacaoEntity.getDia4(), precipitacaoEntity.getDia5(), precipitacaoEntity.getDia6(),
                precipitacaoEntity.getDia7(), precipitacaoEntity.getDia8(), precipitacaoEntity.getDia9(),
                precipitacaoEntity.getDia10(), precipitacaoEntity.getDia11(), precipitacaoEntity.getDia12(),
                precipitacaoEntity.getDia13(), precipitacaoEntity.getDia14(), precipitacaoEntity.getDia15(),
                precipitacaoEntity.getDia16(), precipitacaoEntity.getDia17(), precipitacaoEntity.getDia18(),
                precipitacaoEntity.getDia19(), precipitacaoEntity.getDia20(), precipitacaoEntity.getDia21(),
                precipitacaoEntity.getDia22(), precipitacaoEntity.getDia23(), precipitacaoEntity.getDia24(),
                precipitacaoEntity.getDia25(), precipitacaoEntity.getDia26(), precipitacaoEntity.getDia27(),
                precipitacaoEntity.getDia28(), precipitacaoEntity.getDia29(), precipitacaoEntity.getDia30(),
                precipitacaoEntity.getDia31()
                );
    }

    public List<Precipitacao> toListPrecipitacaoDomainObj(List<PrecipitacaoEntity> precipitacaoEntityList) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (PrecipitacaoEntity precipitacaoEntity : precipitacaoEntityList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoEntity));
        }
        return precipitacaoList;
    }
}
