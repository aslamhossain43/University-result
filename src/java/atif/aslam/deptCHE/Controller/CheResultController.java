/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCHE.Controller;

import atif.aslam.deptCHE.Service.CheService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptCHE/")
public class CheResultController {
     @Autowired
     CheService cheService;

    @RequestMapping("/")
    public String listChe(Map<String, Object> map) {
       // map.put("che", new DeptChe());
        map.put("listChe", cheService.listChe());

        return "deptCHE";
    }

}
