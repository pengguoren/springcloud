package com.cq.cloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

	/**
     * 切换负载均衡算法
	 * @return
     */
	@Bean
	public IRule myRule() {
		return new RoundRobinRule();
	}

	
}

//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">