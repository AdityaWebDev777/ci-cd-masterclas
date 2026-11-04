package net.edigitRest.RestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check")
public String healthCheck(){
    return "okay";
}
@GetMapping("/users")
    public String getUgsers(){
        return "Aditya again changes in the project an update using CI-CD without again deploy";
}
@GetMapping("again")
    public String again(){
        return "aditya bhai shik gaye CI-CD paisa hi paisa";
}
}
