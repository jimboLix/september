package com.jimbolix.september.entity.vo;

import lombok.Data;

@Data
public class BaseVo {

    private Integer currentPage = 1;
    private Integer pageSize = 10;
}
