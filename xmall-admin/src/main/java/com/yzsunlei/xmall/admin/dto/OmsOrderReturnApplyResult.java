package com.yzsunlei.xmall.admin.dto;

import com.yzsunlei.xmall.db.model.OmsCompanyAddress;
import com.yzsunlei.xmall.db.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by macro on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
