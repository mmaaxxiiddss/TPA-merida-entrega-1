
Actor User

participant Donador
Participant Feposito
Participant donacionService
Participant donacionController
Participant entifadBenefica

participant entifadBeneficaRepository@{ "type" : "database" }
User->>Donador: puedeDonar()
Donador->>entifadBenefica: puedeOonar()
entifadBenefica->>donacionService: obtenerQuejas()
donacionService->>entidadbenefica: null
Entidadbenefica->>Feposito: agregatNecesidad()
Feposito->>donacionController: RegistrarNecesidad()
donacionController->>Feposito: NecesidadMaterial
donacionController->>entifadBeneficaRepository: RegistrarNecesidad()
Feposito->>entidadbenefica: NecesidadMaterial


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


        sequenceDiagram
Actor User
participant Donador
Participant Feposito
Participant donacionService
Participant donacionController
Participant entifadBenefica

participant entifadBeneficaRepository@{ "type" : "database" }
User->>Donador: puedeDonar()
Donador->>entifadBenefica: puedeOonar()


Dobador->>User: True

