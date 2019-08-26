package com.accp.service.impl;

import com.accp.entity.Inventory;
import com.accp.dao.InventoryDao;
import com.accp.service.IInventoryService;
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
public class InventoryServiceImpl extends ServiceImpl<InventoryDao, Inventory> implements IInventoryService {

}
