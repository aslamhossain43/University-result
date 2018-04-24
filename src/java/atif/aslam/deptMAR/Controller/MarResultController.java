/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAR.Controller;

import atif.aslam.deptMAR.Service.MarService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptMAR/")
public class MarResultController {
         @Autowired
      MarService marService;
    @RequestMapping("/")
    public String listMar(Map<String, Object> map) {
       // map.put("mar", new DeptMar());
        map.put("listMar", marService.listMar());

        return "deptMAR";
    }
}
