package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/{phone}", method = RequestMethod.GET)
    public User findOneUser(@PathVariable("phone") String phone) {
        return userService.findUserByPhone(phone);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public void modifyUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @RequestMapping(value = "/api/user/{phone}", method = RequestMethod.DELETE)
    public void modifyUser(@PathVariable("phone") String phone) {
        userService.deleteUserByPhone(phone);
    }

}
