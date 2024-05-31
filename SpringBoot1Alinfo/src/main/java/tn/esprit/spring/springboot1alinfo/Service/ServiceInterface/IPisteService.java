package tn.esprit.spring.springboot1alinfo.Service.ServiceInterface;

import tn.esprit.spring.springboot1alinfo.entity.Piste;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}
