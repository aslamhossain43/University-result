/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFis.Controller;

import atif.aslam.deptFis.Model.DeptFis;
import atif.aslam.deptFis.Service.FisService;
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
@RequestMapping(value = "/adminFIS/")
public class FisController {
      @Autowired
      FisService fisService;
      
      
        
    @RequestMapping("/")
    public String listFis(Map<String, Object> map) {
        map.put("fis", new DeptFis());
        map.put("listFis", fisService.listFis());

        return "adminFIS";
    }

    @RequestMapping(value = "/fis/add", method = RequestMethod.POST)
    public String addFis(@ModelAttribute("fis") DeptFis fis, BindingResult bindingResult) {
        if (fis.getId() == null) {
            fisService.addFis(fis);
            
        } else {
            fisService.updateFis(fis);
        }
        return "redirect:/adminFIS/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteFis(@PathVariable("pid") Integer pid) {
        fisService.removeFis(pid);
        return "redirect:/adminFIS/";
    }

    @RequestMapping("/edit/{pid}")
    public String editFis(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("fis", fisService.getFisById(pid));
        map.put("listFis", fisService.listFis());
        return "adminFIS";
       
         
    }
      
}
