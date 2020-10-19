package fr.cyclingteam.procyclingmanager.team;


import fr.cyclingteam.procyclingmanager.entities.Team;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {


    private final TeamRepository repository;

    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }


    List<TeamDto> getAllTeams() {
        List<Team> team = repository.findAll();
        List<TeamDto> teamDtos = new ArrayList<>();
        for (Team t : team) {
            TeamDto tDto = TeamDto.builder()
                    .id(t.getId())
                    .nom(t.getNom())
                    .pays(t.getPays())
                    .build();
            teamDtos.add(tDto);
        }
        return teamDtos;
    }

    TeamDto getTeamById(Long id) {

        Team team = repository.findById(id).get();


        return TeamDto.builder()
                .id(team.getId())
                .nom(team.getNom())
                .pays(team.getPays())
                .build();
    }

    void createTeam(Team team) {
        repository.save(team);
    }

    @Transactional(rollbackFor = TestException.class)
    void test() throws TestException {
        Team team = repository.findById(1L).get();
        team.setBudget(8000000L);
        repository.save(team);
        if (1 == 1) throw new TestException();
    }
}
