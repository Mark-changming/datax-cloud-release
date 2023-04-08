package cn.datax.service.data.market.mapping.mapstruct;

import cn.datax.service.data.market.api.dto.ApiLogDto;
import cn.datax.service.data.market.api.entity.ApiLogEntity;
import cn.datax.service.data.market.api.vo.ApiLogVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T10:11:14+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_321 (Oracle Corporation)"
)
@Component
public class ApiLogMapperImpl implements ApiLogMapper {

    @Override
    public ApiLogDto toDTO(ApiLogEntity e) {
        if ( e == null ) {
            return null;
        }

        ApiLogDto apiLogDto = new ApiLogDto();

        apiLogDto.setId( e.getId() );
        apiLogDto.setApiId( e.getApiId() );
        apiLogDto.setCallerId( e.getCallerId() );
        apiLogDto.setCallerIp( e.getCallerIp() );
        apiLogDto.setCallerUrl( e.getCallerUrl() );
        apiLogDto.setCallerParams( e.getCallerParams() );
        apiLogDto.setCallerSize( e.getCallerSize() );
        apiLogDto.setCallerDate( e.getCallerDate() );
        apiLogDto.setTime( e.getTime() );
        apiLogDto.setMsg( e.getMsg() );
        apiLogDto.setStatus( e.getStatus() );

        return apiLogDto;
    }

    @Override
    public List<ApiLogDto> toDTO(List<ApiLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ApiLogDto> list = new ArrayList<ApiLogDto>( es.size() );
        for ( ApiLogEntity apiLogEntity : es ) {
            list.add( toDTO( apiLogEntity ) );
        }

        return list;
    }

    @Override
    public ApiLogVo toVO(ApiLogEntity e) {
        if ( e == null ) {
            return null;
        }

        ApiLogVo apiLogVo = new ApiLogVo();

        apiLogVo.setId( e.getId() );
        apiLogVo.setApiId( e.getApiId() );
        apiLogVo.setApiName( e.getApiName() );
        apiLogVo.setCallerId( e.getCallerId() );
        apiLogVo.setCallerIp( e.getCallerIp() );
        apiLogVo.setCallerUrl( e.getCallerUrl() );
        apiLogVo.setCallerSize( e.getCallerSize() );
        apiLogVo.setCallerParams( e.getCallerParams() );
        apiLogVo.setCallerDate( e.getCallerDate() );
        apiLogVo.setTime( e.getTime() );
        apiLogVo.setMsg( e.getMsg() );
        apiLogVo.setStatus( e.getStatus() );

        return apiLogVo;
    }

    @Override
    public List<ApiLogVo> toVO(List<ApiLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ApiLogVo> list = new ArrayList<ApiLogVo>( es.size() );
        for ( ApiLogEntity apiLogEntity : es ) {
            list.add( toVO( apiLogEntity ) );
        }

        return list;
    }

    @Override
    public ApiLogEntity toEntity(ApiLogDto d) {
        if ( d == null ) {
            return null;
        }

        ApiLogEntity apiLogEntity = new ApiLogEntity();

        apiLogEntity.setId( d.getId() );
        apiLogEntity.setApiId( d.getApiId() );
        apiLogEntity.setCallerId( d.getCallerId() );
        apiLogEntity.setCallerIp( d.getCallerIp() );
        apiLogEntity.setCallerUrl( d.getCallerUrl() );
        apiLogEntity.setCallerParams( d.getCallerParams() );
        apiLogEntity.setCallerSize( d.getCallerSize() );
        apiLogEntity.setTime( d.getTime() );
        apiLogEntity.setMsg( d.getMsg() );
        apiLogEntity.setStatus( d.getStatus() );
        apiLogEntity.setCallerDate( d.getCallerDate() );

        return apiLogEntity;
    }

    @Override
    public List<ApiLogEntity> toEntity(List<ApiLogDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ApiLogEntity> list = new ArrayList<ApiLogEntity>( ds.size() );
        for ( ApiLogDto apiLogDto : ds ) {
            list.add( toEntity( apiLogDto ) );
        }

        return list;
    }
}
