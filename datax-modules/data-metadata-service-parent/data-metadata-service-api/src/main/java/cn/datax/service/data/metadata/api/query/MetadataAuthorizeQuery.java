package cn.datax.service.data.metadata.api.query;

import cn.datax.common.base.BaseQueryParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 数据授权信息表 查询实体
 * </p>
 *
 * @author yuwei
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MetadataAuthorizeQuery extends BaseQueryParams {

    private static final long serialVersionUID=1L;
}
