package com.fanxl.product.controller;

import com.fanxl.product.VO.ResultVO;
import com.fanxl.product.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品
 * Created by 廖师兄
 * 2017-12-09 21:13
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("{name}")
    public ResultVO<String> test(@PathVariable String name) {
        log.info("你传过来的参数是:{}", name);
        return ResultVOUtil.success("you param is:" + name);
    }


}
