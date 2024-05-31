package tn.esprit.spring.springboot1alinfo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {
 Cours findByInscNumInscription(Long numInscription);

}
