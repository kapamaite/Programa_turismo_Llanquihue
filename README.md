![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Semana 8 – Interfaces, Colecciones Genéricas y GUI
## 👤 Autor del proyecto
- **Nombre completo:** Maite Quezada
- **Carrera:** Ingeniería en Informática
- **Sede:** Online, Santiago

---

## 📘 Descripción de lo desarrollado esta semana

Se amplió el sistema de la agencia **Llanquihue Tour** incorporando una interfaz de comportamiento común llamada `Registrable`, nuevas entidades del sistema (`GuiaTuristico`, `Vehiculo`, `ColaboradorExterno`) y una colección genérica `ArrayList<Registrable>` para gestionarlas de forma unificada. Se aplicó `instanceof` para diferenciar el tipo de cada objeto en tiempo de ejecución. Además, se implementó una interfaz gráfica básica con `JOptionPane` que permite ingresar nuevas entidades y mostrar un resumen de las registradas.

---

## 🏗️ Clases creadas

- **Registrable**: interfaz con el método `mostrarResumen()` como contrato común.
- **GuiaTuristico**: implementa `Registrable`, atributos `nombre` e `idioma`.
- **Vehiculo**: implementa `Registrable`, atributos `tipo` y `patente`.
- **ColaboradorExterno**: implementa `Registrable`, atributos `nombre` y `especialidad`.
- **GestorEntidades**: colección `ArrayList<Registrable>` con recorrido e `instanceof`.
- **InterfazGrafica**: GUI con `JOptionPane` para ingresar y mostrar entidades.

---

## 📁 Estructura del proyecto

LlanquihueTourApp/
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── model/
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── Proveedor.java
│   │   ├── Operador.java
│   │   ├── Contacto.java
│   │   ├── Direccion.java
│   │   ├── Tour.java
│   │   ├── ServicioTuristico.java
│   │   ├── RutaGastronomica.java
│   │   ├── PaseoLacustre.java
│   │   ├── ExcursionCultural.java
│   │   ├── Registrable.java
│   │   ├── GuiaTuristico.java
│   │   ├── Vehiculo.java
│   │   └── ColaboradorExterno.java
│   ├── data/
│   │   ├── GestorDatos.java
│   │   ├── GestorServicios.java
│   │   └── GestorEntidades.java
│   ├── service/
│   │   └── TourService.java
│   ├── util/
│   │   └── Validador.java
│   ├── ui/
│   │   ├── Main.java
│   │   └── InterfazGrafica.java
│   └── resources/
│       └── tours.txt
├── .gitignore
└── README.md

---

## ⚙️ Instrucciones para compilar y ejecutar

1. Clona el repositorio desde GitHub:
git clone https://github.com/kapamaite/Programa_turismo_Llanquihue.git

2. Abre el proyecto en IntelliJ IDEA.
3. Verifica que el archivo `tours.txt` esté en `src/resources/`.
4. Ejecuta el archivo `Main.java` desde el paquete `ui`.
5. Se abrirá una ventana con opciones para agregar entidades y mostrar el resumen.

---

**Repositorio GitHub:** https://github.com/kapamaite/Programa_turismo_Llanquihue
**Fecha de entrega:** 09/07/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
