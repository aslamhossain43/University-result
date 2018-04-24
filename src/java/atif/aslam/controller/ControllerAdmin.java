
package atif.aslam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class ControllerAdmin {
    
  @RequestMapping(value = "/")
    public String admin(){
        
        return "admin";
    }
    
     @RequestMapping(value = "/addCSE")
    public String cse(){
        
        return "addCSE";
    }
    
    
     @RequestMapping(value = "/addBBA")
    public String bba(){
        
        return "addBBA";
    }
     @RequestMapping(value = "/addEng")
    public String eng(){
        
        return "addEng";
    }
     @RequestMapping(value = "/addScience")
    public String science(){
        
        return "addScience";
    }
     @RequestMapping(value = "/addSSL")
    public String ssl(){
        
        return "addSSL";
    }
  
    
    
    
}
