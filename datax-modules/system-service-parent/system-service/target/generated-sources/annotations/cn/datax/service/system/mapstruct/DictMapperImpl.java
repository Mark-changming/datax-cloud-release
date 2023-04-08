package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.DictDto;
import cn.datax.service.system.api.entity.DictEntity;
import cn.datax.service.system.api.vo.DictVo;
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
public class DictMapperImpl implements DictMapper {

    @Override
    public DictDto toDTO(DictEntity e) {
        if ( e == null ) {
            return null;
        }

        DictDto dictDto = new DictDto();

        dictDto.setId( e.getId() );
        dictDto.setDictName( e.getDictName() );
        dictDto.setDictCode( e.getDictCode() );
        dictDto.setStatus( e.getStatus() );
        dictDto.setRemark( e.getRemark() );

        return dictDto;
    }

    @Override
    public List<DictDto> toDTO(List<DictEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DictDto> list = new ArrayList<DictDto>( es.size() );
        for ( DictEntity dictEntity : es ) {
            list.add( toDTO( dictEntity ) );
        }

        return list;
    }

    @Override
    public DictVo toVO(DictEntity e) {
        if ( e == null ) {
            return null;
        }

        DictVo dictVo = new DictVo();

        dictVo.setId( e.getId() );
        dictVo.setStatus( e.getStatus() );
        dictVo.setCreateTime( e.getCreateTime() );
        dictVo.setRemark( e.getRemark() );
        dictVo.setDictName( e.getDictName() );
        dictVo.setDictCode( e.getDictCode() );

        return dictVo;
    }

    @Override
    public List<DictVo> toVO(List<DictEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DictVo> list = new ArrayList<DictVo>( es.size() );
        for ( DictEntity dictEntity : es ) {
            list.add( toVO( dictEntity ) );
        }

        return list;
    }

    @Override
    public DictEntity toEntity(DictDto d) {
        if ( d == null ) {
            return null;
        }

        DictEntity dictEntity = new DictEntity();

        dictEntity.setId( d.getId() );
        dictEntity.setStatus( d.getStatus() );
        dictEntity.setRemark( d.getRemark() );
        dictEntity.setDictName( d.getDictName() );
        dictEntity.setDictCode( d.getDictCode() );

        return dictEntity;
    }

    @Override
    public List<DictEntity> toEntity(List<DictDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<DictEntity> list = new ArrayList<DictEntity>( ds.size() );
        for ( DictDto dictDto : ds ) {
            list.add( toEntity( dictDto ) );
        }

        return list;
    }
}
