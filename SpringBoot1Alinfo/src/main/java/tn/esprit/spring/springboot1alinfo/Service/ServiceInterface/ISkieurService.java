package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

public interface ISkieurService {
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

}
