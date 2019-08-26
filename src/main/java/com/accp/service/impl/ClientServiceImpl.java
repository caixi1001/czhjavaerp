package com.accp.service.impl;

import com.accp.entity.Client;
import com.accp.dao.ClientDao;
import com.accp.service.IClientService;
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
public class ClientServiceImpl extends ServiceImpl<ClientDao, Client> implements IClientService {

}
