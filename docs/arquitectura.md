



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
