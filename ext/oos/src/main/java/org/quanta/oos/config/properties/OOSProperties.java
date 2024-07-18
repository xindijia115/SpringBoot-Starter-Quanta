package org.quanta.oos.config.properties;

import lombok.Data;

/**
 * Description: 通用配置
 * Param:
 * return:
 * Author: DJ
 * Date: 2024/7/18
 */
@Data
public class OOSProperties {
    String secretId;
    String secretKey;
    String bucketName;
    String urlPrefix;
}
