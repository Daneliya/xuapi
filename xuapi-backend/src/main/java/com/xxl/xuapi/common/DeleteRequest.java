package com.xxl.xuapi.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author xxl
 * @date 2023/6/24 21:13
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}