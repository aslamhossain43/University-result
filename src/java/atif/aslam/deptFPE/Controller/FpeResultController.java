/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFPE.Controller;

import atif.aslam.deptFPE.Service.FpeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptFPE/")
public class FpeResultController {
     @Autowired
      FpeService fpeService;
      
      
        
    @RequestMapping("/")
    public String listFpe(Map<String, Object> map) {
       // map.put("fpe", new DeptFpe());
        map.put("listFpe", fpeService.listFpe());

        return "deptFPE";
    }
}
