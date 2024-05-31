package tn.esprit.spring.springboot1alinfo.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springboot1alinfo.Repository.CoursRepository;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.ICoursService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;


@Service
@AllArgsConstructor
public class CoursServiceImpl  implements ICoursService {

    CoursRepository coursRepository;

    @Override
    public Cours getCoursByInscNumInscription(Long numInscription) {
        return coursRepository.findByInscNumInscription(numInscription);
    }
}
