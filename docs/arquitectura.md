



---
title: tpa-diagrama-clases
---
classDiagram
    note "El Sistema tiene usuario"
    Usuario <|-- Donador
    Usuario <|-- EntidadBenefica
    Usuario : +String password
    Usuario : +String nombreUsuario
    Usuario: +isAdmin()
    Usuario: +isUser()
    Usuario: +existe()

    class Donador{
        +String nombre
        +String apellido 
        +Enum estado
    }
    class EntidadBenefica{
        -int Id
        -String domicilio
        -int Id
        
    }




---
title: tpa-diagrama-clases
---
classDiagram
    note "La producto tiene categoria"

    class Producto{
        -String nombre
        -String descripcion
        -String codigoQR
        -Categoria categoria
    }
    
    Categoria <|-- subCategoria
    Categoria : -String descripcion
    class subCategoria{
    
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

        +ProductoDTO registrarProducto()
        +Boolean verificarCantidad()
        +List<NecesidadMaterialDTO> necesidadesInsatisfechas()
        +EntidadBenefica ejecutarAlgoritmoMatchMarking()
        
        
    }



        ---
title: tpa-diagrama-clases
---
classDiagram
    note "La entidad benefica tienen donaciones"
    class EntidadBenefica{
        -Int Id
        -String razonSocial
        -String domicilio
        -Longint Telefono
        -String email

        +Queja registrarQueja()
        +Boolean puedeDonar()
        +
        +
        
        
    }

        
