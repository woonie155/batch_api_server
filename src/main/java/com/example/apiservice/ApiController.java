package com.example.apiservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class ApiController {

    @PostMapping("/api/product/1")
    public String product1(@RequestBody ApiInfo apiInfo){
        List<ProductVO> collect = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
        log.info("productVO List: {}", collect);

        return "product1 - success";
    }

    @PostMapping("/api/product/2") //각각 포트를 가진 서버라고 생각
    public String product2(@RequestBody ApiInfo apiInfo){
        List<ProductVO> collect = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
        log.info("productVO List: {}", collect);

        return "product2 - success";
    }
    @PostMapping("/api/product/3")
    public String product3(@RequestBody ApiInfo apiInfo){
        List<ProductVO> collect = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
        log.info("productVO List: {}", collect);

        return "product3 - success";
    }

}
