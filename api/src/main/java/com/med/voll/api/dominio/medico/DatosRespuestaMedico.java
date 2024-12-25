package com.med.voll.api.dominio.medico;

import com.med.voll.api.dominio.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String Telefono, String documento,
                                   DatosDireccion direccion) {
}
