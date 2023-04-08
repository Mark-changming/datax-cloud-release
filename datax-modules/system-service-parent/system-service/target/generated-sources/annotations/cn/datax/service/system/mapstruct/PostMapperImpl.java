package cn.datax.service.system.mapstruct;

import cn.datax.service.system.api.dto.PostDto;
import cn.datax.service.system.api.entity.PostEntity;
import cn.datax.service.system.api.vo.PostVo;
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
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDto toDTO(PostEntity e) {
        if ( e == null ) {
            return null;
        }

        PostDto postDto = new PostDto();

        postDto.setId( e.getId() );
        postDto.setPostName( e.getPostName() );
        postDto.setStatus( e.getStatus() );
        postDto.setRemark( e.getRemark() );

        return postDto;
    }

    @Override
    public List<PostDto> toDTO(List<PostEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<PostDto> list = new ArrayList<PostDto>( es.size() );
        for ( PostEntity postEntity : es ) {
            list.add( toDTO( postEntity ) );
        }

        return list;
    }

    @Override
    public PostVo toVO(PostEntity e) {
        if ( e == null ) {
            return null;
        }

        PostVo postVo = new PostVo();

        postVo.setId( e.getId() );
        postVo.setStatus( e.getStatus() );
        postVo.setCreateTime( e.getCreateTime() );
        postVo.setRemark( e.getRemark() );
        postVo.setPostName( e.getPostName() );

        return postVo;
    }

    @Override
    public List<PostVo> toVO(List<PostEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<PostVo> list = new ArrayList<PostVo>( es.size() );
        for ( PostEntity postEntity : es ) {
            list.add( toVO( postEntity ) );
        }

        return list;
    }

    @Override
    public PostEntity toEntity(PostDto d) {
        if ( d == null ) {
            return null;
        }

        PostEntity postEntity = new PostEntity();

        postEntity.setId( d.getId() );
        postEntity.setStatus( d.getStatus() );
        postEntity.setRemark( d.getRemark() );
        postEntity.setPostName( d.getPostName() );

        return postEntity;
    }

    @Override
    public List<PostEntity> toEntity(List<PostDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<PostEntity> list = new ArrayList<PostEntity>( ds.size() );
        for ( PostDto postDto : ds ) {
            list.add( toEntity( postDto ) );
        }

        return list;
    }
}
