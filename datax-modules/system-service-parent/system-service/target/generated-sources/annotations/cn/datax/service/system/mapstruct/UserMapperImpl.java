package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.UserDto;
import cn.datax.service.system.api.entity.DeptEntity;
import cn.datax.service.system.api.entity.MenuEntity;
import cn.datax.service.system.api.entity.PostEntity;
import cn.datax.service.system.api.entity.RoleEntity;
import cn.datax.service.system.api.entity.UserEntity;
import cn.datax.service.system.api.vo.DeptVo;
import cn.datax.service.system.api.vo.MenuVo;
import cn.datax.service.system.api.vo.PostVo;
import cn.datax.service.system.api.vo.RoleVo;
import cn.datax.service.system.api.vo.UserVo;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDTO(UserEntity e) {
        if ( e == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( e.getId() );
        userDto.setUsername( e.getUsername() );
        userDto.setNickname( e.getNickname() );
        userDto.setPassword( e.getPassword() );
        userDto.setEmail( e.getEmail() );
        userDto.setPhone( e.getPhone() );
        userDto.setBirthday( e.getBirthday() );
        userDto.setDeptId( e.getDeptId() );
        userDto.setStatus( e.getStatus() );
        userDto.setRemark( e.getRemark() );

        return userDto;
    }

    @Override
    public List<UserDto> toDTO(List<UserEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( es.size() );
        for ( UserEntity userEntity : es ) {
            list.add( toDTO( userEntity ) );
        }

        return list;
    }

    @Override
    public UserVo toVO(UserEntity e) {
        if ( e == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        userVo.setId( e.getId() );
        userVo.setStatus( e.getStatus() );
        userVo.setCreateTime( e.getCreateTime() );
        userVo.setRemark( e.getRemark() );
        userVo.setUsername( e.getUsername() );
        userVo.setNickname( e.getNickname() );
        userVo.setPassword( e.getPassword() );
        userVo.setEmail( e.getEmail() );
        userVo.setPhone( e.getPhone() );
        userVo.setBirthday( e.getBirthday() );
        userVo.setDeptId( e.getDeptId() );
        userVo.setDept( deptEntityToDeptVo( e.getDept() ) );
        userVo.setPosts( postEntityListToPostVoList( e.getPosts() ) );
        userVo.setRoles( roleEntityListToRoleVoList( e.getRoles() ) );

        return userVo;
    }

    @Override
    public List<UserVo> toVO(List<UserEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<UserVo> list = new ArrayList<UserVo>( es.size() );
        for ( UserEntity userEntity : es ) {
            list.add( toVO( userEntity ) );
        }

        return list;
    }

    @Override
    public UserEntity toEntity(UserDto d) {
        if ( d == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( d.getId() );
        userEntity.setStatus( d.getStatus() );
        userEntity.setRemark( d.getRemark() );
        userEntity.setUsername( d.getUsername() );
        userEntity.setNickname( d.getNickname() );
        userEntity.setPassword( d.getPassword() );
        userEntity.setEmail( d.getEmail() );
        userEntity.setPhone( d.getPhone() );
        userEntity.setBirthday( d.getBirthday() );
        userEntity.setDeptId( d.getDeptId() );

        return userEntity;
    }

    @Override
    public List<UserEntity> toEntity(List<UserDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( ds.size() );
        for ( UserDto userDto : ds ) {
            list.add( toEntity( userDto ) );
        }

        return list;
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

    protected PostVo postEntityToPostVo(PostEntity postEntity) {
        if ( postEntity == null ) {
            return null;
        }

        PostVo postVo = new PostVo();

        postVo.setId( postEntity.getId() );
        postVo.setStatus( postEntity.getStatus() );
        postVo.setCreateTime( postEntity.getCreateTime() );
        postVo.setRemark( postEntity.getRemark() );
        postVo.setPostName( postEntity.getPostName() );

        return postVo;
    }

    protected List<PostVo> postEntityListToPostVoList(List<PostEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PostVo> list1 = new ArrayList<PostVo>( list.size() );
        for ( PostEntity postEntity : list ) {
            list1.add( postEntityToPostVo( postEntity ) );
        }

        return list1;
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

    protected RoleVo roleEntityToRoleVo(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleVo roleVo = new RoleVo();

        roleVo.setId( roleEntity.getId() );
        roleVo.setStatus( roleEntity.getStatus() );
        roleVo.setCreateTime( roleEntity.getCreateTime() );
        roleVo.setRemark( roleEntity.getRemark() );
        roleVo.setRoleName( roleEntity.getRoleName() );
        roleVo.setRoleCode( roleEntity.getRoleCode() );
        roleVo.setDataScope( roleEntity.getDataScope() );
        roleVo.setMenus( menuEntityListToMenuVoList( roleEntity.getMenus() ) );
        roleVo.setDepts( deptEntityListToDeptVoList( roleEntity.getDepts() ) );

        return roleVo;
    }

    protected List<RoleVo> roleEntityListToRoleVoList(List<RoleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleVo> list1 = new ArrayList<RoleVo>( list.size() );
        for ( RoleEntity roleEntity : list ) {
            list1.add( roleEntityToRoleVo( roleEntity ) );
        }

        return list1;
    }
}
