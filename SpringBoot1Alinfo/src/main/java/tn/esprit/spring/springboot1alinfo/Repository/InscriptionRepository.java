package tn.esprit.spring.springboot1alinfo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Cours;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;

import java.util.List;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findByCoursNumCours(Long numCours);





}
