/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFPE.Controller;

import atif.aslam.deptFPE.Model.DeptFpe;
import atif.aslam.deptFPE.Service.FpeService;
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
@RequestMapping(value = "/adminFPE/")
public class FpeController {
     @Autowired
      FpeService fpeService;
      
      
        
    @RequestMapping("/")
    public String listFpe(Map<String, Object> map) {
        map.put("fpe", new DeptFpe());
        map.put("listFpe", fpeService.listFpe());

        return "adminFPE";
    }

    @RequestMapping(value = "/fpe/add", method = RequestMethod.POST)
    public String addFpe(@ModelAttribute("fpe") DeptFpe fpe, BindingResult bindingResult) {
        if (fpe.getId() == null) {
            fpeService.addFpe(fpe);
            
        } else {
            fpeService.updateFpe(fpe);
        }
        return "redirect:/adminFPE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteFpe(@PathVariable("pid") Integer pid) {
        fpeService.removeFpe(pid);
        return "redirect:/adminFPE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editFpe(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("fpe", fpeService.getFpeById(pid));
        map.put("listFpe", fpeService.listFpe());
        return "adminFPE";
       
         
    }
}
