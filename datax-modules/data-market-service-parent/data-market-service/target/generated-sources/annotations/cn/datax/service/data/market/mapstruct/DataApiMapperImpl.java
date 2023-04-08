package cn.datax.service.data.market.mapstruct;

import cn.datax.service.data.market.api.dto.DataApiDto;
import cn.datax.service.data.market.api.dto.ReqParam;
import cn.datax.service.data.market.api.dto.ResParam;
import cn.datax.service.data.market.api.entity.DataApiEntity;
import cn.datax.service.data.market.api.vo.DataApiVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T10:10:56+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_321 (Oracle Corporation)"
)
@Component
public class DataApiMapperImpl implements DataApiMapper {

    @Override
    public DataApiDto toDTO(DataApiEntity e) {
        if ( e == null ) {
            return null;
        }

        DataApiDto dataApiDto = new DataApiDto();

        dataApiDto.setId( e.getId() );
        dataApiDto.setApiName( e.getApiName() );
        dataApiDto.setApiVersion( e.getApiVersion() );
        dataApiDto.setApiUrl( e.getApiUrl() );
        dataApiDto.setReqMethod( e.getReqMethod() );
        dataApiDto.setResType( e.getResType() );
        dataApiDto.setDeny( e.getDeny() );
        dataApiDto.setRateLimit( e.getRateLimit() );
        dataApiDto.setExecuteConfig( e.getExecuteConfig() );
        List<ReqParam> list = e.getReqParams();
        if ( list != null ) {
            dataApiDto.setReqParams( new ArrayList<ReqParam>( list ) );
        }
        List<ResParam> list1 = e.getResParams();
        if ( list1 != null ) {
            dataApiDto.setResParams( new ArrayList<ResParam>( list1 ) );
        }
        dataApiDto.setStatus( e.getStatus() );
        dataApiDto.setRemark( e.getRemark() );

        return dataApiDto;
    }

    @Override
    public List<DataApiDto> toDTO(List<DataApiEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DataApiDto> list = new ArrayList<DataApiDto>( es.size() );
        for ( DataApiEntity dataApiEntity : es ) {
            list.add( toDTO( dataApiEntity ) );
        }

        return list;
    }

    @Override
    public DataApiVo toVO(DataApiEntity e) {
        if ( e == null ) {
            return null;
        }

        DataApiVo dataApiVo = new DataApiVo();

        dataApiVo.setId( e.getId() );
        dataApiVo.setStatus( e.getStatus() );
        dataApiVo.setCreateTime( e.getCreateTime() );
        dataApiVo.setRemark( e.getRemark() );
        dataApiVo.setApiName( e.getApiName() );
        dataApiVo.setApiVersion( e.getApiVersion() );
        dataApiVo.setApiUrl( e.getApiUrl() );
        dataApiVo.setReqMethod( e.getReqMethod() );
        dataApiVo.setDeny( e.getDeny() );
        dataApiVo.setResType( e.getResType() );
        dataApiVo.setRateLimit( e.getRateLimit() );
        dataApiVo.setExecuteConfig( e.getExecuteConfig() );
        List<ReqParam> list = e.getReqParams();
        if ( list != null ) {
            dataApiVo.setReqParams( new ArrayList<ReqParam>( list ) );
        }
        List<ResParam> list1 = e.getResParams();
        if ( list1 != null ) {
            dataApiVo.setResParams( new ArrayList<ResParam>( list1 ) );
        }

        return dataApiVo;
    }

    @Override
    public List<DataApiVo> toVO(List<DataApiEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DataApiVo> list = new ArrayList<DataApiVo>( es.size() );
        for ( DataApiEntity dataApiEntity : es ) {
            list.add( toVO( dataApiEntity ) );
        }

        return list;
    }

    @Override
    public DataApiEntity toEntity(DataApiDto d) {
        if ( d == null ) {
            return null;
        }

        DataApiEntity dataApiEntity = new DataApiEntity();

        dataApiEntity.setId( d.getId() );
        dataApiEntity.setStatus( d.getStatus() );
        dataApiEntity.setRemark( d.getRemark() );
        dataApiEntity.setApiName( d.getApiName() );
        dataApiEntity.setApiVersion( d.getApiVersion() );
        dataApiEntity.setApiUrl( d.getApiUrl() );
        dataApiEntity.setReqMethod( d.getReqMethod() );
        dataApiEntity.setResType( d.getResType() );
        dataApiEntity.setDeny( d.getDeny() );
        dataApiEntity.setRateLimit( d.getRateLimit() );
        dataApiEntity.setExecuteConfig( d.getExecuteConfig() );
        List<ReqParam> list = d.getReqParams();
        if ( list != null ) {
            dataApiEntity.setReqParams( new ArrayList<ReqParam>( list ) );
        }
        List<ResParam> list1 = d.getResParams();
        if ( list1 != null ) {
            dataApiEntity.setResParams( new ArrayList<ResParam>( list1 ) );
        }

        return dataApiEntity;
    }

    @Override
    public List<DataApiEntity> toEntity(List<DataApiDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<DataApiEntity> list = new ArrayList<DataApiEntity>( ds.size() );
        for ( DataApiDto dataApiDto : ds ) {
            list.add( toEntity( dataApiDto ) );
        }

        return list;
    }
}
