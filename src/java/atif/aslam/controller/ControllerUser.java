
package atif.aslam.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class ControllerUser {
   @RequestMapping(value = "/")
   public String index(){
        
      return "index";
   }
    @RequestMapping(value = "/ag")
    public String ag(){
        
        return "ag";
    }
     @RequestMapping(value = "/cse")
    public String cse(){
        
        return "cse";
    }
    
     @RequestMapping(value = "/fisheries")
    public String fisheries(){
        
        return "fisheries";
    }
     @RequestMapping(value = "/dvm")
    public String dvm(){
        
        return "dvm";
    }
     @RequestMapping(value = "/bba")
    public String bba(){
        
        return "bba";
    }
     @RequestMapping(value = "/eng")
    public String eng(){
        
        return "eng";
    }
     @RequestMapping(value = "/science")
    public String science(){
        
        return "science";
    }
     @RequestMapping(value = "/ssl")
    public String ssl(){
        
        return "ssl";
    }
   
   
}
