package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springboot1alinfo.Repository.CoursRepository;
import tn.esprit.spring.springboot1alinfo.Repository.InscriptionRepository;
import tn.esprit.spring.springboot1alinfo.Repository.SkieurRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IInscriptionService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

@AllArgsConstructor
@Service
public class InscriptionServiceImpl implements IInscriptionService {

    SkieurRepository skieurRepo;
    InscriptionRepository inscriptionRepo;
    CoursRepository courRepo;

    @Override
    public Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier) {
        Skieur skieur = skieurRepo.findById(numSkier).orElse(null);
        inscription.setSk(skieur);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription assignInscriptionToCourse(Long numInscription, Long numCourse) {
        Inscription inscription =inscriptionRepo.findById(numInscription).orElse(null);
        Cours cour =courRepo.findById(numCourse).orElse(null);
        inscription.setCours(cour);
        return inscriptionRepo.save(inscription);

    }
}
