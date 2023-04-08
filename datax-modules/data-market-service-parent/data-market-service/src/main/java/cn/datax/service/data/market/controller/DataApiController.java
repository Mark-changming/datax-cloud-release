package cn.datax.service.data.market.controller;

import cn.datax.common.core.DataConstant;
import cn.datax.common.core.JsonPage;
import cn.datax.common.core.R;
import cn.datax.common.validate.ValidationGroups;
import cn.datax.service.data.market.api.dto.DataApiDto;
import cn.datax.service.data.market.api.dto.SqlParseDto;
import cn.datax.service.data.market.api.entity.DataApiEntity;
import cn.datax.service.data.market.api.vo.DataApiVo;
import cn.datax.service.data.market.api.query.DataApiQuery;
import cn.datax.service.data.market.api.vo.SqlParseVo;
import cn.datax.service.data.market.mapstruct.DataApiMapper;
import cn.datax.service.data.market.service.DataApiService;
import cn.hutool.core.util.StrUtil;
import com.aspose.words.Document;
import com.aspose.words.SaveFormat;
import com.aspose.words.SaveOptions;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import cn.datax.common.base.BaseController;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 数据API信息表 前端控制器
 * </p>
 *
 * @author yuwei
 * @since 2020-03-31
 */
@Api(tags = {"数据API信息表"})
@RestController
@RequestMapping("/dataApis")
public class DataApiController extends BaseController {

    @Autowired
    private DataApiService dataApiService;

    @Autowired
    private DataApiMapper dataApiMapper;

    /**
     * 通过ID查询信息
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详细信息", notes = "根据url的id来获取详细信息")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "String", paramType = "path")
    @GetMapping("/{id}")
    public R getDataApiById(@PathVariable String id) {
        DataApiEntity dataApiEntity = dataApiService.getDataApiById(id);
        return R.ok().setData(dataApiMapper.toVO(dataApiEntity));
    }

    @ApiOperation(value = "获取列表", notes = "")
    @GetMapping("/list")
    public R getDataApiList() {
        QueryWrapper<DataApiEntity> queryWrapper = new QueryWrapper<>();
        List<DataApiEntity> list = dataApiService.list(queryWrapper);
        List<DataApiVo> collect = list.stream().map(dataApiMapper::toVO).collect(Collectors.toList());
        return R.ok().setData(collect);
    }

    /**
     * 分页查询信息
     *
     * @param dataApiQuery
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dataApiQuery", value = "查询实体dataApiQuery", required = true, dataTypeClass = DataApiQuery.class)
    })
    @GetMapping("/page")
    public R getDataApiPage(DataApiQuery dataApiQuery) {
        QueryWrapper<DataApiEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StrUtil.isNotBlank(dataApiQuery.getApiName()), "api_name", dataApiQuery.getApiName());
        IPage<DataApiEntity> page = dataApiService.page(new Page<>(dataApiQuery.getPageNum(), dataApiQuery.getPageSize()), queryWrapper);
        List<DataApiVo> collect = page.getRecords().stream().map(dataApiMapper::toVO).collect(Collectors.toList());
        JsonPage<DataApiVo> jsonPage = new JsonPage<>(page.getCurrent(), page.getSize(), page.getTotal(), collect);
        return R.ok().setData(jsonPage);
    }

    /**
     * 添加
     * @param dataApi
     * @return
     */
    @ApiOperation(value = "添加信息", notes = "根据dataApi对象添加信息")
    @ApiImplicitParam(name = "dataApi", value = "详细实体dataApi", required = true, dataType = "DataApiDto")
    @PostMapping()
    public R saveDataApi(@RequestBody @Validated({ValidationGroups.Insert.class}) DataApiDto dataApi) {
        dataApiService.saveDataApi(dataApi);
        return R.ok();
    }

    /**
     * 修改
     * @param dataApi
     * @return
     */
    @ApiOperation(value = "修改信息", notes = "根据url的id来指定修改对象，并根据传过来的信息来修改详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "dataApi", value = "详细实体dataApi", required = true, dataType = "DataApiDto")
    })
    @PutMapping("/{id}")
    public R updateDataApi(@PathVariable String id, @RequestBody @Validated({ValidationGroups.Update.class}) DataApiDto dataApi) {
        dataApiService.updateDataApi(dataApi);
        return R.ok();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ApiOperation(value = "删除", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/{id}")
    public R deleteDataApiById(@PathVariable String id) {
        dataApiService.deleteDataApiById(id);
        return R.ok();
    }

    @ApiOperation(value = "批量删除", notes = "根据url的ids来批量删除对象")
    @ApiImplicitParam(name = "ids", value = "ID集合", required = true, dataType = "List", paramType = "path")
    @DeleteMapping("/batch/{ids}")
    public R deleteDataApiBatch(@PathVariable List<String> ids) {
        dataApiService.deleteDataApiBatch(ids);
        return R.ok();
    }

    /**
     * SQL解析
     * @param sqlParseDto
     * @return
     */
    @ApiOperation(value = "SQL解析")
    @ApiImplicitParam(name = "sqlParseDto", value = "SQL解析实体sqlParseDto", required = true, dataType = "SqlParseDto")
    @PostMapping("/sql/parse")
    public R sqlParse(@RequestBody @Validated SqlParseDto sqlParseDto) {
        SqlParseVo sqlParseVo = dataApiService.sqlParse(sqlParseDto);
        return R.ok().setData(sqlParseVo);
    }

    /**
     * 拷贝接口
     * @param id
     * @return
     */
    @PostMapping("/{id}/copy")
    public R copyDataApi(@PathVariable String id) {
        dataApiService.copyDataApi(id);
        return R.ok();
    }

    /**
     * 发布接口
     * @param id
     * @return
     */
    @PostMapping(value = "/{id}/release")
    public R releaseDataApi(@PathVariable String id){
        dataApiService.releaseDataApi(id);
        return R.ok();
    }

    /**
     * 注销接口
     * @param id
     * @return
     */
    @PostMapping(value = "/{id}/cancel")
    public R cancelDataApi(@PathVariable String id){
        dataApiService.cancelDataApi(id);
        return R.ok();
    }

    @ApiOperation(value = "接口文档", notes = "根据url的id来指定生成接口文档对象")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "String", paramType = "path")
    @PostMapping("/word/{id}")
    public void wordDataApi(@PathVariable String id, HttpServletResponse response) throws Exception {
        // 清空response
        response.reset();
        // 设置response的Header
        response.setContentType("application/octet-stream;charset=utf-8");
        // 设置content-disposition响应头控制浏览器以下载的形式打开文件
        response.addHeader("Content-Disposition", "attachment;filename=" + new String("接口文档.docx".getBytes()));
        Document doc = dataApiService.wordDataApi(id);
        OutputStream out = response.getOutputStream();
        doc.save(out, SaveOptions.createSaveOptions(SaveFormat.DOCX));
        out.flush();
        out.close();
    }

    @GetMapping("/detail/{id}")
    public R getDataApiDetailById(@PathVariable String id) {
        Map<String, Object> map = dataApiService.getDataApiDetailById(id);
        return R.ok().setData(map);
    }
}
