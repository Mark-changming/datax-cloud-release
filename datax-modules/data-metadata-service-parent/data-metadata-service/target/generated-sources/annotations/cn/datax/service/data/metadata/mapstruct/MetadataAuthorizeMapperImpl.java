package cn.datax.service.data.metadata.mapstruct;

import cn.datax.service.data.metadata.api.dto.MetadataAuthorizeDto;
import cn.datax.service.data.metadata.api.entity.MetadataAuthorizeEntity;
import cn.datax.service.data.metadata.api.vo.MetadataAuthorizeVo;
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
public class MetadataAuthorizeMapperImpl implements MetadataAuthorizeMapper {

    @Override
    public MetadataAuthorizeDto toDTO(MetadataAuthorizeEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataAuthorizeDto metadataAuthorizeDto = new MetadataAuthorizeDto();

        metadataAuthorizeDto.setRoleId( e.getRoleId() );

        return metadataAuthorizeDto;
    }

    @Override
    public List<MetadataAuthorizeDto> toDTO(List<MetadataAuthorizeEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataAuthorizeDto> list = new ArrayList<MetadataAuthorizeDto>( es.size() );
        for ( MetadataAuthorizeEntity metadataAuthorizeEntity : es ) {
            list.add( toDTO( metadataAuthorizeEntity ) );
        }

        return list;
    }

    @Override
    public MetadataAuthorizeVo toVO(MetadataAuthorizeEntity e) {
        if ( e == null ) {
            return null;
        }

        MetadataAuthorizeVo metadataAuthorizeVo = new MetadataAuthorizeVo();

        metadataAuthorizeVo.setId( e.getId() );
        metadataAuthorizeVo.setObjectId( e.getObjectId() );
        metadataAuthorizeVo.setRoleId( e.getRoleId() );
        metadataAuthorizeVo.setObjectType( e.getObjectType() );

        return metadataAuthorizeVo;
    }

    @Override
    public List<MetadataAuthorizeVo> toVO(List<MetadataAuthorizeEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MetadataAuthorizeVo> list = new ArrayList<MetadataAuthorizeVo>( es.size() );
        for ( MetadataAuthorizeEntity metadataAuthorizeEntity : es ) {
            list.add( toVO( metadataAuthorizeEntity ) );
        }

        return list;
    }

    @Override
    public MetadataAuthorizeEntity toEntity(MetadataAuthorizeDto d) {
        if ( d == null ) {
            return null;
        }

        MetadataAuthorizeEntity metadataAuthorizeEntity = new MetadataAuthorizeEntity();

        metadataAuthorizeEntity.setRoleId( d.getRoleId() );

        return metadataAuthorizeEntity;
    }

    @Override
    public List<MetadataAuthorizeEntity> toEntity(List<MetadataAuthorizeDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<MetadataAuthorizeEntity> list = new ArrayList<MetadataAuthorizeEntity>( ds.size() );
        for ( MetadataAuthorizeDto metadataAuthorizeDto : ds ) {
            list.add( toEntity( metadataAuthorizeDto ) );
        }

        return list;
    }
}
