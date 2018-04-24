/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptEEE.Controller;

import atif.aslam.deptEEE.Service.EeeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptEEE/")
public class EeeResultController {
     @Autowired
     EeeService eeeService;

    @RequestMapping("/")
    public String listEee(Map<String, Object> map) {
       // map.put("eee", new DeptEee());
        map.put("listEee", eeeService.listEee());

        return "deptEEE";
    }

   
}
