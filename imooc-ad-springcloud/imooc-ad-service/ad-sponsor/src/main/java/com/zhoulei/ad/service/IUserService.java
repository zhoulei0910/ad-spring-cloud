package com.zhoulei.ad.service;

import com.zhoulei.ad.exception.AdException;
import com.zhoulei.ad.vo.CreateUserRequest;
import com.zhoulei.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
