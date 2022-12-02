package microservices.job_recruitment.companies.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
@Slf4j
public class Controller {

    @GetMapping(value = "/all")
    public String getAll(){
        log.info("In Companies!");
        return "<h1> Companies active! </h1>";
    }
}
