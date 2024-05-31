package tn.esprit.spring.springboot1alinfo.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IAbonnementService;
import tn.esprit.spring.springboot1alinfo.entity.Abonnement;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/abonnement")
@AllArgsConstructor
public class AbonnementController {
    IAbonnementService iAbonnementService;

    @GetMapping("/typeAbonnement/{typeAbonnement}")
    public List<Abonnement> getSubscriptionByType(@PathVariable TypeAbonnement typeAbonnement) {
        return iAbonnementService.getSubscriptionByType(typeAbonnement);
    }
@GetMapping("/getAbobnnementBydate/{datedeb}/{datefin}")
    public List<Abonnement> retrieveSubscriptionsByDates(@PathVariable LocalDate datedeb, @PathVariable LocalDate datefin) {
        return iAbonnementService.retrieveSubscriptionsByDates(datedeb, datefin);
    }
}
