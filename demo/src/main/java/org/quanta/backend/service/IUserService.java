package org.quanta.backend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.quanta.backend.entity.User;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
public interface IUserService extends IService<User> {
    String login(String username, String password);

    void register(String username, String password);
}
