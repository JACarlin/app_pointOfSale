# 🛒 Punto de Venta en Java Swing

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Apache NetBeans IDE](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

> Aplicación de escritorio para un Punto de Venta (POS) simple, desarrollada con Java y la biblioteca gráfica Swing. Este proyecto fue uno de mis primeros desarrollos en Java, enfocado en aprender los fundamentos de la POO y la creación de interfaces de usuario.

## 📜 Sobre el Proyecto

Este proyecto es una simulación de un software de Punto de Venta para un pequeño negocio. Permite gestionar un catálogo de productos y simular el proceso de venta, añadiendo productos a un carrito y calculando el total.

La aplicación sigue una arquitectura en capas para organizar el código:
* **Capa de Presentación (UI):** Formularios (`JFrame`, `JDialog`) creados con Java Swing, que componen la interfaz gráfica.
* **Capa de Negocio:** Lógica de la aplicación (ej. `NegocioProducto.java`), que maneja las operaciones como altas, bajas y búsquedas de productos.
* **Capa de Modelo:** Define las clases que representan los datos (ej. `Producto.java`).

Una característica clave de este proyecto es su mecanismo de persistencia: **no utiliza una base de datos tradicional**. En su lugar, el catálogo de productos se guarda y se carga desde **archivos de texto locales (`.txt`)**, demostrando el manejo de archivos (File I/O) en Java.

<br>

## ✨ Características

* **Gestión de Catálogo de Productos:**
    * Dar de alta nuevos productos con nombre, código, cantidad, precio unitario, precio de mayoreo y una imagen.
    * Visualización del inventario completo en una tabla.
* **Módulo de Venta:**
    * Búsqueda de productos desde la pantalla principal.
    * Adición de productos al "carrito" de la venta actual.
    * Eliminación de productos del carrito.
* **Cálculo de Totales:**
    * Cálculo automático del subtotal y total (incluyendo un 16% de IVA).
* **Persistencia de Datos:**
    * Funcionalidad para **Guardar** el catálogo de productos actual en un archivo `.txt`.
    * Funcionalidad para **Abrir** y cargar un catálogo de productos desde un archivo `.txt`.
* **Interfaz Gráfica:**
    * Interfaz de usuario intuitiva construida completamente con Java Swing.

<br>

## 🛠️ Construido Con

* [Java (JDK 8+)](https://www.oracle.com/java/technologies/downloads/)
* [Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/index.html) para la Interfaz Gráfica de Usuario (GUI).
* [Apache NetBeans](https://netbeans.apache.org/) (IDE utilizado para el desarrollo).

<br>

## 🚀 Empezando

Para ejecutar este proyecto, la forma más sencilla es utilizando un IDE de Java.

### Prerrequisitos

* Tener instalado un [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/), versión 8 o superior.

### Ejecución

1.  **Clona el repositorio:**
    ```bash
    git clone https://github.com/JACarlin/app_pointOfSale.git
    ```
2.  **Abre el Proyecto en un IDE:**
    * Abre tu IDE de Java preferido (se recomienda **Apache NetBeans**, ya que fue con el que probablemente se creó el proyecto).
    * Selecciona `File > Open Project` y busca la carpeta que acabas de clonar. El IDE debería reconocerlo como un proyecto de Java.
3.  **Ejecuta la Aplicación:**
    * Localiza la clase principal del proyecto, que es `ctjaapppuntodeventa.CTJAapppuntodeventa.java`.
    * Haz clic derecho sobre el archivo y selecciona `Run File` (o presiona `Shift + F6` en NetBeans).

<br>

## 📖 Uso de la Aplicación

1.  Al iniciar, la aplicación mostrará la ventana principal de ventas.
2.  Para poder vender, primero necesitas un catálogo. Ve a `Menú > Catálogos > Productos` (o haz clic en el botón "Catálogo de productos").
3.  En la ventana de "Catálogo", **añade** varios productos usando el formulario. No olvides seleccionar una imagen para cada uno.
4.  Una vez que tengas productos en la tabla, usa el botón **"Guardar"** para crear un archivo `.txt` que contendrá tu inventario.
5.  Puedes cerrar y volver a abrir la app. Para recuperar tu inventario, usa el botón **"Abrir"** en la ventana de catálogo y selecciona el archivo `.txt` que guardaste.
6.  En la ventana principal, busca un producto por su nombre en la barra de búsqueda para agregarlo al carrito de venta.
7.  El sistema calculará automáticamente el subtotal y el total con IVA.
8.  El botón **"Pagar"** limpiará el carrito para simular el final de una transacción.

<br>
