package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.RoleDto;
import cn.datax.service.system.api.entity.DeptEntity;
import cn.datax.service.system.api.entity.MenuEntity;
import cn.datax.service.system.api.entity.RoleEntity;
import cn.datax.service.system.api.vo.DeptVo;
import cn.datax.service.system.api.vo.MenuVo;
import cn.datax.service.system.api.vo.RoleVo;
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
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto toDTO(RoleEntity e) {
        if ( e == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setId( e.getId() );
        roleDto.setRoleName( e.getRoleName() );
        roleDto.setRoleCode( e.getRoleCode() );
        roleDto.setDataScope( e.getDataScope() );
        roleDto.setStatus( e.getStatus() );
        roleDto.setRemark( e.getRemark() );

        return roleDto;
    }

    @Override
    public List<RoleDto> toDTO(List<RoleEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( es.size() );
        for ( RoleEntity roleEntity : es ) {
            list.add( toDTO( roleEntity ) );
        }

        return list;
    }

    @Override
    public RoleVo toVO(RoleEntity e) {
        if ( e == null ) {
            return null;
        }

        RoleVo roleVo = new RoleVo();

        roleVo.setId( e.getId() );
        roleVo.setStatus( e.getStatus() );
        roleVo.setCreateTime( e.getCreateTime() );
        roleVo.setRemark( e.getRemark() );
        roleVo.setRoleName( e.getRoleName() );
        roleVo.setRoleCode( e.getRoleCode() );
        roleVo.setDataScope( e.getDataScope() );
        roleVo.setMenus( menuEntityListToMenuVoList( e.getMenus() ) );
        roleVo.setDepts( deptEntityListToDeptVoList( e.getDepts() ) );

        return roleVo;
    }

    @Override
    public List<RoleVo> toVO(List<RoleEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<RoleVo> list = new ArrayList<RoleVo>( es.size() );
        for ( RoleEntity roleEntity : es ) {
            list.add( toVO( roleEntity ) );
        }

        return list;
    }

    @Override
    public RoleEntity toEntity(RoleDto d) {
        if ( d == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId( d.getId() );
        roleEntity.setStatus( d.getStatus() );
        roleEntity.setRemark( d.getRemark() );
        roleEntity.setRoleName( d.getRoleName() );
        roleEntity.setRoleCode( d.getRoleCode() );
        roleEntity.setDataScope( d.getDataScope() );

        return roleEntity;
    }

    @Override
    public List<RoleEntity> toEntity(List<RoleDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<RoleEntity> list = new ArrayList<RoleEntity>( ds.size() );
        for ( RoleDto roleDto : ds ) {
            list.add( toEntity( roleDto ) );
        }

        return list;
    }

    protected MenuVo menuEntityToMenuVo(MenuEntity menuEntity) {
        if ( menuEntity == null ) {
            return null;
        }

        MenuVo menuVo = new MenuVo();

        menuVo.setId( menuEntity.getId() );
        menuVo.setStatus( menuEntity.getStatus() );
        menuVo.setCreateTime( menuEntity.getCreateTime() );
        menuVo.setRemark( menuEntity.getRemark() );
        menuVo.setParentId( menuEntity.getParentId() );
        menuVo.setMenuName( menuEntity.getMenuName() );
        menuVo.setMenuPath( menuEntity.getMenuPath() );
        menuVo.setMenuComponent( menuEntity.getMenuComponent() );
        menuVo.setMenuRedirect( menuEntity.getMenuRedirect() );
        menuVo.setMenuPerms( menuEntity.getMenuPerms() );
        menuVo.setMenuIcon( menuEntity.getMenuIcon() );
        menuVo.setMenuType( menuEntity.getMenuType() );
        menuVo.setMenuCode( menuEntity.getMenuCode() );
        menuVo.setMenuHidden( menuEntity.getMenuHidden() );
        menuVo.setMenuSort( menuEntity.getMenuSort() );

        return menuVo;
    }

    protected List<MenuVo> menuEntityListToMenuVoList(List<MenuEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MenuVo> list1 = new ArrayList<MenuVo>( list.size() );
        for ( MenuEntity menuEntity : list ) {
            list1.add( menuEntityToMenuVo( menuEntity ) );
        }

        return list1;
    }

    protected DeptVo deptEntityToDeptVo(DeptEntity deptEntity) {
        if ( deptEntity == null ) {
            return null;
        }

        DeptVo deptVo = new DeptVo();

        deptVo.setId( deptEntity.getId() );
        deptVo.setStatus( deptEntity.getStatus() );
        deptVo.setCreateTime( deptEntity.getCreateTime() );
        deptVo.setRemark( deptEntity.getRemark() );
        deptVo.setParentId( deptEntity.getParentId() );
        deptVo.setDeptName( deptEntity.getDeptName() );
        deptVo.setDeptNo( deptEntity.getDeptNo() );

        return deptVo;
    }

    protected List<DeptVo> deptEntityListToDeptVoList(List<DeptEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<DeptVo> list1 = new ArrayList<DeptVo>( list.size() );
        for ( DeptEntity deptEntity : list ) {
            list1.add( deptEntityToDeptVo( deptEntity ) );
        }

        return list1;
    }
}
