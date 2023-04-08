package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.MenuDto;
import cn.datax.service.system.api.entity.MenuEntity;
import cn.datax.service.system.api.vo.MenuVo;
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
public class MenuMapperImpl implements MenuMapper {

    @Override
    public MenuDto toDTO(MenuEntity e) {
        if ( e == null ) {
            return null;
        }

        MenuDto menuDto = new MenuDto();

        menuDto.setId( e.getId() );
        menuDto.setParentId( e.getParentId() );
        menuDto.setMenuName( e.getMenuName() );
        menuDto.setMenuPath( e.getMenuPath() );
        menuDto.setMenuComponent( e.getMenuComponent() );
        menuDto.setMenuRedirect( e.getMenuRedirect() );
        menuDto.setMenuPerms( e.getMenuPerms() );
        menuDto.setMenuIcon( e.getMenuIcon() );
        menuDto.setMenuType( e.getMenuType() );
        menuDto.setMenuCode( e.getMenuCode() );
        menuDto.setMenuHidden( e.getMenuHidden() );
        menuDto.setMenuSort( e.getMenuSort() );
        menuDto.setStatus( e.getStatus() );
        menuDto.setRemark( e.getRemark() );

        return menuDto;
    }

    @Override
    public List<MenuDto> toDTO(List<MenuEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MenuDto> list = new ArrayList<MenuDto>( es.size() );
        for ( MenuEntity menuEntity : es ) {
            list.add( toDTO( menuEntity ) );
        }

        return list;
    }

    @Override
    public MenuVo toVO(MenuEntity e) {
        if ( e == null ) {
            return null;
        }

        MenuVo menuVo = new MenuVo();

        menuVo.setId( e.getId() );
        menuVo.setStatus( e.getStatus() );
        menuVo.setCreateTime( e.getCreateTime() );
        menuVo.setRemark( e.getRemark() );
        menuVo.setParentId( e.getParentId() );
        menuVo.setMenuName( e.getMenuName() );
        menuVo.setMenuPath( e.getMenuPath() );
        menuVo.setMenuComponent( e.getMenuComponent() );
        menuVo.setMenuRedirect( e.getMenuRedirect() );
        menuVo.setMenuPerms( e.getMenuPerms() );
        menuVo.setMenuIcon( e.getMenuIcon() );
        menuVo.setMenuType( e.getMenuType() );
        menuVo.setMenuCode( e.getMenuCode() );
        menuVo.setMenuHidden( e.getMenuHidden() );
        menuVo.setMenuSort( e.getMenuSort() );

        return menuVo;
    }

    @Override
    public List<MenuVo> toVO(List<MenuEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<MenuVo> list = new ArrayList<MenuVo>( es.size() );
        for ( MenuEntity menuEntity : es ) {
            list.add( toVO( menuEntity ) );
        }

        return list;
    }

    @Override
    public MenuEntity toEntity(MenuDto d) {
        if ( d == null ) {
            return null;
        }

        MenuEntity menuEntity = new MenuEntity();

        menuEntity.setId( d.getId() );
        menuEntity.setStatus( d.getStatus() );
        menuEntity.setRemark( d.getRemark() );
        menuEntity.setParentId( d.getParentId() );
        menuEntity.setMenuName( d.getMenuName() );
        menuEntity.setMenuPath( d.getMenuPath() );
        menuEntity.setMenuComponent( d.getMenuComponent() );
        menuEntity.setMenuRedirect( d.getMenuRedirect() );
        menuEntity.setMenuPerms( d.getMenuPerms() );
        menuEntity.setMenuIcon( d.getMenuIcon() );
        menuEntity.setMenuType( d.getMenuType() );
        menuEntity.setMenuCode( d.getMenuCode() );
        menuEntity.setMenuHidden( d.getMenuHidden() );
        menuEntity.setMenuSort( d.getMenuSort() );

        return menuEntity;
    }

    @Override
    public List<MenuEntity> toEntity(List<MenuDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<MenuEntity> list = new ArrayList<MenuEntity>( ds.size() );
        for ( MenuDto menuDto : ds ) {
            list.add( toEntity( menuDto ) );
        }

        return list;
    }
}
