package com.xxl.xuapi.common;

import com.xxl.xuapi.constant.CommonConstant;
import lombok.Data;

/**
 * 分页请求
 *
 * @author xxl
 * @date 2023/6/24 21:13
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
