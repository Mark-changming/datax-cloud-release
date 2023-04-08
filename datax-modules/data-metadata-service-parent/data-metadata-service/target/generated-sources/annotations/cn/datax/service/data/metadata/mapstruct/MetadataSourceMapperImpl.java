package cn.datax.service.data.metadata.mapstruct;

import cn.datax.service.data.metadata.api.dto.MetadataSourceDto;
import cn.datax.service.data.metadata.api.entity.MetadataSourceEntity;
import cn.datax.service.data.metadata.api.vo.MetadataSourceVo;
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
public class MetadataSourceMapperImpl implements MetadataSourceMapper {

    @Override
    public MetadataSourceDto toDTO(MetadataSourceEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataSourceDto metadataSourceDto = new MetadataSourceDto();

        metadataSourceDto.setId( e.getId() );
        metadataSourceDto.setDbType( e.getDbType() );
        metadataSourceDto.setSourceName( e.getSourceName() );
        metadataSourceDto.setDbSchema( e.getDbSchema() );
        metadataSourceDto.setStatus( e.getStatus() );
        metadataSourceDto.setRemark( e.getRemark() );

        return metadataSourceDto;
    }

    @Override
    public List<MetadataSourceDto> toDTO(List<MetadataSourceEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataSourceDto> list = new ArrayList<MetadataSourceDto>( es.size() );
        for ( MetadataSourceEntity metadataSourceEntity : es ) {
            list.add( toDTO( metadataSourceEntity ) );
        }

        return list;
    }

    @Override
    public MetadataSourceVo toVO(MetadataSourceEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataSourceVo metadataSourceVo = new MetadataSourceVo();

        metadataSourceVo.setId( e.getId() );
        metadataSourceVo.setStatus( e.getStatus() );
        metadataSourceVo.setCreateTime( e.getCreateTime() );
        metadataSourceVo.setRemark( e.getRemark() );
        metadataSourceVo.setDbType( e.getDbType() );
        metadataSourceVo.setSourceName( e.getSourceName() );
        metadataSourceVo.setDbSchema( e.getDbSchema() );
        metadataSourceVo.setIsSync( e.getIsSync() );

        return metadataSourceVo;
    }

    @Override
    public List<MetadataSourceVo> toVO(List<MetadataSourceEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataSourceVo> list = new ArrayList<MetadataSourceVo>( es.size() );
        for ( MetadataSourceEntity metadataSourceEntity : es ) {
            list.add( toVO( metadataSourceEntity ) );
        }

        return list;
    }

    @Override
    public MetadataSourceEntity toEntity(MetadataSourceDto d) {
        if ( d == null ) {
            return null;
        }

        MetadataSourceEntity metadataSourceEntity = new MetadataSourceEntity();

        metadataSourceEntity.setId( d.getId() );
        metadataSourceEntity.setStatus( d.getStatus() );
        metadataSourceEntity.setRemark( d.getRemark() );
        metadataSourceEntity.setDbType( d.getDbType() );
        metadataSourceEntity.setSourceName( d.getSourceName() );
        metadataSourceEntity.setDbSchema( d.getDbSchema() );

        return metadataSourceEntity;
    }

    @Override
    public List<MetadataSourceEntity> toEntity(List<MetadataSourceDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<MetadataSourceEntity> list = new ArrayList<MetadataSourceEntity>( ds.size() );
        for ( MetadataSourceDto metadataSourceDto : ds ) {
            list.add( toEntity( metadataSourceDto ) );
        }

        return list;
    }
}
