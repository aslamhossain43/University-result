/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptACO.Controller;
import atif.aslam.deptACO.Model.DeptAco;
import atif.aslam.deptACO.Service.AcoService;
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
@RequestMapping(value = "/adminACO/")
public class AcoController {
      @Autowired
     AcoService acoService;
      
      
    @RequestMapping("/")
    public String listAco(Map<String, Object> map) {
        map.put("aco", new DeptAco());
        map.put("listAco", acoService.listAco());

        return "adminACO";
    }

    @RequestMapping(value = "/aco/add", method = RequestMethod.POST)
    public String addAco(@ModelAttribute("aco") DeptAco aco, BindingResult bindingResult) {
        if (aco.getId() == null) {
            acoService.addAco(aco);
            
        } else {
            acoService.updateAco(aco);
        }
        return "redirect:/adminACO/";
    }

    @RequestMapping("/delete/{pid}")
    public String deleteAco(@PathVariable("pid") Integer pid) {
        acoService.removeAco(pid);
        return "redirect:/adminACO/";
    }

    @RequestMapping("/edit/{pid}")
    public String editAco(@PathVariable("pid") Integer pid, Map<String, Object> map) {
        map.put("aco", acoService.getAcoById(pid));
        map.put("listAco", acoService.listAco());
        return "adminACO";
       
         
    }
}
