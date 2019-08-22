package com.jimbolix.september.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BaseVo {

    @ApiModelProperty(name = "currentPage",value = "当前页")
    private Integer currentPage = 1;

    @ApiModelProperty(name = "pageSize",value = "每页显示条数")
    private Integer pageSize = 10;
}
