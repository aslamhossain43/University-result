/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptACO.Controller;

import atif.aslam.deptACO.Service.AcoService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptACO/")
public class AcoResultController {
     @Autowired
     AcoService acoService;
      
      
    @RequestMapping("/")
    public String listAco(Map<String, Object> map) {
      //  map.put("aco", new DeptAco());
        map.put("listAco", acoService.listAco());

        return "deptACO";
    }

}
