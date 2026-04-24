---
title: tpa-diagrama-clases
---
classDiagram
    
    Usuario <|-- Donador
    Usuario <|-- EntidadBenefica
    Usuario : +String password
    Usuario : +String nombreUsuario
    Usuario: +isAdmin()
    Usuario: +isUser()
    Usuario: +existeUser()
    Usuario: +registrarQueja()
    
    
    Donacion --o Queja
    Donador --o Queja
    
    class Queja{
        -int Id
        -String donacionId
        -String donadorId
        -String descripcion
    }
    
    Donador --> DonacionService
    class Donador{
        +String nombre
        +String apellido 
        +Enum estado
        +registrarDonacion()
        
    }

    EntidadBenefica --> DonacionService
    class EntidadBenefica{
        -int Id
        -Strong razonSocial
        -String domicilio
        -List necesidadesMaterialex()
        +agregarEntidad()
        
       
    }

    DonacionService --o DonacionController
    DonacionService --> Queja
    class DonacionService{

        +satisfacerNecesidad()
        +obtenerQuejasDe()

    }
    
    DonacionController ..|> EntidadBeneficaRepository

    class DonacionController{

        +satisfacerNecesidad()

    }

    EntidadBenefica --* NecesidadMaterial
    NecesidadMaterial --> Deposito

    class NecesidadMaterial{

        -Int Id
        -String entidadId
        -Int nivelDeUrgencia
        -String descripcion
        
    }

    Deposito --* Producto

    class Deposito{
    
        -Int capacidadMaxima
        -String nombre
        -Int stockActual
        -String direccion
        -List productos

        +Producto registrarProducto()
        +Boolean verificarCantidad()
        +List obtenerNecesidadesInsatisfechas()
        +EntidadBenefica ejecutarAlgoritmoMatchMarking()
    
    }

    
    Categoria <|-- subCategoria
    Categoria : -String descripcion
    Producto --o Categoria

    class Producto{
    
        -String nombre
        -String descripcion
        -String codigoQR
        -Categoria categoria

    }
    class subCategoria{
    
    }

    
    class Donacion{
    
    -int Id
    -String donadorId
    -String depositoId
    -String productoId
    -String descripcion 
    
    
    }


    class EntidadBeneficaRepository{


       +guardarNecesidad()
    
    }
    
    







