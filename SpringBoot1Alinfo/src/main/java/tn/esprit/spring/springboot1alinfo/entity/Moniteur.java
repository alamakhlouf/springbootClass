package tn.esprit.spring.springboot1alinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Moniteur {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur;
    String nomM;
    String prenomM;
    LocalDate dateRecru;
// association unidirectionnel  ---->
    @OneToMany()
    @JsonIgnore
    List<Cours> cours = new ArrayList<>();

}
