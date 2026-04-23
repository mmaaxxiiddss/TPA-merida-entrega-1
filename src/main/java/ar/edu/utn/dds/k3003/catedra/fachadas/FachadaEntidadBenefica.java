package ar.edu.utn.dds.k3003.catedra.fachadas;


import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public interface FachadaEntidadBenefica {

  EntidadBeneficaDTO registrarEntidad(EntidadBeneficaDTO entidadBeneficaDTO);

  EntidadBeneficaDTO buscarEntidadPorID(String donacion)
                    ) throws NoSuchElementException;

}

