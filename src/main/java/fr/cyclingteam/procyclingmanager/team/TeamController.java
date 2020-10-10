package fr.cyclingteam.procyclingmanager.team;


import fr.cyclingteam.procyclingmanager.entities.Team;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;

@RestController
@RequestMapping(value = "teams")
@Slf4j
public class TeamController extends Thread {

    private final TeamService teamService;


    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{id}")
    public TeamDto getTeamById(@PathVariable("id") Long id){
        return teamService.getTeamById(id);
    }


    @GetMapping
    public List<TeamDto> getAllTeams(){
        return teamService.getAllTeams();
    }

    @PostMapping
    public String createTeam(@RequestBody Team team){
        teamService.createTeam(team);



        return "creation successful";
    }

    @PostConstruct
    public void test(){

        log.info("je suis passé par là");

        List maListe = new ArrayList();
        maListe.add("test1");
        maListe.add("test2");
        maListe.add("test3");
        maListe.add("test4");
        maListe.add("test5");


        for (int i = 0; i < maListe.size(); i++){
            if (maListe.get(i).equals("test3")) maListe.remove(i);
        }




    }


}
