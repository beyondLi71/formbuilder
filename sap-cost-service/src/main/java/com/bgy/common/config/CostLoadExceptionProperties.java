package com.bgy.common.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author beyondLi
 */
@PropertySource(value = "cost-exception.properties", encoding = "UTF-8")
@Component
public class CostLoadExceptionProperties {

}
