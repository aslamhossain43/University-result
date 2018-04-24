/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAR.Controller;

import atif.aslam.deptAR.Model.DeptAr;
import atif.aslam.deptAR.Service.ArService;
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
@RequestMapping(value = "/adminAR/")
public class ArController {
     @Autowired
     ArService arService;
      
      
    @RequestMapping("/")
    public String listAr(Map<String, Object> map) {
        map.put("ar", new DeptAr());
        map.put("listAr", arService.listAr());

        return "adminAR";
    }

    @RequestMapping(value = "/ar/add", method = RequestMethod.POST)
    public String addAr(@ModelAttribute("ar") DeptAr ar, BindingResult bindingResult) {
        if (ar.getId() == null) {
            arService.addAr(ar);
            
        } else {
            arService.updateAr(ar);
        }
        return "redirect:/adminAR/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteAr(@PathVariable("pid") Integer pid) {
        arService.removeAr(pid);
        return "redirect:/adminAR/";
    }

    @RequestMapping("/edit/{pid}")
    public String editAr(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("ar", arService.getArById(pid));
        map.put("listAr", arService.listAr());
        return "adminAR";
       
         
    }
}
