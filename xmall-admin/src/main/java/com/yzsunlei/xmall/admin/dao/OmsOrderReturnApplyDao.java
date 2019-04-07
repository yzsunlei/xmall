package com.yzsunlei.xmall.admin.dao;

import com.yzsunlei.xmall.admin.dto.OmsOrderReturnApplyResult;
import com.yzsunlei.xmall.admin.dto.OmsReturnApplyQueryParam;
import com.yzsunlei.xmall.db.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * Created by macro on 2018/10/18.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
