/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAgriculture.Controller;

import atif.aslam.deptAgriculture.Model.Deptag;
import atif.aslam.deptAgriculture.Service.AgService;
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
@RequestMapping(value = "/agriculture")
public class AgController {
     @Autowired
    AgService agService;

    @RequestMapping("/")
    public String listAg(Map<String, Object> map) {
        map.put("ag", new Deptag());
        map.put("listAg", agService.listAg());

        return "addAg";
    }

    @RequestMapping(value = "/ag/add", method = RequestMethod.POST)
    public String addAg(@ModelAttribute("ag") Deptag ag, BindingResult bindingResult) {
        if (ag.getId() == null) {
            agService.addAg(ag);
            
        } else {
            agService.updateAg(ag);
        }
        return "redirect:/agriculture/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteAg(@PathVariable("pid") Integer pid) {
        agService.removeAg(pid);
        return "redirect:/agriculture/";
    }

    @RequestMapping("/edit/{pid}")
    public String editAg(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("ag", agService.getAgById(pid));
        map.put("listAg", agService.listAg());
        return "addAg";
       
         
    }
}
