/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptENG.Controller;

import atif.aslam.deptENG.Model.DeptEng;
import atif.aslam.deptENG.Service.EngService;
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
@RequestMapping(value = "/adminENG/")
public class EngController {
      @Autowired
     EngService engService;
     
     
    @RequestMapping("/")
    public String listEng(Map<String, Object> map) {
        map.put("eng", new DeptEng());
        map.put("listEng", engService.listEng());

        return "adminENG";
    }

    @RequestMapping(value = "/eng/add", method = RequestMethod.POST)
    public String addEng(@ModelAttribute("eng") DeptEng eng, BindingResult bindingResult) {
        if (eng.getId() == null) {
            engService.addEng(eng);
            
        } else {
            engService.updateEng(eng);
        }
        return "redirect:/adminENG/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteEng(@PathVariable("pid") Integer pid) {
        engService.removeEng(pid);
        return "redirect:/adminENG/";
    }

    @RequestMapping("/edit/{pid}")
    public String editEng(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("eng", engService.getEngById(pid));
        map.put("listEng", engService.listEng());
        return "adminENG";
       
         
    }
}
