/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAT.Controller;

import atif.aslam.deptMAT.Model.DeptMat;
import atif.aslam.deptMAT.Service.MatService;
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
@RequestMapping(value = "/adminMAT/")
public class MatController {
     
     @Autowired
      MatService matService;
      
      
        
    @RequestMapping("/")
    public String listMat(Map<String, Object> map) {
        map.put("mat", new DeptMat());
        map.put("listMat", matService.listMat());

        return "adminMAT";
    }

    @RequestMapping(value = "/mat/add", method = RequestMethod.POST)
    public String addMat(@ModelAttribute("mat") DeptMat mat, BindingResult bindingResult) {
        if (mat.getId() == null) {
            matService.addMat(mat);
            
        } else {
            matService.updateMat(mat);
        }
        return "redirect:/adminMAT/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteMat(@PathVariable("pid") Integer pid) {
        matService.removeMat(pid);
        return "redirect:/adminMAT/";
    }

    @RequestMapping("/edit/{pid}")
    public String editMat(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("mat", matService.getMatById(pid));
        map.put("listMat", matService.listMat());
        return "adminMAT";
       
         
    }
    
    
}
