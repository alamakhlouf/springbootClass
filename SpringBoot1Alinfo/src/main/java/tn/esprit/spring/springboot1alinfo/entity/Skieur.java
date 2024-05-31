package tn.esprit.spring.springboot1alinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter // generer les getter automatiquement
@Setter
@AllArgsConstructor // generer les constructeur parametrés
@NoArgsConstructor // generer les constructeur  non parametrés
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long numSkieur ;
    String nomS ;
    String prenomS;
    LocalDate dateNaissance ;
    String ville ;


    @ManyToMany(mappedBy ="sk" )
    @JsonIgnore
    List<Piste>pt ;

    @OneToMany(mappedBy ="sk")
    List<Inscription> insc ;

    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
}
