package tn.esprit.spring.springboot1alinfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur ,Long>{
    List<Skieur> findByAbonnementTypeAbonnement (TypeAbonnement abonnement);
}
