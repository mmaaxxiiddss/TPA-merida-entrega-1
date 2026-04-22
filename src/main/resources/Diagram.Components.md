


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
    
