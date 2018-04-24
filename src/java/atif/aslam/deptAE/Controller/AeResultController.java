/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAE.Controller;

import atif.aslam.deptAE.Service.AeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptAE/")
public class AeResultController {
     @Autowired
     AeService aeService;
      
      
    @RequestMapping("/")
    public String listAe(Map<String, Object> map) {
       // map.put("ae", new DeptAe());
        map.put("listAe", aeService.listAe());

        return "deptAE";
    }
}