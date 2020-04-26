package cn.iocoder.mall.system.biz.service.authorization;

import cn.iocoder.common.framework.exception.ServiceException;
import cn.iocoder.mall.system.biz.bo.authorization.ResourceBO;
import cn.iocoder.mall.system.biz.dto.authorization.AuthorizationCheckPermissionsDTO;
import cn.iocoder.mall.system.biz.dto.authorization.AuthorizationGetResourcesByAccountIdDTO;

import java.util.List;

/**
 * 授权模块 - Service 接口
 */
public interface AuthorizationService {

    /**
     * 校验指定账号是否有指定权限。如果没有，则抛出 {@link ServiceException} 异常
     *
     * @param checkPermissionsDTO 校验权限 DTO
     */
    void checkPermissions(AuthorizationCheckPermissionsDTO checkPermissionsDTO);

    /**
     * 获得指定账号的资源列表
     *
     * 如果该账号为超级管理员，则返回所有资源
     *
     * @param getResourcesByAccountIdDTO 查询条件 DTO
     * @return 列表
     */
    List<ResourceBO> getResourcesByAccountId(AuthorizationGetResourcesByAccountIdDTO getResourcesByAccountIdDTO);

}