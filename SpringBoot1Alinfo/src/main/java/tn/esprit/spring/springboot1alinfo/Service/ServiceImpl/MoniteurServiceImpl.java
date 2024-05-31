package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springboot1alinfo.Repository.CoursRepository;
import tn.esprit.spring.springboot1alinfo.Repository.MoniteurRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IMoniteurService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;
import tn.esprit.spring.springboot1alinfo.entity.Moniteur;

@Service
@AllArgsConstructor


public class MoniteurServiceImpl implements IMoniteurService {

    CoursRepository coursRepo;
    MoniteurRepository moniteurRepo;
    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Cours cours = coursRepo.findById(numCours).orElse(null);
        moniteur.getCours().add(cours);
        return moniteurRepo.save(moniteur);

    }
}
