/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptME.Controller;

import atif.aslam.deptME.Model.DeptMe;
import atif.aslam.deptME.Service.MeService;
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
@RequestMapping(value = "/adminME/")
public class MeController {
   @Autowired
     MeService meService;

    @RequestMapping("/")
    public String listMe(Map<String, Object> map) {
        map.put("me", new DeptMe());
        map.put("listMe", meService.listMe());

        return "adminME";
    }

    @RequestMapping(value = "/me/add", method = RequestMethod.POST)
    public String addMe(@ModelAttribute("me") DeptMe me, BindingResult bindingResult) {
        if (me.getId() == null) {
            meService.addMe(me);
            
        } else {
            meService.updateMe(me);
        }
        return "redirect:/adminME/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteMe(@PathVariable("pid") Integer pid) {
        meService.removeMe(pid);
        return "redirect:/adminME/";
    }

    @RequestMapping("/edit/{pid}")
    public String editMe(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("me", meService.getMeById(pid));
        map.put("listMe", meService.listMe());
        return "adminME";
       
         
    }
}
