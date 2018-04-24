/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECO.Controller;

import atif.aslam.deptECO.Model.DeptEco;
import atif.aslam.deptECO.Service.EcoService;
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
@RequestMapping(value = "/adminECO/")
public class EcoController {
     @Autowired
     EcoService ecoService;

    @RequestMapping("/")
    public String listEco(Map<String, Object> map) {
        map.put("eco", new DeptEco());
        map.put("listEco", ecoService.listEco());

        return "adminECO";
    }

    @RequestMapping(value = "/eco/add", method = RequestMethod.POST)
    public String addEco(@ModelAttribute("eco") DeptEco eco, BindingResult bindingResult) {
        if (eco.getId() == null) {
            ecoService.addEco(eco);
            
        } else {
            ecoService.updateEco(eco);
        }
        return "redirect:/adminECO/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteEco(@PathVariable("pid") Integer pid) {
        ecoService.removeEco(pid);
        return "redirect:/adminECO/";
    }

    @RequestMapping("/edit/{pid}")
    public String editEco(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("eco", ecoService.getEcoById(pid));
        map.put("listEco", ecoService.listEco());
        return "adminECO";
       
         
    }
}
