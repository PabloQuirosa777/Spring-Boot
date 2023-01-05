package com.example.facturaJPA.factura.controller.dto;

import com.example.facturaJPA.cliente.controller.dto.ClienteOutputDto;
import com.example.facturaJPA.cliente.domain.Cliente;
import com.example.facturaJPA.linea.controller.dto.LineaOutputDto;
import com.example.facturaJPA.linea.domain.Linea;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaOutputDto {
    int id;
    double importeFactura;
    ClienteOutputDto cliente;
    List<LineaOutputDto> lineas;
}
