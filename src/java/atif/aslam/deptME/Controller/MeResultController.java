/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptME.Controller;

import atif.aslam.deptME.Service.MeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptME/")
public class MeResultController {
     @Autowired
     MeService meService;

    @RequestMapping("/")
    public String listMe(Map<String, Object> map) {
      //  map.put("me", new DeptMe());
        map.put("listMe", meService.listMe());

        return "deptME";
    }

}
