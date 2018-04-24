/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSTA.Controller;

import atif.aslam.deptSTA.Service.StaService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptSTA/")
public class StaResultController {
      @Autowired
     StaService staService;
      
      
        
    @RequestMapping("/")
    public String listSta(Map<String, Object> map) {
       // map.put("sta", new DeptSta());
        map.put("listSta", staService.listSta());

        return "deptSTA";
    }
}
