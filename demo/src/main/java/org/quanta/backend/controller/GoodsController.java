package org.quanta.backend.controller;

import org.quanta.backend.entity.Goods;
import org.quanta.backend.service.IGoodsService;
import lombok.RequiredArgsConstructor;

import org.quanta.controller.BaseController;
import org.quanta.core.beans.Response;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@RestController
@RequiredArgsConstructor
public class GoodsController extends BaseController implements IGoodsController {
    private final IGoodsService goodsService;

    @Override
    public Response<?> getGoodsList() {
        return Response.success(goodsService.list());
    }

    @Override
    public Response<?> getGoodsById(Long id) {
        return Response.success(goodsService.lambdaQuery().eq(Goods::getId, id).one());
    }
}
