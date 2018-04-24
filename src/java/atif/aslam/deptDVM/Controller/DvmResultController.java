/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptDVM.Controller;

import atif.aslam.deptDVM.Service.DvmService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/deptDVM/")
public class DvmResultController {
     @Autowired
     DvmService dvmService;

    @RequestMapping("/")
    public String listDvm(Map<String, Object> map) {
       // map.put("dvm", new DeptDvm());
        map.put("listDvm", dvmService.listDvm());

        return "deptDVM";
    }

    
}
