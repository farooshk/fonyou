package com.fonyou.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fonyou.demo.models.PreguntaModel;
import com.fonyou.demo.services.PreguntaService;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
    
    @Autowired
    PreguntaService preguntaService;

    @GetMapping()
    public ArrayList<PreguntaModel> obtenerPreguntas(){
        return preguntaService.obtenerPreguntas();
    }

    @PostMapping()
    public PreguntaModel guardarPregunta(@RequestBody PreguntaModel pregunta){
        return this.preguntaService.guardarPregunta(pregunta);
    }

}
