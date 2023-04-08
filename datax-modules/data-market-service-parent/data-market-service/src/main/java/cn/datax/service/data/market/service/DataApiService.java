package cn.datax.service.data.market.service;

import cn.datax.service.data.market.api.dto.SqlParseDto;
import cn.datax.service.data.market.api.entity.DataApiEntity;
import cn.datax.service.data.market.api.dto.DataApiDto;
import cn.datax.common.base.BaseService;
import cn.datax.service.data.market.api.vo.SqlParseVo;
import com.aspose.words.Document;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 数据API信息表 服务类
 * </p>
 *
 * @author yuwei
 * @since 2020-03-31
 */
public interface DataApiService extends BaseService<DataApiEntity> {

    void saveDataApi(DataApiDto dataApi);

    void updateDataApi(DataApiDto dataApi);

    DataApiEntity getDataApiById(String id);

    void deleteDataApiById(String id);

    void deleteDataApiBatch(List<String> ids);

    SqlParseVo sqlParse(SqlParseDto sqlParseDto);

    void copyDataApi(String id);

    void releaseDataApi(String id);

    void cancelDataApi(String id);

    Document wordDataApi(String id) throws Exception;

    Map<String, Object> getDataApiDetailById(String id);
}
