package ar.edu.utn.dds.k3003.repositories;

import ar.edu.utn.dds.k3003.model.NecesidadMaterial;;
import java.util.Optional;

public interface NecesidadMsterialRepository {
  Optional<NecesidadMaterial> findById(String id);

  NecesidadMaterial save(NecesidadMaterial necesidadMaterial);

   
}
