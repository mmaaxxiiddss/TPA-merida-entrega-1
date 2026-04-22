



---
title: tpa-diagrama-clases
---
classDiagram
    note "La donacion tiene estado"
    note "La asignacion tiene estado
    estadoAsignacion <|-- Completada
    estadoAsignacion <|-- Asignada
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

    class Asignada
    {
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
    
    class necesidadExtraordinaria{
        -Int nivelDeUrgencia
        -String descripcion
        -ProductoSolicitado productoSolicitado
        -Int objetivo
        -Asignacion asignacion
    }

    class otraNecesidad{

    
    }

        
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


---
title: tpA-diagrama-clases
---
classDiagram
    note "la donacion tienen estado"
    Donacion <|-- Rechazada
    Donacion <|-- Aceptada
    Donacion <|-- AceptadaConQueja
    Donacion : +int Id
    l: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
    

---
title: tpA-diagrama-clases 
---
classDiagram
    note "El donador tienen estado"
    donadorEstado <|-- Verificado
    donadorEstado <|-- Sospechoso
    donadorEstado <|-- Baneado
    donadorEstado : -String nombre
    donadorEstado : -String apellido
    donadorEstado: +puedeDonar()
    donadorEstado: +registrar()
    class Verificado {
        
       
        
    }
    class Sospechoso{
        
       
    }
    class Baneado{
        
    }
    


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
        
    }


---
title: tpA-diagrama-clases 
---
classDiagram
    note "El incentivo es variante"
    Incentivo <|-- Insignia
    Incentivo <|-- Categoria
    Incentivo <|-- Mision
    Mision : -Mision consultarMision()
    Insignia: -List consultarInsignias()
    
    class Insignia {
        
       
        
    }
    class Mision{
        
       
    }
    class Categoria{
        
    }






        
