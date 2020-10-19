package fr.cyclingteam.procyclingmanager;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("test1")
public class TemperatureImpl2 implements Temperature {
    @Override
    public int calcultemperature() {
        return 30;
    }
}
