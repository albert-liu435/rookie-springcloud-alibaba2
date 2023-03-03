package com.rookie.bigdata.config;

import com.alibaba.cloud.nacos.loadbalancer.NacosLoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerRequestTransformer;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.support.HttpRequestWrapper;

/**
 * @Classname CustomLoadBalancerConfiguration
 * @Description TODO
 * @Author rookie
 * @Date 2023/2/28 16:01
 * @Version 1.0
 */
@Configuration
public class CustomLoadBalancerConfiguration {

    @Bean
    ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment,
                                                            LoadBalancerClientFactory loadBalancerClientFactory) {
        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//
        //参考NacosLoadBalancerClientConfiguration
//        return new NacosLoadBalancer(loadBalancerClientFactory
//                .getLazyProvider(name, ServiceInstanceListSupplier.class),
//                name);

        //随机负载均衡
        return new RandomLoadBalancer(loadBalancerClientFactory
                .getLazyProvider(name, ServiceInstanceListSupplier.class),
                name);
            //Robin方式负载均衡
//        return new RoundRobinLoadBalancer(loadBalancerClientFactory
//                .getLazyProvider(name, ServiceInstanceListSupplier.class),
//                name);




    }


//    //http请求转换
//    @Bean
//    public LoadBalancerRequestTransformer transformer() {
//        return new LoadBalancerRequestTransformer() {
//            @Override
//            public HttpRequest transformRequest(HttpRequest request, ServiceInstance instance) {
//                return new HttpRequestWrapper(request) {
//                    @Override
//                    public HttpHeaders getHeaders() {
//                        HttpHeaders headers = new HttpHeaders();
//                        headers.putAll(super.getHeaders());
//                        headers.add("X-InstanceId", instance.getInstanceId());
//                        return headers;
//                    }
//                };
//            }
//        };
//    }

}
