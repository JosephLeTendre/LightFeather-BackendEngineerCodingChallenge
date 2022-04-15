package com.example.LightFeatherBackendEngineerCodingChallenge;
import java.util.*;
import org.springframework.stereotype.Service;
@Service
public class SupervisorService{

    private List<Supervisor> supervisors = new ArrayList<>(Arrays.asList());

        public List<Supervisor> getAllSupervisors(){

        return supervisors;
    }
    public void addSupervisor(Supervisor supervisor){
        supervisors.add(supervisor);
    }

}

