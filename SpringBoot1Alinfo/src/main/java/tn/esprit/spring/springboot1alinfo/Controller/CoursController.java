package tn.esprit.spring.springboot1alinfo.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.ICoursService;
import tn.esprit.spring.springboot1alinfo.entity.Cours;

@RestController
@RequestMapping("/cours")
@AllArgsConstructor
public class CoursController {
    ICoursService iCoursService;

    @GetMapping("/getcours/{numInscription}")
    public Cours getCoursByInscNumInscription(@PathVariable Long numInscription) {
        return iCoursService.getCoursByInscNumInscription(numInscription);
    }
}
