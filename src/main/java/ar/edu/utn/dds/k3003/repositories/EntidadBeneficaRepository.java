package ar.edu.utn.dds.k3003.repositories;

import ar.edu.utn.dds.k3003.model.EntidadBenefica;
import java.util.Optional;

public interface EntidadBeneficaRepository {
  Optional<EntidadBeneficaRepository> findById(String id);

  EntidadBeneficaRepository save(EntidadBenefica entidadBenefica);

   
}
