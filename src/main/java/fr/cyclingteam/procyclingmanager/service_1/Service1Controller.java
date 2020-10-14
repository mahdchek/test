package fr.cyclingteam.procyclingmanager.service_1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {



    @GetMapping("service-1")
    public String test(){
        return "test service 1 ok with pull request comments taken into account updated by mchekini";
    }


    @GetMapping("service-2")
    public String test2(){
        return "test service 2 ok with pull request comments taken into account";
    }

    @GetMapping("service-3")
    public String test3(){
        return "test service 3 ok with pull request comments taken into account";
    }

}
