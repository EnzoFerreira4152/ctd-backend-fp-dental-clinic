package com.backend.finalProject.service.impl;

import com.backend.finalProject.model.DentistDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class DentistServiceTest {

    @Autowired
    private DentistService dentistService;

    @BeforeAll
    void setUp() {
        DentistDTO dentist_1 = new DentistDTO();
        dentist_1.setName("Martin");
        dentist_1.setLastName("López");
        dentist_1.setProfessionalRegistrationNumber("PR-a2052");

        DentistDTO dentist_2 = new DentistDTO();
        dentist_2.setName("José");
        dentist_2.setLastName("Aguirre");
        dentist_2.setProfessionalRegistrationNumber("PR-c2171");

        dentistService.addDentist(dentist_1);
        dentistService.addDentist(dentist_2);

    }

    @Test
    void addDentist() {
        DentistDTO dentist = new DentistDTO();
        dentist.setName("Fernanda");
        dentist.setLastName("Martinez");
        dentist.setProfessionalRegistrationNumber("PR-a3122");

        DentistDTO response = dentistService.addDentist(dentist);

        assertNotNull(response);
    }

    @Test
    void listAllDentist() {
        Set<DentistDTO> response = dentistService.listAllDentist();

        //Quiero corroborar que el BeforeAll tambien corrió correctamente y persistió los datos
        assertTrue(response.size() > 2);
    }

    @Test
    void findDentistById() {
        DentistDTO response = dentistService.findDentistById(2);

        assertEquals("José", response.getName());
    }

    @Test
    void modifyDentist() {
        DentistDTO dentistWithNewData = new DentistDTO();
        dentistWithNewData.setName("Martín");
        dentistWithNewData.setLastName("López");
        dentistWithNewData.setProfessionalRegistrationNumber("PR-c2052");

        DentistDTO response = dentistService.modifyDentist(dentistWithNewData);

        assertEquals("PR-c2052", response.getProfessionalRegistrationNumber());
    }

    @Test
    void deleteDentist() {
        dentistService.deleteDentist(3);

        DentistDTO response = dentistService.findDentistById(3);

        assertNull(response);
    }
}