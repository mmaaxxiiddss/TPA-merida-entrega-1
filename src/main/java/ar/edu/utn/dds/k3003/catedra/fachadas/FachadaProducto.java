package ar.edu.utn.dds.k3003.catedra.fachadas;



import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public interface FachadaProducto {
  
  ProductoDTO registrarProducto(ProductoDTO productoDTO);

   ProductoDTO buscarProductoPorID(String necesidadID) throws NoSuchElementException;

   ProductoDTO cambiarCategoriaDeProducto(String necesidadID, CategoriaProductoEnum categoria)
      throws NoSuchElementException;
  
  ]
