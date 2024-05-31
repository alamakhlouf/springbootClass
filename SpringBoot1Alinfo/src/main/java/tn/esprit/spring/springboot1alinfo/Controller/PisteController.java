package tn.esprit.spring.springboot1alinfo.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.springboot1alinfo.Service.ServiceInterface.IPisteService;
import tn.esprit.spring.springboot1alinfo.entity.Piste;
import tn.esprit.spring.springboot1alinfo.entity.Skieur;

import java.util.List;

@RestController
@RequestMapping("/piste")
@AllArgsConstructor
@Tag(name="pisteManagement")
public class PisteController {
    IPisteService iPisteService;

    @GetMapping("/listpiste")
    public List<Piste> retrieveAllPistes() {
        return iPisteService.retrieveAllPistes();
    }
    @PostMapping("/addpiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return iPisteService.addPiste(piste);
    }
    @Operation(description="MéthodeUpdate")
    @PutMapping("/updatepiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return iPisteService.updatePiste(piste);
    }

    @GetMapping("/getpiste/{numero}")
    public Piste retrievePiste(@PathVariable("numero") Long numPiste) {
        return iPisteService.retrievePiste(numPiste);
    }

@PostMapping("/assignSkierToPiste/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
        return iPisteService.assignSkierToPiste(numSkieur, numPiste);
    }
}
