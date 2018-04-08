package com.dxc.ihub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.ihub.model.DatabaseInfo;
import com.dxc.ihub.model.Person;

@Controller
public class MainController {
	@Autowired
	private DatabaseInfo databaseInfo;
	
    private static List<Person> persons = new ArrayList<Person>();
 
    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        String message = "Hello Spring Boot + JSP";
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
    	persons.add(new Person(databaseInfo.getDatabaseUrl(), databaseInfo.getDatabaseUrl()));
        model.addAttribute("persons", persons);
 
        return "personList";
    }

}
