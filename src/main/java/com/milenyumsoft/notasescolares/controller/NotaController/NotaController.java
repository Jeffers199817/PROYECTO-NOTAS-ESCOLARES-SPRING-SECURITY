package com.milenyumsoft.notasescolares.controller.NotaController;

import com.milenyumsoft.notasescolares.model.Nota;
import com.milenyumsoft.notasescolares.service.INotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nota")
public class NotaController {

    @Autowired
    private INotaService notaService;


    @GetMapping("/calificaciones")
    public List<Nota> getNota(){

        return notaService.getNotaAll();
    }

    @GetMapping("/promedio")
    public double getAverage(){
        return notaService.getAverage();
    }
}
