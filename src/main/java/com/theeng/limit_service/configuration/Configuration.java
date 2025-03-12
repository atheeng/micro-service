package com.theeng.limit_service.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data //Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("limit-service")
public class Configuration {
    public int min;
    public int max;
}
