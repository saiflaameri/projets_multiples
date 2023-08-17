package com.example.devcrew.Controller;


import com.example.devcrew.entities.LoginRequest;
import com.example.devcrew.entities.chauffeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.devcrew.Reposetory.chauffeurRepository;

@RestController
@CrossOrigin(origins ="http://localhost:4200")

@RequestMapping("/login")
public class LoginController {

    @Autowired
    private chauffeurRepository chauffeurRepository;


    @PostMapping("/chauffeur")
    public ResponseEntity<chauffeur> loginEtudiant(@RequestBody LoginRequest request) {

        chauffeur chauffeur = this.chauffeurRepository.findChauffeurByEmail(request.getEmail());
        if (chauffeur == null || !chauffeur.getPassword().equals(request.getPassword())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(chauffeur);
    }




}
