package com.smith.familytask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by smith on 08.03.2015.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    @ResponseBody
    public String index() {
        return "guestbookasdasdasd111asd";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
//    @ResponseBody
    public String test() {
        return "test";
    }

    @RequestMapping("poke")
    @ResponseBody
    public String poke() {
        return "Poke poke";
    }

    @RequestMapping("poke1")
    @ResponseBody
    public String pokeMe() {
        return "Poke poke1111";
    }

}
