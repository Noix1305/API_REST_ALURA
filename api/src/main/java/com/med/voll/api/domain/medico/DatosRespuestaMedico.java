package com.med.voll.api.domain.medico;

import com.med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String Telefono, String documento,
                                   DatosDireccion direccion) {
}