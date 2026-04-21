---
title: tpa-diagrama-clases
---
classDiagram
    note "From Duck till Zebra"
    Usuario <|-- Donador
    note for Duck "can fly<br>can swim<br>can dive<br>can help in debugging"
    Usuario <|-- Repositor
    Usuario <|-- Zebra
    Usuario : +String password
    Usuario : +String nombre
    Usuario: +isAdmin()
    Usuario: +mate()
    class Donador{
        +String nombre
        +swim()
        +quack()
    }
    class Repositor{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
