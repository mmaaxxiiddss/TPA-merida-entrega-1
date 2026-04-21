



---
title: tpa-diagrama-clases
---
classDiagram
    note "El Sistema tiene usuario"
    Usuario <|-- Donador
    Usuario : +String password
    Usuario : +String nombreUsuario
    Usuario: +isAdmin()
    Usuario: +existe()

    class Donador{
        +String nombre
        +Enum estado
    }
    class Donacion{
        -String descripcion
        -donacionEstado estado
    }
    class donacionEstado{
        +estado()
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

    class subCategoria{
        -String descripcion
    }

        
    
