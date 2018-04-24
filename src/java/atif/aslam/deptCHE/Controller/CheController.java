/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCHE.Controller;

import atif.aslam.deptCHE.Model.DeptChe;
import atif.aslam.deptCHE.Service.CheService;
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
@RequestMapping(value = "/adminCHE/")
public class CheController {
     @Autowired
     CheService cheService;

    @RequestMapping("/")
    public String listChe(Map<String, Object> map) {
        map.put("che", new DeptChe());
        map.put("listChe", cheService.listChe());

        return "adminCHE";
    }

    @RequestMapping(value = "/che/add", method = RequestMethod.POST)
    public String addChe(@ModelAttribute("che") DeptChe che, BindingResult bindingResult) {
        if (che.getId() == null) {
            cheService.addChe(che);
            
        } else {
            cheService.updateChe(che);
        }
        return "redirect:/adminCHE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteChe(@PathVariable("pid") Integer pid) {
        cheService.removeChe(pid);
        return "redirect:/adminCHE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editChe(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("che", cheService.getCheById(pid));
        map.put("listChe", cheService.listChe());
        return "adminCHE";
       
         
    }
}
