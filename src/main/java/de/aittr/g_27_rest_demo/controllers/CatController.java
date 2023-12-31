package de.aittr.g_27_rest_demo.controllers;

import de.aittr.g_27_rest_demo.domain.Cat;
import de.aittr.g_27_rest_demo.domain.SimpleCat;
import de.aittr.g_27_rest_demo.services.CatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {
    private CatService service;

    public CatController(CatService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public List<Cat> getAll() {
        return service.getAll();
    }
    @PostMapping("/save")
    public Cat save(@RequestBody SimpleCat cat) {
        return service.save(cat);
    }
}
