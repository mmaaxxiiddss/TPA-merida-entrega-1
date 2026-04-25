package ar.edu.utn.dds.k3003.catedra.fachadas;

import ar.edu.utn.dds.k3003.catedra.dtos.donaciones.ProductoDTO;
import ar.edu.utn.dds.k3003.catedra.dtos.donaciones.CategoriaProductoEnum;



import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public interface FachadaProducto {

  ProductoDTO agregarProducto();
  
  ProductoDTO registrarProducto(ProductoDTO productoDTO);

   ProductoDTO buscarProductoPorID(String necesidadID) throws NoSuchElementException;

   ProductoDTO cambiarCategoriaDeProducto(String necesidadID, CategoriaProductoEnum categoria)
      throws NoSuchElementException;
  
  ]
