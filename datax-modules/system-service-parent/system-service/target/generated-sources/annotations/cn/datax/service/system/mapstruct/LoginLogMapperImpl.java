package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.LoginLogDto;
import cn.datax.service.system.api.entity.LoginLogEntity;
import cn.datax.service.system.api.vo.LoginLogVo;
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
public class LoginLogMapperImpl implements LoginLogMapper {

    @Override
    public LoginLogDto toDTO(LoginLogEntity e) {
        if ( e == null ) {
            return null;
        }

        LoginLogDto loginLogDto = new LoginLogDto();

        loginLogDto.setId( e.getId() );
        loginLogDto.setOpOs( e.getOpOs() );
        loginLogDto.setOpBrowser( e.getOpBrowser() );
        loginLogDto.setOpIp( e.getOpIp() );
        loginLogDto.setOpDate( e.getOpDate() );
        loginLogDto.setUserId( e.getUserId() );
        loginLogDto.setUserName( e.getUserName() );

        return loginLogDto;
    }

    @Override
    public List<LoginLogDto> toDTO(List<LoginLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<LoginLogDto> list = new ArrayList<LoginLogDto>( es.size() );
        for ( LoginLogEntity loginLogEntity : es ) {
            list.add( toDTO( loginLogEntity ) );
        }

        return list;
    }

    @Override
    public LoginLogVo toVO(LoginLogEntity e) {
        if ( e == null ) {
            return null;
        }

        LoginLogVo loginLogVo = new LoginLogVo();

        loginLogVo.setId( e.getId() );
        loginLogVo.setOpOs( e.getOpOs() );
        loginLogVo.setOpBrowser( e.getOpBrowser() );
        loginLogVo.setOpIp( e.getOpIp() );
        loginLogVo.setOpDate( e.getOpDate() );
        loginLogVo.setUserId( e.getUserId() );
        loginLogVo.setUserName( e.getUserName() );

        return loginLogVo;
    }

    @Override
    public List<LoginLogVo> toVO(List<LoginLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<LoginLogVo> list = new ArrayList<LoginLogVo>( es.size() );
        for ( LoginLogEntity loginLogEntity : es ) {
            list.add( toVO( loginLogEntity ) );
        }

        return list;
    }

    @Override
    public LoginLogEntity toEntity(LoginLogDto d) {
        if ( d == null ) {
            return null;
        }

        LoginLogEntity loginLogEntity = new LoginLogEntity();

        loginLogEntity.setId( d.getId() );
        loginLogEntity.setOpOs( d.getOpOs() );
        loginLogEntity.setOpBrowser( d.getOpBrowser() );
        loginLogEntity.setOpIp( d.getOpIp() );
        loginLogEntity.setOpDate( d.getOpDate() );
        loginLogEntity.setUserId( d.getUserId() );
        loginLogEntity.setUserName( d.getUserName() );

        return loginLogEntity;
    }

    @Override
    public List<LoginLogEntity> toEntity(List<LoginLogDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<LoginLogEntity> list = new ArrayList<LoginLogEntity>( ds.size() );
        for ( LoginLogDto loginLogDto : ds ) {
            list.add( toEntity( loginLogDto ) );
        }

        return list;
    }
}
