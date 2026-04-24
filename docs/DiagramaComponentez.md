
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

    note "existen quejas para las donaciones"
    class Queja{}
    
    class EntidadBenefica{
        -int Id
        -Strong razonSocial
        -String domicilio
        +agregarEntidad()
       
    }

    note "entidadBenefica tienen necesidad Material"
    class NecesidadMaterial{}


    note "El deposito tienen productos"
    Deposito --* Producto

    class Deposito{
        -Int capacidadMaxima
        -String nombre
        -Int stockActual
        -String direccion
        -List productos

        +ProductoDTO registrarProducto()
        +Boolean verificarCantidad()
        +List<NecesidadMaterialDTO> obtenerNecesidadesInsatisfechas()
        +EntidadBenefica ejecutarAlgoritmoMatchMarking()
    
    }

    note "El producto tiene categoria"
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

    note "la donacion tienen categoria"
    class Donacion{

    
    
    }

    
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
    
    class Donador{
        +String nombre
        +String apellido 
        +Enum estado
        +registrarDonacion()
        
    }

    class Queja{

    
    }
    
    class EntidadBenefica{
        -int Id
        -Strong razonSocial
        -String domicilio
        -List necesidadesMaterialex()
        +agregarEntidad()
        
    }

    DonacionService --* DonacionController
    
    class DonacionService{

        +satisfacerNecesidad()

    }

    class DonacionController{

        +satisfacerNecesidad()

    }

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

        +ProductoDTO registrarProducto()
        +Boolean verificarCantidad()
        +List<NecesidadMaterialDTO> obtenerNecesidadesInsatisfechas()
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

    
    
    }



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
    
    class Donador{
        +String nombre
        +String apellido 
        +Enum estado
        +registrarDonacion()
        
    }

    class EntidadBenefica{
        -int Id
        -Strong razonSocial
        -String domicilio
        -List necesidadesMaterialex()
        +agregarEntidad()
        
       
    }

    DonacionService --o DonacionController
    class DonacionService{

        +satisfacerNecesidad()

    }

    class DonacionController{

        +satisfacerNecesidad()

    }

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
        +List<NecesidadMaterial> obtenerNecesidadesInsatisfechas()
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
    
    
    
    }

    

     

    

     

