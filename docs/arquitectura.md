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
Deposito-->donacionService: registrarNecesidad()
donacionService->>donacionController: registrarNecesidad()
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

entidadBenefica->>Donador: true




