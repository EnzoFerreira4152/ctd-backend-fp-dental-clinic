package com.backend.finalProject.service;

import com.backend.finalProject.model.PatientDTO;

import java.util.Set;

public interface IPatientService {

    PatientDTO addPatient(PatientDTO patientDTO);
    Set<PatientDTO> listAllPatients();
    PatientDTO findPatientById(Integer id);
    PatientDTO modifyPatient(PatientDTO patientDTO);
    void deletePatient(Integer id);

}
