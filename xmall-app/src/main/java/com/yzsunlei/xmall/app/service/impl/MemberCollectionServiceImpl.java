package com.yzsunlei.xmall.app.service.impl;

import com.yzsunlei.xmall.app.domain.MemberProductCollection;
import com.yzsunlei.xmall.app.repository.MemberProductCollectionRepository;
import com.yzsunlei.xmall.app.service.MemberCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员收藏Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Autowired
    private MemberProductCollectionRepository productCollectionRepository;

    @Override
    public int addProduct(MemberProductCollection productCollection) {
        int count = 0;
        MemberProductCollection findCollection = productCollectionRepository.findByMemberIdAndProductId(productCollection.getMemberId(), productCollection.getProductId());
        if (findCollection == null) {
            productCollectionRepository.save(productCollection);
            count = 1;
        }
        return count;
    }

    @Override
    public int deleteProduct(Long memberId, Long productId) {
        return productCollectionRepository.deleteByMemberIdAndProductId(memberId, productId);
    }

    @Override
    public List<MemberProductCollection> listProduct(Long memberId) {
        return productCollectionRepository.findByMemberId(memberId);
    }
}
