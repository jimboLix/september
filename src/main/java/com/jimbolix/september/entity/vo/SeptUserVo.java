package com.jimbolix.september.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户查询实体")
public class SeptUserVo extends BaseVo{

    @ApiModelProperty(name = "id",value = "主键")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty(name = "userName",value = "用户名")
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
