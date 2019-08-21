package com.jimbolix.september.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jimbolix.september.entity.SeptUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jimbolix.september.entity.vo.SeptUserVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jimbolix
 * @since 2019-08-21
 */
public interface ISeptUserService extends IService<SeptUser> {

    IPage<SeptUser> page(SeptUserVo userVo);
}
