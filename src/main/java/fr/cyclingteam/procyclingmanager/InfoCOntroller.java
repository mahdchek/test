package fr.cyclingteam.procyclingmanager;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoCOntroller {




    @GetMapping("/info")
    public String test(){
        return "test info ok";
    }

}
