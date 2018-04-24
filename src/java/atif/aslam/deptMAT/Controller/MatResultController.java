/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAT.Controller;

import atif.aslam.deptMAT.Service.MatService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptMAT/")
public class MatResultController {
         @Autowired
      MatService matService;
    @RequestMapping("/")
    public String listMat(Map<String, Object> map) {
       // map.put("mat", new DeptMat());
        map.put("listMat", matService.listMat());

        return "deptMAT";
    }
}
