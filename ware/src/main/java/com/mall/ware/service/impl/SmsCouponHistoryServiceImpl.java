package com.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.ware.dao.SmsCouponHistoryDao;
import com.mall.ware.entity.SmsCouponHistoryEntity;
import com.mall.ware.service.SmsCouponHistoryService;


@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity> implements SmsCouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponHistoryEntity> page = this.page(
                new Query<SmsCouponHistoryEntity>().getPage(params),
                new QueryWrapper<SmsCouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}