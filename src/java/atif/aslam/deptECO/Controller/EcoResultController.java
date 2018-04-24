/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECO.Controller;

import atif.aslam.deptECO.Service.EcoService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptECO/")
public class EcoResultController {
     @Autowired
     EcoService ecoService;

    @RequestMapping("/")
    public String listEco(Map<String, Object> map) {
       // map.put("eco", new DeptEco());
        map.put("listEco", ecoService.listEco());

        return "deptECO";
    }
    
}

