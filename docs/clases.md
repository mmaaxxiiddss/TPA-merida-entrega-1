



---
title: tpa-diagrama-clases
---
classDiagram
    note "La donacion tiene estado"
    note "La asignacion tiene estado
    Asignacion <|-- Completada
    Asignacion <|-- Aceptada
    donacionEstado <|-- Ingresada
    donacionEstado <|-- Aceptada
    donacionEstado <|-- conQueja
    donacionEstado : -Asignacion estadoAsignacion

    class Ingresada{
        +estado()
        
    }
    class Aceptada{
        +estado()
    }
    class conQueja{
        +estado()
    }
    
    class Completada{

    
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




        
