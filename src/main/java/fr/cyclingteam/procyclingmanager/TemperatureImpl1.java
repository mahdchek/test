package fr.cyclingteam.procyclingmanager;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("test2")
@Primary
public class TemperatureImpl1 implements Temperature {
    @Override
    public int calcultemperature() {

        return 15;
    }
}
