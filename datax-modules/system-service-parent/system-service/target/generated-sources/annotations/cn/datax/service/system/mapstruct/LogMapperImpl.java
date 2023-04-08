package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.LogDto;
import cn.datax.service.system.api.entity.LogEntity;
import cn.datax.service.system.api.vo.LogVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T10:08:37+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_321 (Oracle Corporation)"
)
@Component
public class LogMapperImpl implements LogMapper {

    @Override
    public LogDto toDTO(LogEntity e) {
        if ( e == null ) {
            return null;
        }

        LogDto logDto = new LogDto();

        logDto.setId( e.getId() );
        logDto.setModule( e.getModule() );
        logDto.setTitle( e.getTitle() );
        logDto.setUserId( e.getUserId() );
        logDto.setUserName( e.getUserName() );
        logDto.setRemoteAddr( e.getRemoteAddr() );
        logDto.setRequestUri( e.getRequestUri() );
        logDto.setClassName( e.getClassName() );
        logDto.setMethodName( e.getMethodName() );
        logDto.setParams( e.getParams() );
        logDto.setTime( e.getTime() );
        logDto.setBrowser( e.getBrowser() );
        logDto.setOs( e.getOs() );
        logDto.setExCode( e.getExCode() );
        logDto.setExMsg( e.getExMsg() );

        return logDto;
    }

    @Override
    public List<LogDto> toDTO(List<LogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<LogDto> list = new ArrayList<LogDto>( es.size() );
        for ( LogEntity logEntity : es ) {
            list.add( toDTO( logEntity ) );
        }

        return list;
    }

    @Override
    public LogVo toVO(LogEntity e) {
        if ( e == null ) {
            return null;
        }

        LogVo logVo = new LogVo();

        logVo.setId( e.getId() );
        logVo.setModule( e.getModule() );
        logVo.setTitle( e.getTitle() );
        logVo.setUserId( e.getUserId() );
        logVo.setUserName( e.getUserName() );
        logVo.setRemoteAddr( e.getRemoteAddr() );
        logVo.setRequestUri( e.getRequestUri() );
        logVo.setClassName( e.getClassName() );
        logVo.setMethodName( e.getMethodName() );
        logVo.setParams( e.getParams() );
        logVo.setTime( e.getTime() );
        logVo.setBrowser( e.getBrowser() );
        logVo.setOs( e.getOs() );
        logVo.setExCode( e.getExCode() );
        logVo.setExMsg( e.getExMsg() );
        logVo.setCreateTime( e.getCreateTime() );

        return logVo;
    }

    @Override
    public List<LogVo> toVO(List<LogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<LogVo> list = new ArrayList<LogVo>( es.size() );
        for ( LogEntity logEntity : es ) {
            list.add( toVO( logEntity ) );
        }

        return list;
    }

    @Override
    public LogEntity toEntity(LogDto d) {
        if ( d == null ) {
            return null;
        }

        LogEntity logEntity = new LogEntity();

        logEntity.setId( d.getId() );
        logEntity.setModule( d.getModule() );
        logEntity.setTitle( d.getTitle() );
        logEntity.setUserId( d.getUserId() );
        logEntity.setUserName( d.getUserName() );
        logEntity.setRemoteAddr( d.getRemoteAddr() );
        logEntity.setRequestUri( d.getRequestUri() );
        logEntity.setClassName( d.getClassName() );
        logEntity.setMethodName( d.getMethodName() );
        logEntity.setParams( d.getParams() );
        logEntity.setTime( d.getTime() );
        logEntity.setBrowser( d.getBrowser() );
        logEntity.setOs( d.getOs() );
        logEntity.setExCode( d.getExCode() );
        logEntity.setExMsg( d.getExMsg() );

        return logEntity;
    }

    @Override
    public List<LogEntity> toEntity(List<LogDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<LogEntity> list = new ArrayList<LogEntity>( ds.size() );
        for ( LogDto logDto : ds ) {
            list.add( toEntity( logDto ) );
        }

        return list;
    }
}
