package tn.esprit.spring.springboot1alinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //pour mettre les visibilité des attributs
public class Inscription{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long numInscription;
    Integer numSemaine;

    @JsonIgnore
    @ManyToOne()
    Skieur sk;
    @JsonIgnore
    @ManyToOne()
    Cours cours ;

}
