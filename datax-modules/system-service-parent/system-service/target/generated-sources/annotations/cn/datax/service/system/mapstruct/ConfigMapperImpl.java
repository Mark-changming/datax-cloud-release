package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.ConfigDto;
import cn.datax.service.system.api.entity.ConfigEntity;
import cn.datax.service.system.api.vo.ConfigVo;
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
public class ConfigMapperImpl implements ConfigMapper {

    @Override
    public ConfigDto toDTO(ConfigEntity e) {
        if ( e == null ) {
            return null;
        }

        ConfigDto configDto = new ConfigDto();

        configDto.setId( e.getId() );
        configDto.setConfigName( e.getConfigName() );
        configDto.setConfigKey( e.getConfigKey() );
        configDto.setConfigValue( e.getConfigValue() );
        configDto.setStatus( e.getStatus() );
        configDto.setRemark( e.getRemark() );

        return configDto;
    }

    @Override
    public List<ConfigDto> toDTO(List<ConfigEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ConfigDto> list = new ArrayList<ConfigDto>( es.size() );
        for ( ConfigEntity configEntity : es ) {
            list.add( toDTO( configEntity ) );
        }

        return list;
    }

    @Override
    public ConfigVo toVO(ConfigEntity e) {
        if ( e == null ) {
            return null;
        }

        ConfigVo configVo = new ConfigVo();

        configVo.setId( e.getId() );
        configVo.setStatus( e.getStatus() );
        configVo.setCreateTime( e.getCreateTime() );
        configVo.setRemark( e.getRemark() );
        configVo.setConfigName( e.getConfigName() );
        configVo.setConfigKey( e.getConfigKey() );
        configVo.setConfigValue( e.getConfigValue() );

        return configVo;
    }

    @Override
    public List<ConfigVo> toVO(List<ConfigEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ConfigVo> list = new ArrayList<ConfigVo>( es.size() );
        for ( ConfigEntity configEntity : es ) {
            list.add( toVO( configEntity ) );
        }

        return list;
    }

    @Override
    public ConfigEntity toEntity(ConfigDto d) {
        if ( d == null ) {
            return null;
        }

        ConfigEntity configEntity = new ConfigEntity();

        configEntity.setId( d.getId() );
        configEntity.setStatus( d.getStatus() );
        configEntity.setRemark( d.getRemark() );
        configEntity.setConfigName( d.getConfigName() );
        configEntity.setConfigKey( d.getConfigKey() );
        configEntity.setConfigValue( d.getConfigValue() );

        return configEntity;
    }

    @Override
    public List<ConfigEntity> toEntity(List<ConfigDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ConfigEntity> list = new ArrayList<ConfigEntity>( ds.size() );
        for ( ConfigDto configDto : ds ) {
            list.add( toEntity( configDto ) );
        }

        return list;
    }
}
