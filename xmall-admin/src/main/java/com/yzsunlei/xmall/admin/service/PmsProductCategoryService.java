package com.yzsunlei.xmall.admin.service;

import com.yzsunlei.xmall.admin.dto.PmsProductCategoryParam;
import com.yzsunlei.xmall.admin.dto.PmsProductCategoryParam;
import com.yzsunlei.xmall.admin.dto.PmsProductCategoryWithChildrenItem;
import com.yzsunlei.xmall.db.model.PmsProductCategory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品分类Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductCategoryService {
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
