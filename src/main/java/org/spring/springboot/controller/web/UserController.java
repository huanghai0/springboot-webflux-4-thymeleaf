package org.spring.springboot.controller.web;


import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Book 控制层
 * <p>
 * Created by bysocket on 30/09/2017.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static final String USER_FORM_PATH_NAME = "userForm";
    private static final String USER_LIST_PATH_NAME = "userList";
    private static final String USER_FORM_UPDATE = "userFormUpdate";
    private static final String REDIRECT_TO_USER_URL = "redirect:/user";

    @Autowired
    UserService userService;

    /**
     * 获取 User 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map) {
        map.addAttribute("userList", userService.findAllUser());
        return USER_LIST_PATH_NAME;
    }

    /**
     * 获取创建 User 表单
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createBookForm(ModelMap map) {
        map.addAttribute("user", new User());
        map.addAttribute("action", "create");
        return USER_FORM_PATH_NAME;
    }


    /**
     * 创建 User
     * 处理 "/user/create" 的 POST 请求，用来新建 Book 信息
     * 通过 @ModelAttribute 绑定表单实体参数，也通过 @RequestParam 传递参数
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postBook(@ModelAttribute User user) {
        userService.saveUser(user);
        return REDIRECT_TO_USER_URL;
    }

    /**
     * 获取更新 User 表单
     * 处理 "/user/update/{id}" 的 GET 请求，通过 URL 中的 id 值获取 Book 信息
     * URL 中的 id ，通过 @PathVariable 绑定参数
     */
    @RequestMapping(value = "/update/{phone}", method = RequestMethod.GET)
    public String getUser(@PathVariable String phone, ModelMap map) {
        map.addAttribute("user", userService.findUserByPhone(phone));
        System.out.println(map.get("user").toString() + "--------------------->>>>>");
        map.addAttribute("action", "update");
        return USER_FORM_UPDATE;
    }

    /**
     * 更新 User
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(@ModelAttribute User user) {
        System.out.println(user.getPwd() + "--------------------->>>>>");
        userService.updateUser(user);
        return REDIRECT_TO_USER_URL;
    }

    /**
     * 删除 User
     * 处理 "/book/{id}" 的 GET 请求，用来删除 Book 信息
     */
    @RequestMapping(value = "/delete/{phone}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("phone") String phone) {
        userService.deleteUserByPhone(phone);
        return REDIRECT_TO_USER_URL;
    }

}
