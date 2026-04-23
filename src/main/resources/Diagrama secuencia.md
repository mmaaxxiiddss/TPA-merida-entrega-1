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
donacionController->>donacionController: guardarNecesidad()
donacionController->>Feposito: NecesidadMaterial
donacionController->>entifadBeneficaRepository: RegistrarNecesidad()
Feposito->>entidadbenefica: NecesidadMaterial
Entidadbenefica->>entidadbenefica: obtenerNecesidadesInsatisfecha()
Entidadbenefica->>donacionService: satisfacerNecesidad()
donacionService->>donacionController: NecesidadMaterial
donacionController->>donacionController: guardarNecesidad()
donacionService->>entidadbenefica: Donacion
Dobador->>User: True

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




Actor User

participant Donador
Participant Deposito
Participant donacionService
Participant donacionController
Participant entidadBenefica

participant entidadBeneficaRepository@{ "type" : "database" }

User->>Donador: puedeDonar()

Donador->>entidadBenefica: puedeOonar()
entidadBenefica->>donacionService: obtenerQuejas()
donacionService->>entidadbenefica: null
entidadBenefica->>Deposito: agregatNecesidad()
Deposito->>donacionController: registrarNecesidad()
donacionController->>donacionController: guardarNecesidad()
donacionController->>Deposito: NecesidadMaterial
donacionController->>entidadBeneficaRepository: registrarNecesidad()
Deposito->>entidadBenefica: NecesidadMaterial
entidadBenefica->>entidadBenefica: obtenerNecesidadesInsatisfecha()
entidadBenefica->>donacionService: satisfacerNecesidad()
donacionService->>donacionController: NecesidadMaterial
donacionController->>donacionController: guardarNecesidad()
donacionService->>entidadBenefica: Donacion

entidadBenefica->>Donador: True






sequenceDiagram
Actor User

participant Donador
Participant entidadBenefica
Participant donacionService
Participant Deposito
Participant donacionController

participant entidadBeneficaRepository@{ "type" : "database" }

User->>Donador: puedeDonar()
Donador->>entidadBenefica: puedeOonar()
entidadBenefica->>donacionService: obtenerQuejas()
donacionService->>entidadBenefica: null
entidadBenefica->>Deposito: agregatNecesidad()
Deposito->>donacionController: registrarNecesidad()
donacionController->>donacionController: guardarNecesidad()
donacionController->>Deposito: NecesidadMaterial
donacionController->>entidadBeneficaRepository: RegistrarNecesidad()
Deposito->>entidadBenefica: NecesidadMaterial
entidadBenefica->>entidadbenefica: obtenerNecesidadesInsatisfecha()
entidadbenefica->>donacionService: satisfacerNecesidad()
donacionService->>donacionController: NecesidadMaterial
donacionController->>donacionController: guardarNecesidad()
donacionService->>entidadBenefica: Donacion
Donador->>User: True




sequenceDiagram
Actor User

participant Donador
Participant entidadBenefica
Participant donacionService
Participant Deposito
Participant donacionController

participant entidadBeneficaRepository@{ "type" : "database" }

User->>Donador: puedeDonar()
Donador->>entidadBenefica: puedeOonar()
entidadBenefica->>donacionService: obtenerQuejas()
donacionService->>entidadBenefica: null
entidadBenefica->>Deposito: agregatNecesidad()
Deposito->>donacionController: registrarNecesidad()
donacionController->>donacionController: guardarNecesidad()
donacionController->>Deposito: NecesidadMaterial
donacionController->>entidadBeneficaRepository: registrarNecesidad()
Deposito->>entidadBenefica: NecesidadMaterial
entidadBenefica->>entidadBenefica: obtenerNecesidadesInsatisfecha()
entidadBenefica->>donacionService: satisfacerNecesidad()
donacionService->>donacionController: NecesidadMaterial
donacionController->>donacionController: guardarNecesidad()
donacionService->>entidadBenefica: Donacion

entidadBenefica->>Donador: True








sequenceDiagram
Actor User

participant Donador
Participant entidadBenefica
Participant donacionService
Participant Deposito
Participant donacionController

participant entidadBeneficaRepository@{ "type" : "database" }

User->>Donador: puedeDonar()
Donador->>entidadBenefica: puedeOonar()
entidadBenefica->>donacionService: obtenerQuejas()
donacionService->>entidadBenefica: null
entidadBenefica->>Deposito: agregarEntidad()
Deposito->>donacionController: registrarNecesidad()
donacionController->>donacionController: guardarNecesidad()
donacionController->>Deposito: NecesidadMaterial
donacionController->>entidadBeneficaRepository: registrarNecesidad()
Deposito->>entidadBenefica: NecesidadMaterial
entidadBenefica->>entidadBenefica: obtenerNecesidadesInsatisfecha()
entidadBenefica->>donacionService: satisfacerNecesidad()
donacionService->>donacionController: NecesidadMaterial
donacionController->>donacionController: guardarNecesidad()
donacionController->>entidadBeneficaRepository: registrarNecesidad()
donacionService->>entidadBenefica: Donacion

entidadBenefica->>Donador: True















