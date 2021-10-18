package com.example.springbootess.healthCheck;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MyHealthIndicator implements HealthIndicator {

    Random random = new Random();


    @Override
    public Health health() {
        boolean serverIsDown = random.nextBoolean();
        if (serverIsDown) {
            return Health.down()
                    .status(Status.DOWN).withDetail("message", "OMG!")
                    .build();
        } else {
            return Health.up()
                    .withDetail("message", "Fuck").
                    build();
        }
    }
}
