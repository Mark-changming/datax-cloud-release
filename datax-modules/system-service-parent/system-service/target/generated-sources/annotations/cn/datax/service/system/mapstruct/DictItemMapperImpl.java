package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.DictItemDto;
import cn.datax.service.system.api.entity.DictItemEntity;
import cn.datax.service.system.api.vo.DictItemVo;
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
public class DictItemMapperImpl implements DictItemMapper {

    @Override
    public DictItemDto toDTO(DictItemEntity e) {
        if ( e == null ) {
            return null;
        }

        DictItemDto dictItemDto = new DictItemDto();

        dictItemDto.setId( e.getId() );
        dictItemDto.setDictId( e.getDictId() );
        dictItemDto.setItemText( e.getItemText() );
        dictItemDto.setItemValue( e.getItemValue() );
        dictItemDto.setItemSort( e.getItemSort() );
        dictItemDto.setStatus( e.getStatus() );
        dictItemDto.setRemark( e.getRemark() );

        return dictItemDto;
    }

    @Override
    public List<DictItemDto> toDTO(List<DictItemEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DictItemDto> list = new ArrayList<DictItemDto>( es.size() );
        for ( DictItemEntity dictItemEntity : es ) {
            list.add( toDTO( dictItemEntity ) );
        }

        return list;
    }

    @Override
    public DictItemVo toVO(DictItemEntity e) {
        if ( e == null ) {
            return null;
        }

        DictItemVo dictItemVo = new DictItemVo();

        dictItemVo.setId( e.getId() );
        dictItemVo.setStatus( e.getStatus() );
        dictItemVo.setCreateTime( e.getCreateTime() );
        dictItemVo.setRemark( e.getRemark() );
        dictItemVo.setDictId( e.getDictId() );
        dictItemVo.setItemText( e.getItemText() );
        dictItemVo.setItemValue( e.getItemValue() );
        dictItemVo.setItemSort( e.getItemSort() );

        return dictItemVo;
    }

    @Override
    public List<DictItemVo> toVO(List<DictItemEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DictItemVo> list = new ArrayList<DictItemVo>( es.size() );
        for ( DictItemEntity dictItemEntity : es ) {
            list.add( toVO( dictItemEntity ) );
        }

        return list;
    }

    @Override
    public DictItemEntity toEntity(DictItemDto d) {
        if ( d == null ) {
            return null;
        }

        DictItemEntity dictItemEntity = new DictItemEntity();

        dictItemEntity.setId( d.getId() );
        dictItemEntity.setStatus( d.getStatus() );
        dictItemEntity.setRemark( d.getRemark() );
        dictItemEntity.setDictId( d.getDictId() );
        dictItemEntity.setItemText( d.getItemText() );
        dictItemEntity.setItemValue( d.getItemValue() );
        dictItemEntity.setItemSort( d.getItemSort() );

        return dictItemEntity;
    }

    @Override
    public List<DictItemEntity> toEntity(List<DictItemDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<DictItemEntity> list = new ArrayList<DictItemEntity>( ds.size() );
        for ( DictItemDto dictItemDto : ds ) {
            list.add( toEntity( dictItemDto ) );
        }

        return list;
    }
}
