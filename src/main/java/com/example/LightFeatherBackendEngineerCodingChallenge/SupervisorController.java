package com.example.LightFeatherBackendEngineerCodingChallenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;

    //Section for GET command
    @GetMapping("/api/supervisors")
    public String getAllSupervisors() {
       return supervisorService.getAllSupervisors();
    }

    //Section for POST command
    @RequestMapping(method= RequestMethod.POST, value="/api/supervisors")
    public void addSupervisor(@RequestBody Supervisor supervisor){
        supervisorService.addSupervisor(supervisor);
    }
}
