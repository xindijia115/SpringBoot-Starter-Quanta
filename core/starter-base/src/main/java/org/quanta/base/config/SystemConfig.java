package org.quanta.base.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "quanta.system")
public class SystemConfig {
    Boolean debug = false;
}
