package com.jimbolix.september.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jimbolix.september.entity.SeptUser;
import com.jimbolix.september.entity.vo.SeptUserVo;
import com.jimbolix.september.mapper.SeptUserMapper;
import com.jimbolix.september.service.ISeptUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jimbolix
 * @since 2019-08-21
 */
@Service
@CacheConfig(cacheNames = "septUser")
public class SeptUserServiceImpl extends ServiceImpl<SeptUserMapper, SeptUser> implements ISeptUserService {

    Logger logger = LoggerFactory.getLogger(SeptUserServiceImpl.class);

    @Autowired
    private SeptUserMapper userMapper;

    @Override
    @Cacheable(keyGenerator = "septemKeyGenerator")
    public IPage<SeptUser> page(SeptUserVo userVo) {
        logger.info("septuser page query");
        Page<SeptUser> page = new Page<>();
        page.setCurrent(userVo.getCurrentPage());
        page.setPages(userVo.getPageSize());
        QueryWrapper<SeptUser> wrapper = new QueryWrapper<>();
        if(null != userVo.getId()){
            wrapper.eq("id",userVo.getId());
        }
        if(StringUtils.isNotEmpty(userVo.getPassword())){
            wrapper.eq("password",userVo.getPassword());
        }
        return userMapper.selectPage(page,wrapper);
    }
}
