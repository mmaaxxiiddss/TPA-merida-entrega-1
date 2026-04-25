package ar.edu.utn.dds.k3003.catedra.fachadas;

import ar.edu.utn.dds.k3003.catedra.dtos.donaciones.IdentificadorDTO;
import ;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public interface FachadaProducto {

  IdentificadorDTO agregarIdentificador(IdentificadorDTO identificadorDTO);

   IdentificadorDTO buscarIdentificadorPorID(String identificadorID) throws NoSuchElementException;

  ]
