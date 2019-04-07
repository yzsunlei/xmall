package com.yzsunlei.xmall.app.service;

import com.yzsunlei.xmall.db.model.OmsCartItem;
import com.yzsunlei.xmall.app.domain.CartPromotionItem;

import java.util.List;

/**
 * Created by macro on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
