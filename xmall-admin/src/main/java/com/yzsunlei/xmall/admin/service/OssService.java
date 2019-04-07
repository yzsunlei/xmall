package com.yzsunlei.xmall.admin.service;

import com.yzsunlei.xmall.admin.dto.OssCallbackResult;
import com.yzsunlei.xmall.admin.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    OssPolicyResult policy();
    OssCallbackResult callback(HttpServletRequest request);
}
