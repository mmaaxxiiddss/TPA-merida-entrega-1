package ar.edu.utn.dds.k3003.catedra.fachadas;

import ar.edu.utn.dds.k3003.catedra.dtos.donaciones.ProductoDTO;
import ar.edu.utn.dds.k3003.catedra.dtos.donadoresYEntidades.NecesidadMaterialDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public interface FachadaNecesidadMaterial {

  NecesidadMaterialDTO registrarNecesidadMaterial(NecesidadMaterialDTO necesidadDTO);

  NecesidadMaterialDTO buscarNecesidadPorID(String necesidadID) throws NoSuchElementException;


]
