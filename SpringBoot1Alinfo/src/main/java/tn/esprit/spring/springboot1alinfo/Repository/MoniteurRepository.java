package tn.esprit.spring.springboot1alinfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long>{
}
