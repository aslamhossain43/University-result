/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCSE.Controller;

import atif.aslam.deptCSE.Model.DeptCse;
import atif.aslam.deptCSE.Service.CseService;
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
@RequestMapping(value = "/adminCSE/")
public class CseController {
     @Autowired
     CseService cseService;

    @RequestMapping("/")
    public String listCse(Map<String, Object> map) {
        map.put("cse", new DeptCse());
        map.put("listCse", cseService.listCse());

        return "adminCSE";
    }

    @RequestMapping(value = "/cse/add", method = RequestMethod.POST)
    public String addCse(@ModelAttribute("cse") DeptCse cse, BindingResult bindingResult) {
        if (cse.getId() == null) {
            cseService.addCse(cse);
            
        } else {
            cseService.updateCse(cse);
        }
        return "redirect:/adminCSE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteCse(@PathVariable("pid") Integer pid) {
        cseService.removeCse(pid);
        return "redirect:/adminCSE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editCse(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("cse", cseService.getCseById(pid));
        map.put("listCse", cseService.listCse());
        return "adminCSE";
       
         
    }
}
