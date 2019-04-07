package com.yzsunlei.xmall.admin.dto;

import com.yzsunlei.xmall.db.model.SmsFlashPromotionProductRelation;
import com.yzsunlei.xmall.db.model.PmsProduct;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 * Created by macro on 2018/11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    private PmsProduct product;
}
