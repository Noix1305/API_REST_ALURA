package com.med.voll.api.controller;

import com.med.voll.api.dominio.paciente.DatosListaPaciente;
import com.med.voll.api.dominio.paciente.DatosRegistroPaciente;
import com.med.voll.api.dominio.paciente.Paciente;
import com.med.voll.api.dominio.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @GetMapping
    public Page<DatosListaPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nombre"}) Pageable paginacion) {
        return repository.findAll(paginacion).map(DatosListaPaciente::new);
    }
    @PostMapping
    @Transactional
    public void registrar(@RequestBody @Valid DatosRegistroPaciente datos) {
        repository.save(new Paciente(datos));
    }

}
