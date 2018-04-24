/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSTA.Controller;

import atif.aslam.deptSTA.Model.DeptSta;
import atif.aslam.deptSTA.Service.StaService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Atif Aslam
 */
@Controller
@RequestMapping(value = "/adminSTA/")
public class StaController {
     @Autowired
     StaService staService;
      
      
        
    @RequestMapping("/")
    public String listSta(Map<String, Object> map) {
        map.put("sta", new DeptSta());
        map.put("listSta", staService.listSta());

        return "adminSTA";
    }

    @RequestMapping(value = "/sta/add", method = RequestMethod.POST)
    public String addSta(@ModelAttribute("sta") DeptSta sta, BindingResult bindingResult) {
        if (sta.getId() == null) {
            staService.addSta(sta);
            
        } else {
            staService.updateSta(sta);
        }
        return "redirect:/adminSTA/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteSta(@PathVariable("pid") Integer pid) {
        staService.removeSta(pid);
        return "redirect:/adminSTA/";
    }

    @RequestMapping("/edit/{pid}")
    public String editSta(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("sta", staService.getStaById(pid));
        map.put("listSta", staService.listSta());
        return "adminSTA";
       
         
    }
    
}
