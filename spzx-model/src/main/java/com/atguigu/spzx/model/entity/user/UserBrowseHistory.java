package com.atguigu.spzx.model.entity.user;

import com.atguigu.spzx.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author ljl
 * @create 2023-11-11-21:14
 */
@Data
@Schema(description = "用户收藏实体类")
public class UserBrowseHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "商品skuID")
    private Long skuId;

}