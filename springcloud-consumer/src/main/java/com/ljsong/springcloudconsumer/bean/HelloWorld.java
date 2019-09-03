package com.ljsong.springcloudconsumer.bean;


/**
 * @author ljsong
 * @date 2019/2/19  11:16
 */

import org.springframework.stereotype.Component;

/**
 * //@Component //如果这里添加了注解那么在自动配置类的时候就不用添加@enableConfigurationProperties(HelloProperties.class)注解.
 */
@Component
public class HelloWorld {

    /**
     * //现在我们在配置文件写hello.msg=world,因为简单就不再展示;如果那么默认为default.
     */
    private String msg = "default";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
