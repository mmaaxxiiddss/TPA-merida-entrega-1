



---
title: tpa-diagrama-clases
---
classDiagram
    note "El Sistema tiene usuario"
    Usuario <|-- Donador
    Usuario <|-- EntidadBenefica
    Usuario : +String password
    Usuario : +String nombreUsuario
    Usuario: +isAdmin()
    Usuario: +isUser()
    Usuario: +existeUser()
    Usuario: registrarQueja()
    
    class Donador{
        +String nombre
        +String apellido 
        +Enum estado
        +registrarDonacion()
        
    }
    class EntidadBenefica{
        -int Id
        -String domicilio
        
        
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
    Categoria : -String descripcion
    class subCategoria{
    
    }

        
    


---
title: tpa-diagrama-clases
---
classDiagram
    note "El deposito tienen productos"
    class Deposito{
        -Int capacidadMaxima
        -String nombre
        -Int stockActual
        -String direccion

        +ProductoDTO registrarProducto()
        +Boolean verificarCantidad()
        +List<NecesidadMaterialDTO> necesidadesInsatisfechas()
        +EntidadBenefica ejecutarAlgoritmoMatchMarking()
        
        
    }





        
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

entidadBenefica->>Donador: True
