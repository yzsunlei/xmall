package com.yzsunlei.xmall.app.service;

import com.yzsunlei.xmall.app.domain.SmsCouponHistoryDetail;
import com.yzsunlei.xmall.db.model.SmsCouponHistory;
import com.yzsunlei.xmall.app.domain.CartPromotionItem;
import com.yzsunlei.xmall.app.domain.CommonResult;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户优惠券管理Service
 * Created by macro on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    CommonResult add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
