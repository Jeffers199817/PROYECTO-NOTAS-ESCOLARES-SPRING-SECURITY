package com.milenyumsoft.notasescolares.service;

import com.milenyumsoft.notasescolares.model.Nota;

import java.util.List;

public interface INotaService {


    List<Nota> getNotaAll();

    double getAverage();
}
