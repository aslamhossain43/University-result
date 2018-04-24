/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAR.Controller;

import atif.aslam.deptAR.Service.ArService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptAR/")
public class ArResultController {
     @Autowired
     ArService arService;
      
      
    @RequestMapping("/")
    public String listAr(Map<String, Object> map) {
       // map.put("ar", new DeptAr());
        map.put("listAr", arService.listAr());

        return "deptAR";
    }
}