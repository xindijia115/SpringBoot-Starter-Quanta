package org.quanta.backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.quanta.backend.entity.Goods;
import org.quanta.backend.mapper.GoodsMapper;
import org.quanta.backend.service.IGoodsService;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
}
