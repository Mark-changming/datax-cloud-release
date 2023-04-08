package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.DeptDto;
import cn.datax.service.system.api.entity.DeptEntity;
import cn.datax.service.system.api.vo.DeptVo;
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
public class DeptMapperImpl implements DeptMapper {

    @Override
    public DeptDto toDTO(DeptEntity e) {
        if ( e == null ) {
            return null;
        }

        DeptDto deptDto = new DeptDto();

        deptDto.setId( e.getId() );
        deptDto.setParentId( e.getParentId() );
        deptDto.setDeptName( e.getDeptName() );
        deptDto.setDeptNo( e.getDeptNo() );
        deptDto.setStatus( e.getStatus() );
        deptDto.setRemark( e.getRemark() );

        return deptDto;
    }

    @Override
    public List<DeptDto> toDTO(List<DeptEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DeptDto> list = new ArrayList<DeptDto>( es.size() );
        for ( DeptEntity deptEntity : es ) {
            list.add( toDTO( deptEntity ) );
        }

        return list;
    }

    @Override
    public DeptVo toVO(DeptEntity e) {
        if ( e == null ) {
            return null;
        }

        DeptVo deptVo = new DeptVo();

        deptVo.setId( e.getId() );
        deptVo.setStatus( e.getStatus() );
        deptVo.setCreateTime( e.getCreateTime() );
        deptVo.setRemark( e.getRemark() );
        deptVo.setParentId( e.getParentId() );
        deptVo.setDeptName( e.getDeptName() );
        deptVo.setDeptNo( e.getDeptNo() );

        return deptVo;
    }

    @Override
    public List<DeptVo> toVO(List<DeptEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DeptVo> list = new ArrayList<DeptVo>( es.size() );
        for ( DeptEntity deptEntity : es ) {
            list.add( toVO( deptEntity ) );
        }

        return list;
    }

    @Override
    public DeptEntity toEntity(DeptDto d) {
        if ( d == null ) {
            return null;
        }

        DeptEntity deptEntity = new DeptEntity();

        deptEntity.setId( d.getId() );
        deptEntity.setStatus( d.getStatus() );
        deptEntity.setRemark( d.getRemark() );
        deptEntity.setParentId( d.getParentId() );
        deptEntity.setDeptName( d.getDeptName() );
        deptEntity.setDeptNo( d.getDeptNo() );

        return deptEntity;
    }

    @Override
    public List<DeptEntity> toEntity(List<DeptDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<DeptEntity> list = new ArrayList<DeptEntity>( ds.size() );
        for ( DeptDto deptDto : ds ) {
            list.add( toEntity( deptDto ) );
        }

        return list;
    }
}
