package com.lwj.study.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author liangwj9
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello (){
        return "hello boy!";
    }
}
