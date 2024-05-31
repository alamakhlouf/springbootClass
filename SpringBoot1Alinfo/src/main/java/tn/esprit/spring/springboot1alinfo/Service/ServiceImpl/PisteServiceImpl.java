package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springboot1alinfo.Repository.PisteRepository;
import tn.esprit.spring.springboot1alinfo.Repository.SkieurRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IPisteService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;
import tn.esprit.spring.springboot1alinfo.entity.Piste;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService {
    PisteRepository pisteRepo;
    SkieurRepository skieurRepo;

    @Override
    public List<Piste> retrieveAllPistes() {

        return pisteRepo.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        piste.getSk().add(skieur);
        pisteRepo.save(piste);
        return skieur;

    }
}
