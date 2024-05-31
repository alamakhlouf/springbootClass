package tn.esprit.spring.springboot1alinfo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springboot1alinfo.entity.Abonnement;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

    @Query("SELECT a FROM Abonnement a WHERE a.typeAbonnement =:typeAbonnemet order by a.dateDebut")
    List<Abonnement> retrieveEntreprisesByTypeAbonnenet(@Param("typeAbonnemet") TypeAbonnement typeAbonnemet);

    @Query("SELECT a FROM Abonnement a WHERE a.dateDebut between :datedeb and :datefin ")
    List<Abonnement>  retrieveSubscriptionsByDates(@Param("datedeb") LocalDate datedeb ,@Param("datefin") LocalDate datefin );


    List<Abonnement>findByDateDebutBetween(LocalDate date1 , LocalDate date2);
}
