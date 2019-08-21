package com.jimbolix.september.entity.vo;

import lombok.Data;

@Data
public class SeptUserVo extends BaseVo{

    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户状态,1-启用,-1禁用
     */
    private Integer userState = -1;

}
