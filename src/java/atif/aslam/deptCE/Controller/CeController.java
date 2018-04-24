/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCE.Controller;

import atif.aslam.deptCE.Model.DeptCe;
import atif.aslam.deptCE.Service.CeService;
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
@RequestMapping(value = "/adminCE/")
public class CeController {
     @Autowired
     CeService ceService;

    @RequestMapping("/")
    public String listCe(Map<String, Object> map) {
        map.put("ce", new DeptCe());
        map.put("listCe", ceService.listCe());

        return "adminCE";
    }

    @RequestMapping(value = "/ce/add", method = RequestMethod.POST)
    public String addCe(@ModelAttribute("ce") DeptCe ce, BindingResult bindingResult) {
        if (ce.getId() == null) {
            ceService.addCe(ce);
            
        } else {
            ceService.updateCe(ce);
        }
        return "redirect:/adminCE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteCe(@PathVariable("pid") Integer pid) {
        ceService.removeCe(pid);
        return "redirect:/adminCE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editCe(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("ce", ceService.getCeById(pid));
        map.put("listCe", ceService.listCe());
        return "adminCE";
       
         
    }
}
