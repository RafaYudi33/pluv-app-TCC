package org.rafs.pluvapp.infra.gateway.Mapper;

import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.integration.hybrid.PrecipitacaoWithPostoEntity;
import org.rafs.pluvapp.infra.integration.nosql.PrecipitacaoWithPostoDocument;
import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.rafs.pluvapp.infra.persistence.entity.hybrid.PrecipitacaoDocument;
import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public Precipitacao toPrecipitacaoDomainObj(org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity precipitacaoEntity) {
        Map<String, Integer> dados = precipitacaoEntity.getDados();

        return new Precipitacao(
                postoMapper.toPostoDomainObj(precipitacaoEntity.getPosto()),
                precipitacaoEntity.getAno(),
                precipitacaoEntity.getMes(),
                dados.get("dia1"), dados.get("dia2"), dados.get("dia3"),
                dados.get("dia4"), dados.get("dia5"), dados.get("dia6"),
                dados.get("dia7"), dados.get("dia8"), dados.get("dia9"),
                dados.get("dia10"), dados.get("dia11"), dados.get("dia12"),
                dados.get("dia13"), dados.get("dia14"), dados.get("dia15"),
                dados.get("dia16"), dados.get("dia17"), dados.get("dia18"),
                dados.get("dia19"), dados.get("dia20"), dados.get("dia21"),
                dados.get("dia22"), dados.get("dia23"), dados.get("dia24"),
                dados.get("dia25"), dados.get("dia26"), dados.get("dia27"),
                dados.get("dia28"), dados.get("dia29"), dados.get("dia30"),
                dados.get("dia31")

        );
    }

    public Precipitacao toPrecipitacaoDomainObj(org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PrecipitacaoEntity precipitacaoEntity) {
        Map<String, Integer> dados = precipitacaoEntity.getDados();

        return new Precipitacao(
                postoMapper.toPostoDomainObj(precipitacaoEntity.getPosto()),
                precipitacaoEntity.getAno(),
                precipitacaoEntity.getMes(),
                dados.get("dia1"), dados.get("dia2"), dados.get("dia3"),
                dados.get("dia4"), dados.get("dia5"), dados.get("dia6"),
                dados.get("dia7"), dados.get("dia8"), dados.get("dia9"),
                dados.get("dia10"), dados.get("dia11"), dados.get("dia12"),
                dados.get("dia13"), dados.get("dia14"), dados.get("dia15"),
                dados.get("dia16"), dados.get("dia17"), dados.get("dia18"),
                dados.get("dia19"), dados.get("dia20"), dados.get("dia21"),
                dados.get("dia22"), dados.get("dia23"), dados.get("dia24"),
                dados.get("dia25"), dados.get("dia26"), dados.get("dia27"),
                dados.get("dia28"), dados.get("dia29"), dados.get("dia30"),
                dados.get("dia31")

        );
    }

    public Precipitacao toPrecipitacaoDomainObj(PrecipitacaoWithPostoDocument precipitacaoWithPosto) {
        Map<String, Integer> dados = precipitacaoWithPosto.dados();

        return new Precipitacao(
                postoMapper.toPostoDomainObj(precipitacaoWithPosto.posto()),
                precipitacaoWithPosto.ano(),
                precipitacaoWithPosto.mes(),
                dados.get("dia1"), dados.get("dia2"), dados.get("dia3"),
                dados.get("dia4"), dados.get("dia5"), dados.get("dia6"),
                dados.get("dia7"), dados.get("dia8"), dados.get("dia9"),
                dados.get("dia10"), dados.get("dia11"), dados.get("dia12"),
                dados.get("dia13"), dados.get("dia14"), dados.get("dia15"),
                dados.get("dia16"), dados.get("dia17"), dados.get("dia18"),
                dados.get("dia19"), dados.get("dia20"), dados.get("dia21"),
                dados.get("dia22"), dados.get("dia23"), dados.get("dia24"),
                dados.get("dia25"), dados.get("dia26"), dados.get("dia27"),
                dados.get("dia28"), dados.get("dia29"), dados.get("dia30"),
                dados.get("dia31")
        );
    }

    public Precipitacao toPrecipitacaoDomainObj(PrecipitacaoWithPostoEntity precipitacaoWithPosto) {
        Map<String, Integer> dados = precipitacaoWithPosto.dados();

        return new Precipitacao(
                postoMapper.toPostoDomainObj(precipitacaoWithPosto.posto()),
                precipitacaoWithPosto.ano(),
                precipitacaoWithPosto.mes(),
                dados.get("dia1"), dados.get("dia2"), dados.get("dia3"),
                dados.get("dia4"), dados.get("dia5"), dados.get("dia6"),
                dados.get("dia7"), dados.get("dia8"), dados.get("dia9"),
                dados.get("dia10"), dados.get("dia11"), dados.get("dia12"),
                dados.get("dia13"), dados.get("dia14"), dados.get("dia15"),
                dados.get("dia16"), dados.get("dia17"), dados.get("dia18"),
                dados.get("dia19"), dados.get("dia20"), dados.get("dia21"),
                dados.get("dia22"), dados.get("dia23"), dados.get("dia24"),
                dados.get("dia25"), dados.get("dia26"), dados.get("dia27"),
                dados.get("dia28"), dados.get("dia29"), dados.get("dia30"),
                dados.get("dia31")
        );
    }


    public List<Precipitacao> toListPrecipitacaoDomainObjFromRelational(List<PrecipitacaoEntity> precipitacaoEntityList) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (PrecipitacaoEntity precipitacaoEntity : precipitacaoEntityList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoEntity));
        }
        return precipitacaoList;
    }

    public List<Precipitacao> toListPrecipitacaoDomainObjFromMysqlJson(
            List<org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity> precipitacaoEntityList
    ) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity precipitacaoEntity : precipitacaoEntityList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoEntity));
        }
        return precipitacaoList;
    }


    public List<Precipitacao> toListPrecipitacaoDomainObjFromPostgresJsonb(
            List<org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PrecipitacaoEntity> precipitacaoEntityList
    ) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PrecipitacaoEntity precipitacaoEntity : precipitacaoEntityList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoEntity));
        }
        return precipitacaoList;
    }


    public List<Precipitacao> toListPrecipitacaoDomainObjFromNosqlIntegrationObj(
            List<PrecipitacaoWithPostoDocument> precipitacaoWithPostoDocumentList
    ) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (PrecipitacaoWithPostoDocument precipitacaoWithPosto : precipitacaoWithPostoDocumentList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoWithPosto));
        }

        return precipitacaoList;
    }


    public List<Precipitacao> toListPrecipitacaoDomainObjFromHybridIntegrationObj(List<PrecipitacaoWithPostoEntity> precipitacaoWithPostoList) {
        List<Precipitacao> precipitacaoList = new ArrayList<>();

        for (PrecipitacaoWithPostoEntity precipitacaoWithPosto : precipitacaoWithPostoList) {
            precipitacaoList.add(toPrecipitacaoDomainObj(precipitacaoWithPosto));
        }

        return precipitacaoList;
    }
}
