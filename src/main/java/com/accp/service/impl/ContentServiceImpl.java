package com.accp.service.impl;

import com.accp.entity.Content;
import com.accp.dao.ContentDao;
import com.accp.service.IContentService;
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
public class ContentServiceImpl extends ServiceImpl<ContentDao, Content> implements IContentService {

}
