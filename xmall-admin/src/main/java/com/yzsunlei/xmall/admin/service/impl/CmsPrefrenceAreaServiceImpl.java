package com.yzsunlei.xmall.admin.service.impl;

import com.yzsunlei.xmall.db.mapper.CmsPrefrenceAreaMapper;
import com.yzsunlei.xmall.db.model.CmsPrefrenceArea;
import com.yzsunlei.xmall.db.model.CmsPrefrenceAreaExample;
import com.yzsunlei.xmall.admin.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
