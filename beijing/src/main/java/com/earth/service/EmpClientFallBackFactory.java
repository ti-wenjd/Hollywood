package com.earth.service;

import com.earth.model.Emp;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定义的熔断切面业务类 统一处理熔断或降级的业务通知
 */
@Component
public class EmpClientFallBackFactory implements FallbackFactory<EmpClientService> {

    @Override
    public EmpClientService create(Throwable throwable) {
        return new EmpClientService() {
            @Override
            public Emp get(Integer id) {
                Emp emp = new Emp();
                emp.setId(id);
                emp.setName("该"+id+"不存在，provider中断了---@EnableCircuitBreaker");
                emp.setSource("no source");
                return emp;
            }

            @Override
            public List<Emp> list() {
                return null;
            }
        };
    }
}
