package ar.edu.utn.dds.k3003.repositories;

import ar.edu.utn.dds.k3003.catedra.dtos.donaciones.QuejaDTO;
import java.util.Optional;

public interface QuejasRepository {
  Optional<Queja> findById(String id);

  Queja save(Queja queja);

 
}
