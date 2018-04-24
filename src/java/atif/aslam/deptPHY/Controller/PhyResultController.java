/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptPHY.Controller;

import atif.aslam.deptPHY.Service.PhyService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptPHY/")
public class PhyResultController {
       
     @Autowired
     PhyService phyService;
      
      
        
    @RequestMapping("/")
    public String listPhy(Map<String, Object> map) {
       // map.put("phy", new DeptPhy());
        map.put("listPhy", phyService.listPhy());

        return "deptPHY";
    }

}
