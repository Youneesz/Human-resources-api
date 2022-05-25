package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.DemandeConge;
import com.sfeproject.employesystem.model.DemandePiece;
import com.sfeproject.employesystem.model.Employe;

import java.util.List;

public interface EmployeeService {

    public Employe addEmployee(Employe employee);
    public Employe getEmployee(int id);
    public List<Employe> getEmployees();
    public Employe updateEmployee(int id, Employe employee);
    public String deleteEmployee(int id);
    public List<DemandeConge> getConges(int id);
    public List<DemandePiece> getPieces(int id);
    public List<DemandeConge> getAllConges();
    public List<DemandePiece> getAllPieces();

}
