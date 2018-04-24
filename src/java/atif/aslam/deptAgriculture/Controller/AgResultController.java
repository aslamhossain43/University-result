/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAgriculture.Controller;

import atif.aslam.deptAgriculture.Service.AgService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/agResult")
public class AgResultController {
     @Autowired
    AgService agService;

    @RequestMapping("/")
    public String listAg(Map<String, Object> map) {
      //  map.put("ag", new Deptag());
        map.put("listAg", agService.listAg());

        return "ag";
    }

   
}
