/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSOC.Controller;

import atif.aslam.deptSOC.Model.DeptSoc;
import atif.aslam.deptSOC.Service.SocService;
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
@RequestMapping(value = "/adminSOC/")
public class SocController {
      
     @Autowired
     SocService socService;
      
      
        
    @RequestMapping("/")
    public String listSoc(Map<String, Object> map) {
        map.put("soc", new DeptSoc());
        map.put("listSoc", socService.listSoc());

        return "adminSOC";
    }

    @RequestMapping(value = "/soc/add", method = RequestMethod.POST)
    public String addSoc(@ModelAttribute("soc") DeptSoc soc, BindingResult bindingResult) {
        if (soc.getId() == null) {
            socService.addSoc(soc);
            
        } else {
            socService.updateSoc(soc);
        }
        return "redirect:/adminSOC/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteSoc(@PathVariable("pid") Integer pid) {
        socService.removeSoc(pid);
        return "redirect:/adminSOC/";
    }

    @RequestMapping("/edit/{pid}")
    public String editSoc(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("soc", socService.getSocById(pid));
        map.put("listSoc", socService.listSoc());
        return "adminSOC";
       
         
    }
    
}
