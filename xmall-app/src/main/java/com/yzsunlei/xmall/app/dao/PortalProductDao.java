package com.yzsunlei.xmall.app.dao;

import com.yzsunlei.xmall.app.domain.CartProduct;
import com.yzsunlei.xmall.app.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台系统自定义商品Dao
 * Created by macro on 2018/8/2.
 */
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
}
