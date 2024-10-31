package ma.xproce.voitureservice.controllers;


import ma.xproce.voitureservice.entities.Voiture;
import ma.xproce.voitureservice.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepository;

    @GetMapping("/voitures")
    public List<Voiture> findAll(){
        return voitureRepository.findAll();
    }

    @GetMapping("/voiture/{id}")
    public Voiture getClientById(@PathVariable Long id) throws Exception {
        return voitureRepository.findById(id).orElseThrow(()-> new Exception("Client inexistant"));

    }


}
