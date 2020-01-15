package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Locale;

/**
 * @author James han
 * @create 2020-01-03 21:59
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    PBRAND_CANNOT_BE_NULL(400,"品牌不能为空！"),
    BRAND_NOT_FOUND(404,"品牌分类没找到"),
    CATEGORY_NOT_FOUND(404,"商品分类没找到");

    /**
     * 状态码
     */
    private int code;

    private String msg;




}
