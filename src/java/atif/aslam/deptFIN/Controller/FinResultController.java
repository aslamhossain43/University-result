/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Controller;

import atif.aslam.deptFIN.Service.FinService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptFIN/")
public class FinResultController {
     @Autowired
      FinService finService;
      
      
        
    @RequestMapping("/")
    public String listFin(Map<String, Object> map) {
       // map.put("fin", new DeptFin());
        map.put("listFin", finService.listFin());

        return "deptFIN";
    }

}
