/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Controller;

import atif.aslam.deptFIN.Model.DeptFin;
import atif.aslam.deptFIN.Service.FinService;
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
@RequestMapping(value = "/adminFIN/")
public class FinController {
     @Autowired
      FinService finService;
      
      
        
    @RequestMapping("/")
    public String listFin(Map<String, Object> map) {
        map.put("fin", new DeptFin());
        map.put("listFin", finService.listFin());

        return "adminFIN";
    }

    @RequestMapping(value = "/fin/add", method = RequestMethod.POST)
    public String addFin(@ModelAttribute("fin") DeptFin fin, BindingResult bindingResult) {
        if (fin.getId() == null) {
            finService.addFin(fin);
            
        } else {
            finService.updateFin(fin);
        }
        return "redirect:/adminFIN/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteFin(@PathVariable("pid") Integer pid) {
        finService.removeFin(pid);
        return "redirect:/adminFIN/";
    }

    @RequestMapping("/edit/{pid}")
    public String editFin(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("fin", finService.getFinById(pid));
        map.put("listFin", finService.listFin());
        return "adminFIN";
       
         
    }
      
}
