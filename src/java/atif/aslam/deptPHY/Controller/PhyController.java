/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptPHY.Controller;

import atif.aslam.deptPHY.Model.DeptPhy;
import atif.aslam.deptPHY.Service.PhyService;
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
@RequestMapping(value = "/adminPHY/")
public class PhyController {

    @Autowired
    PhyService phyService;

    @RequestMapping("/")
    public String listPhy(Map<String, Object> map) {
        map.put("phy", new DeptPhy());
        map.put("listPhy", phyService.listPhy());

        return "adminPHY";
    }

    @RequestMapping(value = "/phy/add", method = RequestMethod.POST)
    public String addPhy(@ModelAttribute("phy") DeptPhy phy, BindingResult bindingResult) {
        if (phy.getId() == null) {
            phyService.addPhy(phy);

        } else {
            phyService.updatePhy(phy);
        }
        return "redirect:/adminPHY/";
    }

    @RequestMapping("/delete/{pid}")
    public String deletePhy(@PathVariable("pid") Integer pid) {
        phyService.removePhy(pid);
        return "redirect:/adminPHY/";
    }

    @RequestMapping("/edit/{pid}")
    public String editPhy(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("phy", phyService.getPhyById(pid));
        map.put("listPhy", phyService.listPhy());
        return "adminPHY";

    }

}
