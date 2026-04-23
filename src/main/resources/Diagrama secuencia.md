

    sequenceDiagram
    participant User
    participant Dobador
    User->>Dobador: puedeDonar()
    Dobador->>User: True




    sequenceDiagram
    Actor User
    participant Dobador
    User->>Dobador: puedeDonar()
    participant DonacionRepository@{ "type" : "database" }
    Dobador->>DonacionRepository: DonacionDTO()
    DonacionRepository->>Dobador: Donacion()
    Dobador->>User: True





sequenceDiagram
Actor User
participant Donador
Participant Feposito
Participant donacionService
Participant donacionController
Participant entifadBenefica
Participant 
User->>Donador: puedeDonar()
participant DonacionRepository@{ "type" : "database" }
Dobador->>DonacionRepository: DonacionDTO()
DonacionRepository->>Dobador: Donacion()
Dobador->>User: True


        
