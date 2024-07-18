package org.quanta.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.quanta.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * Author: DJ
 * Date: 2024/7/18
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
