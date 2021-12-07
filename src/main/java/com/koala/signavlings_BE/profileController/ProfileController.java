/**
 * The ProfileController class includes Get and Post method for all profiles
 *
 * @author Preeti Thorat Luise Loparev
 */
package com.koala.signavlings_BE.profileController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("api/profile")
public class ProfileController {

    private final ProfileService service;


    public ProfileController(ProfileService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Profile>> findAll() {
        List<Profile> profiles = service.findAll();
        return ResponseEntity.ok().body(profiles);
    }

}

