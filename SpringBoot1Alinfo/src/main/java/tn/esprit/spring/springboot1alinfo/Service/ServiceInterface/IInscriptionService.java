package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Inscription;

public interface IInscriptionService {

    Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);
}
