package fr.cyclingteam.procyclingmanager.team;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamDto {


    private Long id;
    private String nom;
    private String pays;
}
