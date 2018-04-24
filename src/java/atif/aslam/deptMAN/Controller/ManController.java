/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAN.Controller;

import atif.aslam.deptMAN.Model.DeptMan;
import atif.aslam.deptMAN.Service.ManService;
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
@RequestMapping(value = "/adminMAN/")
public class ManController {
    
     @Autowired
      ManService manService;
      
      
        
    @RequestMapping("/")
    public String listMan(Map<String, Object> map) {
        map.put("man", new DeptMan());
        map.put("listMan", manService.listMan());

        return "adminMAN";
    }

    @RequestMapping(value = "/man/add", method = RequestMethod.POST)
    public String addMan(@ModelAttribute("man") DeptMan man, BindingResult bindingResult) {
        if (man.getId() == null) {
            manService.addMan(man);
            
        } else {
            manService.updateMan(man);
        }
        return "redirect:/adminMAN/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteMan(@PathVariable("pid") Integer pid) {
        manService.removeMan(pid);
        return "redirect:/adminMAN/";
    }

    @RequestMapping("/edit/{pid}")
    public String editMan(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("man", manService.getManById(pid));
        map.put("listMan", manService.listMan());
        return "adminMAN";
       
         
    }
    
    
}
