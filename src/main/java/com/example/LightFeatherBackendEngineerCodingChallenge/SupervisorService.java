package com.example.LightFeatherBackendEngineerCodingChallenge;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SupervisorService{
    //Dummy list of Supervisors
    private List<Supervisor> supervisors = new ArrayList<>(
            Arrays.asList(
                    new Supervisor("1", "204-798-9969", "u", "d4900a18-a304-42c6-a8e5-a6c8c3f17bc0", "Karson", "Olson"),
                    new Supervisor("2", "792.910.1754", "9", "96188a56-1f92-4876-8df3-d8761ea5162f", "Robbie", "Heller"),
                    new Supervisor("3", "(255) 885-3433", "u", "3e662eb4-4434-499a-a64e-dc5ca9da87e5", "Lavon", "Deckow"),
                    new Supervisor("4", "727-659-7861", "b", "7d8a9ed8-685f-4408-92f1-e13a7c118d97", "Elijah", "Cremin"),
                    new Supervisor("5", "(964) 512-1445", "o", "93fd04ee-655a-47c2-832b-d83056d29e1e", "Kieran", "Torphy")

    ));
    //Service function for returning GET command
    public String getAllSupervisors(){


         /*This section returns the AWS GET command. It is not formatted correctly, and does not allow for POST.
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject("https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers", String.class);
            return result.toString();*/

            supervisors.sort(Comparator.comparing(Supervisor::getJurisdiction)
                    .thenComparing(Supervisor::getJurisdiction)
                    .thenComparing(Supervisor::getLastName)
                    .thenComparing(Supervisor::getFirstName)
            );

            return supervisors.toString();

    }
    //Service function for POST command
    public void addSupervisor(Supervisor supervisor){
        supervisors.add(supervisor);
        System.out.println(supervisor);
    }


}

