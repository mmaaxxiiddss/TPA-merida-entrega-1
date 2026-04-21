



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

    class necesidadMaterial{
        -Int nivelDeUrgencia
        -Producto producto
        -Int objetivo
    }


        
    
