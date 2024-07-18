package org.quanta.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@Data
public class Goods {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("name")
    private String name;
    @TableField("price")
    private BigDecimal price;
    @TableField("inventory")
    private Integer inventory;
    @TableLogic
    private Integer isDeleted;
}
