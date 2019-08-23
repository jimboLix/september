package com.jimbolix.september.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jimbolix.september.entity.SeptUser;
import com.jimbolix.september.entity.vo.SeptUserVo;
import com.jimbolix.september.service.ISeptUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jimbolix
 * @since 2019-08-21
 */
@RestController
@RequestMapping("/sept-user")
@Api("用户模块")
public class SeptUserController {

    @Autowired
    private ISeptUserService userService;

    @PostMapping("/page")
    @ApiOperation(value = "分页查询用户")
    @ApiParam(name = "septUserVo",value = "查询参数实体")
    public IPage<SeptUser> page(@RequestBody SeptUserVo septUserVo){
        IPage<SeptUser> page = userService.page(septUserVo);
        return page;
    }

    @PutMapping("")
    @ApiOperation(value = "添加用户")
    @ApiParam(name = "septUser",value = "保存用户请求参数")
    public ResponseEntity add(@RequestBody SeptUser septUser) throws Exception {
        throw new Exception("全局异常处理测试");
    }
}
