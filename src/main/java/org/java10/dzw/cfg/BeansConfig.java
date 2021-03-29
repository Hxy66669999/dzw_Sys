package org.java10.dzw.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "org.java10.dzw.dao" })
public class BeansConfig {
}
