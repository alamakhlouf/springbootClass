package tn.esprit.spring.springboot1alinfo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;
import tn.esprit.spring.springboot1alinfo.entity.Piste;

import java.util.List;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Long> {
    List<Piste> findAllBySkNumSkieur(Long numSkieur);
    List<Piste> findBySkNomSAndSkInscNumInscription(String nomSkieur,  long numSkieur);

    List<Piste> findBySkNomSLike(String nom);

}
