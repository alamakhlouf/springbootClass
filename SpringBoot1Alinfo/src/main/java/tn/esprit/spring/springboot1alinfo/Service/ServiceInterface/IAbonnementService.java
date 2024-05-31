package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Abonnement;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate datedeb, LocalDate datefin);
}
