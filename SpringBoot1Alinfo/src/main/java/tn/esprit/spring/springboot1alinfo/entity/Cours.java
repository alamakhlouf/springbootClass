package tn.esprit.spring.springboot1alinfo.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.springboot1alinfo.entity.Enum.Support;
import tn.esprit.spring.springboot1alinfo.entity.Enum.TypeCours;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long numCours;
    Integer niveau;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
    Float prix;
    Integer creneau;


    @OneToMany(mappedBy ="cours")
    List<Inscription> insc;



}
