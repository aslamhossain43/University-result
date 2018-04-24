/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptEEE.Controller;

import atif.aslam.deptEEE.Model.DeptEee;
import atif.aslam.deptEEE.Service.EeeService;
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
@RequestMapping(value = "/adminEEE/")
public class EeeController {
     @Autowired
     EeeService eeeService;
     
     
    @RequestMapping("/")
    public String listEee(Map<String, Object> map) {
        map.put("eee", new DeptEee());
        map.put("listEee", eeeService.listEee());

        return "adminEEE";
    }

    @RequestMapping(value = "/eee/add", method = RequestMethod.POST)
    public String addEee(@ModelAttribute("eee") DeptEee eee, BindingResult bindingResult) {
        if (eee.getId() == null) {
            eeeService.addEee(eee);
            
        } else {
            eeeService.updateEee(eee);
        }
        return "redirect:/adminEEE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteEee(@PathVariable("pid") Integer pid) {
        eeeService.removeEee(pid);
        return "redirect:/adminEEE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editEee(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("eee", eeeService.getEeeById(pid));
        map.put("listEee", eeeService.listEee());
        return "adminEEE";
       
         
    }
}
