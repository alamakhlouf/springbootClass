package tn.esprit.spring.springboot1alinfo.Controller;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IMoniteurService;
import tn.esprit.spring.springboot1alinfo.entity.Moniteur;

@RestController
@RequestMapping("/moniteur")
@AllArgsConstructor
public class MoniteurController {
    IMoniteurService iMoniteurService;


    @PostMapping("getmoniteur/{numCours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable Long numCours) {
        return iMoniteurService.addInstructorAndAssignToCourse(moniteur, numCours);
    }
}
