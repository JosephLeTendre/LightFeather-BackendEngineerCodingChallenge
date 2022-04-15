package com.example.LightFeatherBackendEngineerCodingChallenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;

    @GetMapping ("/api/supervisors")
    public List<Supervisor> getAllSupervisors() {

       RestTemplate restTemplate = new RestTemplate();
       List<Supervisor> result = restTemplate.getForObject("https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers", List.class);

       return result;
    }
    @RequestMapping(method= RequestMethod.POST, value="/api/supervisors")
    public void addSupervisor(@RequestBody Supervisor supervisor){
        supervisorService.addSupervisor(supervisor);
    }
}
