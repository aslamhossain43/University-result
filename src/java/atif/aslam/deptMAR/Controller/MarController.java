/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAR.Controller;

import atif.aslam.deptMAR.Model.DeptMar;
import atif.aslam.deptMAR.Service.MarService;
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
@RequestMapping(value = "/adminMAR/")
public class MarController {
     
     @Autowired
      MarService marService;
      
      
        
    @RequestMapping("/")
    public String listMar(Map<String, Object> map) {
        map.put("mar", new DeptMar());
        map.put("listMar", marService.listMar());

        return "adminMAR";
    }

    @RequestMapping(value = "/mar/add", method = RequestMethod.POST)
    public String addMar(@ModelAttribute("mar") DeptMar mar, BindingResult bindingResult) {
        if (mar.getId() == null) {
            marService.addMar(mar);
            
        } else {
            marService.updateMar(mar);
        }
        return "redirect:/adminMAR/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteMar(@PathVariable("pid") Integer pid) {
        marService.removeMar(pid);
        return "redirect:/adminMAR/";
    }

    @RequestMapping("/edit/{pid}")
    public String editMar(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("mar", marService.getMarById(pid));
        map.put("listMar", marService.listMar());
        return "adminMAR";
       
         
    }
    
    
}
