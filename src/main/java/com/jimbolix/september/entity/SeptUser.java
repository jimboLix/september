package com.jimbolix.september.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.jimbolix.september.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jimbolix
 * @since 2019-08-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SeptUser extends BaseEntity implements Serializable {


    private static final long serialVersionUID = -8278995053341214115L;
    private Long id;

    /**
     * 用户名
     */
    @TableField("userName")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户状态,1-启用,-1禁用
     */
    @TableField("userState")
    private Integer userState = -1;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 描述
     */
    @TableField("userDesc")
    private String userDesc;


}
