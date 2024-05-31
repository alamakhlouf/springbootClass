package tn.esprit.spring.springboot1alinfo.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.springboot1alinfo.Service.ServiceImpl.InscriptionServiceImpl;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IInscriptionService;
import tn.esprit.spring.springboot1alinfo.entity.Inscription;

@RestController
@RequestMapping("/inscription")
@AllArgsConstructor
public class InscriptionController {
    IInscriptionService iInscriptionService;

    @PostMapping("/addInscriptionAndAssignToSkier/{numSkier}")
    public Inscription addInscriptionAndAssignToSkier(@RequestBody Inscription inscription, @PathVariable Long numSkier) {
        return iInscriptionService.addInscriptionAndAssignToSkier(inscription, numSkier);
    }

    @PostMapping("/assignInscriptionToCourse/{numInscription}/{numCourse}")
    public Inscription assignInscriptionToCourse(@PathVariable Long numInscription, @PathVariable Long numCourse) {
        return iInscriptionService.assignInscriptionToCourse(numInscription, numCourse);
    }
}
