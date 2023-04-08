package cn.datax.service.system.controller;

import cn.datax.common.base.BaseController;
import cn.datax.common.base.DataScope;
import cn.datax.common.core.R;
import cn.datax.service.system.api.entity.UserEntity;
import cn.datax.service.system.api.query.UserQuery;
import cn.datax.service.system.service.UserService;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/pageDataScope")
    public R getUserPageDataScope(UserQuery userQuery) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StrUtil.isNotBlank(userQuery.getUsername()), "username", userQuery.getUsername());
        queryWrapper.eq(StrUtil.isNotBlank(userQuery.getDeptId()), "dept_id", userQuery.getDeptId());
        if(CollUtil.isNotEmpty(userQuery.getOrderList())){
            userQuery.getOrderList().stream().forEach(orderItem -> {
                queryWrapper.orderBy(StrUtil.isNotBlank(orderItem.getColumn()), orderItem.isAsc(), orderItem.getColumn());
            });
        }
        IPage<UserEntity> page = userService.pageDataScope(new Page<>(userQuery.getPageNum(), userQuery.getPageSize()), queryWrapper, new DataScope("dept_id", "create_by"));
        return R.ok().setData(page);
    }
}
