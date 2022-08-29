package com.fonyou.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fonyou.demo.models.ExamenModel;
import com.fonyou.demo.services.ExamenService;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    
    @Autowired
    ExamenService examenService;

    @GetMapping()
    public ArrayList<ExamenModel> obtenerExamenes(){
        return examenService.obtenerExamenes();
    }

    @PostMapping()
    public ExamenModel guardarExamen(@RequestBody ExamenModel examen){
        return this.examenService.guardarExamen(examen);
    }
}
