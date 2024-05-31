package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springboot1alinfo.Repository.AbonnementRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IAbonnementService;
import tn.esprit.spring.springboot1alinfo.entity.Abonnement;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements IAbonnementService{

    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement) {
        return abonnementRepository.retrieveEntreprisesByTypeAbonnenet(typeAbonnement);
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate datedeb, LocalDate datefin) {
        return abonnementRepository.findByDateDebutBetween(datedeb,datefin);
    }
}
