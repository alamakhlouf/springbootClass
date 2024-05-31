package tn.esprit.spring.springboot1alinfo.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeAbonnement;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
// les attributs doivent etre toujours miniscules et lorsque je vais l'appelé en l'appele le premier lettre en majuscule doit etre

    Long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;

}
