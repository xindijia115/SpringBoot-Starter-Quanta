package org.quanta.backend.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@Data
public class AuthDTO {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
}
