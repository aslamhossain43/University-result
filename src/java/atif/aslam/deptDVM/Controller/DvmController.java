/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptDVM.Controller;

import atif.aslam.deptDVM.Model.DeptDvm;
import atif.aslam.deptDVM.Service.DvmService;
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
@RequestMapping(value = "/adminDVM/")
public class DvmController {
     @Autowired
     DvmService dvmService;
     
      @RequestMapping("/")
    public String listDvm(Map<String, Object> map) {
        map.put("dvm", new DeptDvm());
        map.put("listDvm", dvmService.listDvm());

        return "adminDVM";
    }

    @RequestMapping(value = "/dvm/add", method = RequestMethod.POST)
    public String addDvm(@ModelAttribute("dvm") DeptDvm dvm, BindingResult bindingResult) {
        if (dvm.getId() == null) {
            dvmService.addDvm(dvm);
            
        } else {
            dvmService.updateDvm(dvm);
        }
        return "redirect:/adminDVM/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteDvm(@PathVariable("pid") Integer pid) {
        dvmService.removeDvm(pid);
        return "redirect:/adminDVM/";
    }

    @RequestMapping("/edit/{pid}")
    public String editDvm(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("dvm", dvmService.getDvmById(pid));
        map.put("listDvm", dvmService.listDvm());
        return "adminDVM";
       
         
    }
}
