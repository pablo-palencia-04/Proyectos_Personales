# Sistema de Gestión de Usuarios

Proyecto de inicio de sesión y CRUD de usuarios desarrollado en Java con NetBeans y MySQL. Permite autenticar usuarios, gestionar sus datos (crear, leer, actualizar, eliminar) y mantener una sesión activa.

## Características
- Login con contraseña encriptada (SHA-256).
- Gestión completa de usuarios (CRUD) desde interfaz gráfica.
- Muestra usuario conectado en el menú principal y en la ventana de mantenimiento.
- Conexión a base de datos MySQL.

## Tecnologías utilizadas
- **Java** (Swing)
- **MySQL** (base de datos)
- **JDBC** (conexión)
- **NetBeans** (IDE)
- **Git/GitHub** (controlador de versiones)

## Requisitos previos
- Java JDK 8 o superior.
- MySQL Server.
- NetBeans (opcional, se puede compilar desde línea de comandos).

## Configuración de la base de datos
1. Ejecuta el script `(LMD_LDD)Usuario.sql` en MySQL Workbench o línea de comandos. Esto creará la base de datos `sig2k25` y la tabla `usuario`.
2. Ajusta las credenciales de conexión en `Modelo/Conexion.java` según tu entorno (usuario, contraseña, puerto).

## Ejecución
- Abre el proyecto en NetBeans.
- Compila y ejecuta la clase principal `Sistema_LoginUsers`.
- Credenciales de prueba: usuario `admin`, contraseña `12345`.

## Estructura del proyecto
Sistema_LoginUsers/
├── Source Packages/
│ ├── Controlador/
│ │ ├── Usuario.java
│ │ ├── UsuarioConectado.java
│ │ └── Utilidades.java
│ ├── Modelo/
│ │ ├── Conexion.java
│ │ └── UsuarioDAO.java
│ └── Vista/
│ │ ├── Login.java
│ │ ├── MantenimientoUsuario.java
│ │ └── MdiGeneral.java
│ └── com.mycompany.sistema_loginusers/
│   └── Sistema_LoginUsers.java
├── Test Packages/
│ └── default package
├── Dependencies/
│ ├── mysql-connector-j-8.0.33.jar
│ └── protobuf-java-3.21.9.jar
├── Java Dependencies/
│ └── JDK 23 (Default)
└── Project Files/
  └── pom.xml


## Mejoras futuras
- Implementar roles a los usuarios.
- Bitácora de acciones.
- Mejorar la interfaz gráfica.

## Autor
Pablo Romeo Palencia Rosales
https://github.com/pablo-palencia-04

## Licencia
Este proyecto está bajo la licencia MIT.