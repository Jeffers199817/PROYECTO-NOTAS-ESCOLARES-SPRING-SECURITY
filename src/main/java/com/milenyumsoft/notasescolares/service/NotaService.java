package com.milenyumsoft.notasescolares.service;

import com.milenyumsoft.notasescolares.model.Nota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService implements INotaService{

    private List<Nota> listaNota= new ArrayList<>();



    @Override
    public List<Nota> getNotaAll() {
        pushCalificaciones();
        return listaNota;
    }


    @Override
    public double getAverage() {
        double sumaNota=0.0;
        for(Nota nota: listaNota) {
            sumaNota += nota.getCalificacionMateria();
        }

        return sumaNota/(listaNota.size());
    }




    private void pushCalificaciones() {

        // Crear diferentes instancias de Nota
       listaNota.add(new Nota(1L, "Matemáticas", 15.3));
        listaNota.add(new Nota(2L, "Física", 14.8)) ;
        listaNota.add(new Nota(3L, "Química", 16.5));
        listaNota.add(new Nota(4L, "Historia", 13.9)) ;
        listaNota.add(new Nota(5L, "Literatura", 17.2));
        listaNota.add(new Nota(6L, "Biología", 15.7));
        listaNota.add(new Nota(7L, "Geografía", 14.2));
        listaNota.add(new Nota(8L, "Inglés", 16.0));


    }

}
