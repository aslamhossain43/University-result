/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptENG.Controller;

import atif.aslam.deptENG.Service.EngService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptENG/")
public class EngResultController {
     @Autowired
     EngService engService;
     
     
    @RequestMapping("/")
    public String listEng(Map<String, Object> map) {
       // map.put("eng", new DeptEng());
        map.put("listEng", engService.listEng());

        return "deptENG";
    }
}
