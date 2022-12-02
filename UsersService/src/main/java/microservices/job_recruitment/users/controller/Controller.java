package microservices.job_recruitment.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class Controller {

    @GetMapping(value = "/all")
    public String getAll(){
        log.info("In Users!");
        return "<h1> Users active! </h1>";
    }
}
