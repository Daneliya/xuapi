package com.xxl.xuapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxl.xuapi.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author xxl
 * @date 2023/6/24 21:13
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




