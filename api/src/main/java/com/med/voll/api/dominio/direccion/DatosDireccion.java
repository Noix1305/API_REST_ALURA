package com.med.voll.api.dominio.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(
        @NotBlank
        String calle,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad,
        @NotBlank
        String numero,
        @NotBlank
        String complemento) {
}
