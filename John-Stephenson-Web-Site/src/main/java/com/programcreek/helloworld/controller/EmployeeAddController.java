package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.programcreek.helloworld.model.Employee;
import com.programcreek.helloworld.service.EmployeeManager;

@Controller
public class EmployeeAddController {
    @RequestMapping("/showEmployeeForm")
    public ModelAndView getEmployeeForm(){
        ModelAndView mv = new ModelAndView("employeeAdd");
        mv.addObject("employeeEntity", new Employee());
        return mv;
    }

    @RequestMapping("/addEmployee")
    public ModelAndView addEmployee(@ModelAttribute Employee e){
        ModelAndView mv = new ModelAndView("employeeList");

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(e);
        mv.addObject("employeeList", employeeManager.getEmployeeList());

        return mv;
	}
}