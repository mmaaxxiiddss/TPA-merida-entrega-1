



---
title: tpa-diagrama-clases
---
classDiagram
    note "La donacion tiene estado"
    donacionEstado <|-- Ingresada
    donacionEstado <|-- Aceptada
    donacionEstado <|-- conQueja
    

    class Ingresada{
        +estado()
        
    }
    class Aceptada{
        +estado()
    }
    class conQueja{
        +estado()
    }






---
title: tpa-diagrama-clases
---
classDiagram
    note "La entidadBenefica tiene necesidad"

    class entidadBenefica{
        -String razonSocial
        -String domicilio
        -String telefono
        -String correoElectronico
    }
    
    necesidadMaterial <|-- necesidadEsporadica
    
    class necesidadEsporadica{
        -Int nivelDeUrgencia
        -String descripcion
        -ProductoSolicitado productoSolicitado
        -Int objetivo
    }

    class necesidad

        
    ---
title: tpa-diagrama-clases
---
classDiagram
    note "El deposito tienen productos"
    class Deposito{
        -Int capacidadMaxima
        -String nombre
        -Int stockActual
        -String direccion

        +registrarProducto()
        +verificarCantidad()
        +necesidadesInsatisfechas()

        
    }




        
