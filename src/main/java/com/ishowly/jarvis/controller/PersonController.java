package com.ishowly.jarvis.controller;

import com.ishowly.jarvis.model.Person;
import com.ishowly.jarvis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by zhangdongjie on 15-7-4.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Resource
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewPerson(ModelMap modelMap) {
        Person person = personService.getPersonById(2);
        if (person != null) {
            modelMap.addAttribute("name", person.getName());
            modelMap.addAttribute("age", person.getAge());
            modelMap.addAttribute("sex", person.getSex());
            return "person";
        } else {
            return "hello";
        }
    }
}
