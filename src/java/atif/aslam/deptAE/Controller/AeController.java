/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAE.Controller;

import atif.aslam.deptAE.Model.DeptAe;
import atif.aslam.deptAE.Service.AeService;
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
@RequestMapping(value = "/adminAE/")
public class AeController {
     @Autowired
     AeService aeService;
      
      
    @RequestMapping("/")
    public String listAe(Map<String, Object> map) {
        map.put("ae", new DeptAe());
        map.put("listAe", aeService.listAe());

        return "adminAE";
    }

    @RequestMapping(value = "/ae/add", method = RequestMethod.POST)
    public String addAe(@ModelAttribute("ae") DeptAe ae, BindingResult bindingResult) {
        if (ae.getId() == null) {
            aeService.addAe(ae);
            
        } else {
            aeService.updateAe(ae);
        }
        return "redirect:/adminAE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteAe(@PathVariable("pid") Integer pid) {
        aeService.removeAe(pid);
        return "redirect:/adminAE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editAe(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("ae", aeService.getAeById(pid));
        map.put("listAe", aeService.listAe());
        return "adminAE";
       
         
    }
}
