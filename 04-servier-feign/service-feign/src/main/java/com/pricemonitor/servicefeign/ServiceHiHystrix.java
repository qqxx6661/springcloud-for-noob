/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ServiceHiHystrix
 * Author:   27046
 * Date:     2020/2/28 0:23
 * Description: hi服务的熔断
 * History:
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pricemonitor.servicefeign;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈hi服务的熔断〉
 *
 *@author 27046
 *@create 2020/2/28
 *@since 1.0.0
 */
@Component
public class ServiceHiHystrix implements ServiceHi{

    @Override
    public String sayHiFromServiceHi(String name) {
        return "hello" + name +", this message send failed";
    }
}