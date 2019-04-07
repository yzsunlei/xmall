package com.yzsunlei.xmall.admin.controller;

import com.yzsunlei.xmall.admin.dto.CommonResult;
import com.yzsunlei.xmall.admin.service.OmsCompanyAddressService;
import com.yzsunlei.xmall.db.model.OmsCompanyAddress;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 收货地址管理Controller
 * Created by macro on 2018/10/18.
 */
@Controller
@Api(tags = "OmsCompanyAddressController", description = "收货地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    @Autowired
    private OmsCompanyAddressService companyAddressService;

    @ApiOperation("获取所有收货地址")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
        List<OmsCompanyAddress> companyAddressList = companyAddressService.list();
        return new CommonResult().success(companyAddressList);
    }
}
