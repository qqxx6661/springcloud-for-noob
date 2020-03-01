package com.pricemonitor.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>一个Feign服务消费者接口</p>
 **/
@FeignClient(value = "service-hi2", fallback = ServiceHiHystrix.class)
public interface ServiceHi {
    /**
     * <p>通过Feign伪Http客户端调用service-hi提供的服务</p>
     * @author hanchao 2018/5/19 17:59
     **/
    @GetMapping("/hi/{name}")
    String sayHiFromServiceHi2(@PathVariable(value = "name") String name);
}
