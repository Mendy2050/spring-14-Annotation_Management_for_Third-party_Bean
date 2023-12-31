package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @author Mendy
 * @create 2023-06-21 18:04
 */

@Configuration
@ComponentScan("com.itheima.dao")
@Import(JdbcConfig.class)
public class SpringConfig {
}

