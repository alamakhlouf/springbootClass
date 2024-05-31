package tn.esprit.spring.springboot1alinfo.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.springboot1alinfo.entity.Enum.Couleur;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long numPiste;
    String nomPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    Integer longueur;
    Integer pente;

    @ManyToMany
    List<Skieur> sk;




}
