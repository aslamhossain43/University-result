/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECE.Controller;

import atif.aslam.deptECE.Model.DeptEce;
import atif.aslam.deptECE.Service.EceService;
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
@RequestMapping(value = "/adminECE/")
public class EceController {
     @Autowired
     EceService eceService;

    @RequestMapping("/")
    public String listEce(Map<String, Object> map) {
        map.put("ece", new DeptEce());
        map.put("listEce", eceService.listEce());

        return "adminECE";
    }

    @RequestMapping(value = "/ece/add", method = RequestMethod.POST)
    public String addEce(@ModelAttribute("ece") DeptEce ece, BindingResult bindingResult) {
        if (ece.getId() == null) {
            eceService.addEce(ece);
            
        } else {
            eceService.updateEce(ece);
        }
        return "redirect:/adminECE/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteEce(@PathVariable("pid") Integer pid) {
        eceService.removeEce(pid);
        return "redirect:/adminECE/";
    }

    @RequestMapping("/edit/{pid}")
    public String editEce(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("ece", eceService.getEceById(pid));
        map.put("listEce", eceService.listEce());
        return "adminECE";
       
         
    }
}
