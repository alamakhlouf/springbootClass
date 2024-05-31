package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Moniteur;

public interface IMoniteurService {
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours);
}
