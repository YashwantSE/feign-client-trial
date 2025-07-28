package com.yys.consumer.feign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {
      @Autowired
      ProviderFeignClient providerFeignClient;
     @GetMapping("/instance")
     public String getInstance(){
         return providerFeignClient.getInstanceInfo();
     }
}
