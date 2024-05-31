package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Cours;


public interface ICoursService{
    Cours getCoursByInscNumInscription(Long numInscription);
}
