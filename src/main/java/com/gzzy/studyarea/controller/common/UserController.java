package com.gzzy.studyarea.controller.common;

import com.gzzy.studyarea.dto.AbstractOutputDto;
import com.gzzy.studyarea.entity.common.User;
import com.gzzy.studyarea.service.common.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    @ApiOperation(value = "查询用户",notes = "查询用户")
    public AbstractOutputDto queryUser(){
        AbstractOutputDto obj = new AbstractOutputDto();
        List<User> users = userService.queryUser();
        obj.setDatalist(users);
        return obj;
    }
}
