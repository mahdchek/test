package fr.cyclingteam.procyclingmanager.team;

import fr.cyclingteam.procyclingmanager.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
