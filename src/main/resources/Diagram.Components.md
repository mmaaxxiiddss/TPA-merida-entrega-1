


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
    
