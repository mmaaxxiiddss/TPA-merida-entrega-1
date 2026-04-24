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
        -Strong razonSocial
        -String domicilio
        +agregarEntidad()
        
        
    }



---
title: tpa-diagrama-clases
---
classDiagram
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


---
title: tpa-diagrama-clases
---
classDiagram
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

    class Producto{}





        
