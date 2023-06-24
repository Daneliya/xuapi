package com.xxl.xuapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxl.xuapi.common.ErrorCode;
import com.xxl.xuapi.exception.BusinessException;
import com.xxl.xuapi.exception.ThrowUtils;
import com.xxl.xuapi.mapper.InterfaceInfoMapper;
import com.xxl.xuapi.model.entity.InterfaceInfo;
import com.xxl.xuapi.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author xxl
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2023-06-24 21:03:25
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "标题过长");
        }
    }
}




