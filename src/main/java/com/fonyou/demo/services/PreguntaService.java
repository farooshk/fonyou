package com.fonyou.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.demo.models.PreguntaModel;
import com.fonyou.demo.repositories.PreguntaRepository;

@Service
public class PreguntaService {
    
    @Autowired
    private PreguntaRepository preguntaRepository;

    public ArrayList<PreguntaModel> obtenerPreguntas(){
        return (ArrayList<PreguntaModel>) preguntaRepository.findAll();
    }

    public PreguntaModel guardarPregunta(PreguntaModel pregunta){
        return preguntaRepository.save(pregunta);
    }

}
