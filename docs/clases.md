



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
