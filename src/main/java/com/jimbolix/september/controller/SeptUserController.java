package com.jimbolix.september.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jimbolix.september.entity.SeptUser;
import com.jimbolix.september.entity.vo.SeptUserVo;
import com.jimbolix.september.service.ISeptUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
public class SeptUserController {

    @Autowired
    private ISeptUserService userService;

    @PostMapping("/page")
    public IPage<SeptUser> page(@RequestBody SeptUserVo septUserVo){
        IPage<SeptUser> page = userService.page(septUserVo);
        return page;
    }
}
