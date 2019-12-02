package com.zhoulei.ad.service;

import com.zhoulei.ad.vo.CreativeRequest;
import com.zhoulei.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
