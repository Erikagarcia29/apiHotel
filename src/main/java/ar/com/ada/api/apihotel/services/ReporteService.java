package ar.com.ada.api.apihotel.services;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.apihotel.entities.*;
import ar.com.ada.api.apihotel.repos.*;
import ar.com.ada.api.apihotel.entities.reportes.*;

@Service
public class ReporteService {

    @Autowired
    ReservarRepository reporteRepo;

    public List<ReporteEstado> getReporteReservasPorEstado() {

        return reporteRepo.getReporteReservasPorEstado();
    }

    public List<ReportePorHuesped> getReporteReservasPorHuespedes() {

        return reporteRepo.getReporteReservasPorHuespedes();
    }

}