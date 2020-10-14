package fr.cyclingteam.procyclingmanager.service_1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {



    @GetMapping("service-1")
    public String test(){
        return "test service 1 ok";
    }

}
