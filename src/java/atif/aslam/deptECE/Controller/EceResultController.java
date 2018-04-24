/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECE.Controller;

import atif.aslam.deptECE.Service.EceService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptECE/")
public class EceResultController {
     @Autowired
     EceService eceService;

    @RequestMapping("/")
    public String listEce(Map<String, Object> map) {
       // map.put("ece", new DeptEce());
        map.put("listEce", eceService.listEce());

        return "deptECE";
    }

   
}
