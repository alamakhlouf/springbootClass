package tn.esprit.spring.springboot1alinfo.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.ISkieurService;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

@RestController
@RequestMapping("/skieur")
@AllArgsConstructor
public class SkieurController {
    ISkieurService iSkieurService;


    @PostMapping("getskieur/{numCours}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur, @PathVariable Long numCours) {
        return iSkieurService.addSkierAndAssignToCourse(skieur, numCours);
    }

    @GetMapping("/getskieur/{typeAbonnement}")
    public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable TypeAbonnement typeAbonnement) {
        return iSkieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
}
