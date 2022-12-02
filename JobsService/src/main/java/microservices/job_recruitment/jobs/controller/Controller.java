package microservices.job_recruitment.jobs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@Slf4j
public class Controller {

    @GetMapping(value = "/all")
    public String getAll(){
        log.info("In Jobs!");
        return "<h1> Jobs active! </h1>";
    }
}
