/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCE.Controller;

import atif.aslam.deptCE.Service.CeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptCE/")
public class CeResultController {
     @Autowired
     CeService ceService;

    @RequestMapping("/")
    public String listCe(Map<String, Object> map) {
      //  map.put("ce", new DeptCe());
        map.put("listCe", ceService.listCe());

        return "deptCE";
    }

}
