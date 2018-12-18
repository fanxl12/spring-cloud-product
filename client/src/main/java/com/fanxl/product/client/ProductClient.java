package com.fanxl.product.client;

import com.fanxl.product.common.DecreaseStockInput;
import com.fanxl.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2018/10/26 0026 11:39
 */
@FeignClient(name = "product", fallback = ProductClient.ProductFallBack.class)
public interface ProductClient {

    @GetMapping("product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);

    @GetMapping("test/{name}")
    String getTest(@PathVariable("name") String name);

    @Component
    class ProductFallBack implements ProductClient {

        @Override
        public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
            return null;
        }

        @Override
        public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {

        }

        @Override
        public String getTest(String name) {
            return null;
        }
    }

}
