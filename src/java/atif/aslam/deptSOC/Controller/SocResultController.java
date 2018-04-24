/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSOC.Controller;

import atif.aslam.deptSOC.Service.SocService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptSOC/")
public class SocResultController {
      @Autowired
     SocService socService;
      
      
        
    @RequestMapping("/")
    public String listSoc(Map<String, Object> map) {
       // map.put("soc", new DeptSoc());
        map.put("listSoc", socService.listSoc());

        return "deptSOC";
    }
}
