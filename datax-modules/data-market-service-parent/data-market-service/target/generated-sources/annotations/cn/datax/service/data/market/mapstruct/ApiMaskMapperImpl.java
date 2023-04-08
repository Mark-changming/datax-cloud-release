package cn.datax.service.data.market.mapstruct;

import cn.datax.service.data.market.api.dto.ApiMaskDto;
import cn.datax.service.data.market.api.dto.FieldRule;
import cn.datax.service.data.market.api.entity.ApiMaskEntity;
import cn.datax.service.data.market.api.vo.ApiMaskVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T10:10:56+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_321 (Oracle Corporation)"
)
@Component
public class ApiMaskMapperImpl implements ApiMaskMapper {

    @Override
    public ApiMaskDto toDTO(ApiMaskEntity e) {
        if ( e == null ) {
            return null;
        }

        ApiMaskDto apiMaskDto = new ApiMaskDto();

        apiMaskDto.setId( e.getId() );
        apiMaskDto.setApiId( e.getApiId() );
        apiMaskDto.setMaskName( e.getMaskName() );
        List<FieldRule> list = e.getRules();
        if ( list != null ) {
            apiMaskDto.setRules( new ArrayList<FieldRule>( list ) );
        }
        apiMaskDto.setStatus( e.getStatus() );
        apiMaskDto.setRemark( e.getRemark() );

        return apiMaskDto;
    }

    @Override
    public List<ApiMaskDto> toDTO(List<ApiMaskEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ApiMaskDto> list = new ArrayList<ApiMaskDto>( es.size() );
        for ( ApiMaskEntity apiMaskEntity : es ) {
            list.add( toDTO( apiMaskEntity ) );
        }

        return list;
    }

    @Override
    public ApiMaskVo toVO(ApiMaskEntity e) {
        if ( e == null ) {
            return null;
        }

        ApiMaskVo apiMaskVo = new ApiMaskVo();

        apiMaskVo.setId( e.getId() );
        apiMaskVo.setStatus( e.getStatus() );
        apiMaskVo.setCreateTime( e.getCreateTime() );
        apiMaskVo.setRemark( e.getRemark() );
        apiMaskVo.setApiId( e.getApiId() );
        apiMaskVo.setMaskName( e.getMaskName() );
        List<FieldRule> list = e.getRules();
        if ( list != null ) {
            apiMaskVo.setRules( new ArrayList<FieldRule>( list ) );
        }

        return apiMaskVo;
    }

    @Override
    public List<ApiMaskVo> toVO(List<ApiMaskEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ApiMaskVo> list = new ArrayList<ApiMaskVo>( es.size() );
        for ( ApiMaskEntity apiMaskEntity : es ) {
            list.add( toVO( apiMaskEntity ) );
        }

        return list;
    }

    @Override
    public ApiMaskEntity toEntity(ApiMaskDto d) {
        if ( d == null ) {
            return null;
        }

        ApiMaskEntity apiMaskEntity = new ApiMaskEntity();

        apiMaskEntity.setId( d.getId() );
        apiMaskEntity.setStatus( d.getStatus() );
        apiMaskEntity.setRemark( d.getRemark() );
        apiMaskEntity.setApiId( d.getApiId() );
        apiMaskEntity.setMaskName( d.getMaskName() );
        List<FieldRule> list = d.getRules();
        if ( list != null ) {
            apiMaskEntity.setRules( new ArrayList<FieldRule>( list ) );
        }

        return apiMaskEntity;
    }

    @Override
    public List<ApiMaskEntity> toEntity(List<ApiMaskDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ApiMaskEntity> list = new ArrayList<ApiMaskEntity>( ds.size() );
        for ( ApiMaskDto apiMaskDto : ds ) {
            list.add( toEntity( apiMaskDto ) );
        }

        return list;
    }
}
