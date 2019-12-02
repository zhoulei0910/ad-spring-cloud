package com.zhoulei.ad.service.Impl;

import com.zhoulei.ad.dao.CreativeRepository;
import com.zhoulei.ad.entity.Creative;
import com.zhoulei.ad.service.ICreativeService;
import com.zhoulei.ad.vo.CreativeRequest;
import com.zhoulei.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    @Autowired
    private CreativeRepository creativeRepository;

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {
        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );
        return new CreativeResponse(creative.getId(),creative.getName());
    }
}
