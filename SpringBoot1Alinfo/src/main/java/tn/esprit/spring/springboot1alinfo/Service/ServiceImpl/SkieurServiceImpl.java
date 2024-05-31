package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.springboot1alinfo.Repository.CoursRepository;
import tn.esprit.spring.springboot1alinfo.Repository.InscriptionRepository;
import tn.esprit.spring.springboot1alinfo.Repository.SkieurRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.ISkieurService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;


@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService {

    SkieurRepository skieurRepo;
    InscriptionRepository inscriptionRepo;
    CoursRepository coursRepo;
    @Override
    @Transactional
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours) {
        Cours cours= coursRepo.findById(numCours).orElse(null);
        Skieur sk= skieurRepo.save(skieur);

        for(Inscription inscr: sk.getInsc()){
            inscr.setSk(sk);
            inscr.setCours(cours);
           inscriptionRepo.save(inscr);
        }
        return sk;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepo.findByAbonnementTypeAbonnement(typeAbonnement) ;
    }
}
