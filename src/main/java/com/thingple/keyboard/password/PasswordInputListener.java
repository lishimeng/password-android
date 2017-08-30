package com.thingple.keyboard.password;

/**
 * 自定义接口，用于给密码输入完成添加回掉事件
 */
public interface PasswordInputListener {
    void onInputFinish(String password);
}