package com.accp.service.impl;

import com.accp.entity.Purchase;
import com.accp.dao.PurchaseDao;
import com.accp.service.IPurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, Purchase> implements IPurchaseService {

}
