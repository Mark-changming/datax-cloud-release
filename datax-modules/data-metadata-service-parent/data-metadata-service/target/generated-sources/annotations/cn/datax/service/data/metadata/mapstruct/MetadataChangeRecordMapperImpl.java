package cn.datax.service.data.metadata.mapstruct;

import cn.datax.service.data.metadata.api.dto.MetadataChangeRecordDto;
import cn.datax.service.data.metadata.api.entity.MetadataChangeRecordEntity;
import cn.datax.service.data.metadata.api.vo.MetadataChangeRecordVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T10:09:06+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_321 (Oracle Corporation)"
)
@Component
public class MetadataChangeRecordMapperImpl implements MetadataChangeRecordMapper {

    @Override
    public MetadataChangeRecordDto toDTO(MetadataChangeRecordEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataChangeRecordDto metadataChangeRecordDto = new MetadataChangeRecordDto();

        metadataChangeRecordDto.setId( e.getId() );
        metadataChangeRecordDto.setVersion( e.getVersion() );
        metadataChangeRecordDto.setObjectType( e.getObjectType() );
        metadataChangeRecordDto.setObjectId( e.getObjectId() );
        metadataChangeRecordDto.setFieldName( e.getFieldName() );
        metadataChangeRecordDto.setFieldOldValue( e.getFieldOldValue() );
        metadataChangeRecordDto.setFieldNewValue( e.getFieldNewValue() );
        metadataChangeRecordDto.setStatus( e.getStatus() );
        metadataChangeRecordDto.setRemark( e.getRemark() );

        return metadataChangeRecordDto;
    }

    @Override
    public List<MetadataChangeRecordDto> toDTO(List<MetadataChangeRecordEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataChangeRecordDto> list = new ArrayList<MetadataChangeRecordDto>( es.size() );
        for ( MetadataChangeRecordEntity metadataChangeRecordEntity : es ) {
            list.add( toDTO( metadataChangeRecordEntity ) );
        }

        return list;
    }

    @Override
    public MetadataChangeRecordVo toVO(MetadataChangeRecordEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataChangeRecordVo metadataChangeRecordVo = new MetadataChangeRecordVo();

        metadataChangeRecordVo.setId( e.getId() );
        metadataChangeRecordVo.setStatus( e.getStatus() );
        metadataChangeRecordVo.setCreateTime( e.getCreateTime() );
        metadataChangeRecordVo.setVersion( e.getVersion() );
        metadataChangeRecordVo.setObjectType( e.getObjectType() );
        metadataChangeRecordVo.setObjectId( e.getObjectId() );
        metadataChangeRecordVo.setFieldName( e.getFieldName() );
        metadataChangeRecordVo.setFieldOldValue( e.getFieldOldValue() );
        metadataChangeRecordVo.setFieldNewValue( e.getFieldNewValue() );
        metadataChangeRecordVo.setSourceId( e.getSourceId() );
        metadataChangeRecordVo.setSourceName( e.getSourceName() );
        metadataChangeRecordVo.setTableId( e.getTableId() );
        metadataChangeRecordVo.setTableName( e.getTableName() );

        return metadataChangeRecordVo;
    }

    @Override
    public List<MetadataChangeRecordVo> toVO(List<MetadataChangeRecordEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataChangeRecordVo> list = new ArrayList<MetadataChangeRecordVo>( es.size() );
        for ( MetadataChangeRecordEntity metadataChangeRecordEntity : es ) {
            list.add( toVO( metadataChangeRecordEntity ) );
        }

        return list;
    }

    @Override
    public MetadataChangeRecordEntity toEntity(MetadataChangeRecordDto d) {
        if ( d == null ) {
            return null;
        }

        MetadataChangeRecordEntity metadataChangeRecordEntity = new MetadataChangeRecordEntity();

        metadataChangeRecordEntity.setId( d.getId() );
        metadataChangeRecordEntity.setStatus( d.getStatus() );
        metadataChangeRecordEntity.setRemark( d.getRemark() );
        metadataChangeRecordEntity.setVersion( d.getVersion() );
        metadataChangeRecordEntity.setObjectType( d.getObjectType() );
        metadataChangeRecordEntity.setObjectId( d.getObjectId() );
        metadataChangeRecordEntity.setFieldName( d.getFieldName() );
        metadataChangeRecordEntity.setFieldOldValue( d.getFieldOldValue() );
        metadataChangeRecordEntity.setFieldNewValue( d.getFieldNewValue() );

        return metadataChangeRecordEntity;
    }

    @Override
    public List<MetadataChangeRecordEntity> toEntity(List<MetadataChangeRecordDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<MetadataChangeRecordEntity> list = new ArrayList<MetadataChangeRecordEntity>( ds.size() );
        for ( MetadataChangeRecordDto metadataChangeRecordDto : ds ) {
            list.add( toEntity( metadataChangeRecordDto ) );
        }

        return list;
    }
}
