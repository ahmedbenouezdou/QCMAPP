package net.qcm.controller;

import net.qcm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by benouezdouahmed on 21/11/2014.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<User> getListUser(){
        return null;
    }


    public User getIdUser(){
        return null;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void NewUser(){

    }

    @RequestMapping(value = "/add", method = RequestMethod.GET , produces = "application/json")
    @ResponseBody
    public void addNewUserList(){

    }

}
