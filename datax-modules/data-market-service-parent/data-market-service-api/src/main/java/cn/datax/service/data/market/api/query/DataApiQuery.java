package cn.datax.service.data.market.api.query;

import cn.datax.common.base.BaseQueryParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 数据API信息表 查询实体
 * </p>
 *
 * @author yuwei
 * @since 2020-03-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DataApiQuery extends BaseQueryParams {

    private static final long serialVersionUID=1L;

    private String apiName;
}
