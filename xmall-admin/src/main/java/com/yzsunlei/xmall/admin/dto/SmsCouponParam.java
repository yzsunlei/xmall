package com.yzsunlei.xmall.admin.dto;

import com.yzsunlei.xmall.db.model.SmsCoupon;
import com.yzsunlei.xmall.db.model.SmsCouponProductCategoryRelation;
import com.yzsunlei.xmall.db.model.SmsCouponProductRelation;

import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和绑定分类
 * Created by macro on 2018/8/28.
 */
public class SmsCouponParam extends SmsCoupon {
    //优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getProductCategoryRelationList() {
        return productCategoryRelationList;
    }

    public void setProductCategoryRelationList(List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productCategoryRelationList = productCategoryRelationList;
    }
}
