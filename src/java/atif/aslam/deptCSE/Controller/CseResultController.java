/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCSE.Controller;

import atif.aslam.deptCSE.Service.CseService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptCSE/")
public class CseResultController {
     @Autowired
     CseService cseService;

    @RequestMapping("/")
    public String listCse(Map<String, Object> map) {
       // map.put("cse", new DeptCse());
        map.put("listCse", cseService.listCse());

        return "deptCSE";
    }

}
