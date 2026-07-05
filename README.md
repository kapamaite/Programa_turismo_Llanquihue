![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Semana 7 – Polimorfismo y Colecciones Genéricas
## 👤 Autor del proyecto
- **Nombre completo:** Maite Quezada
- **Carrera:** Ingeniería en Informática
- **Sede:** Online, Santiago

---

## 📘 Descripción de lo desarrollado esta semana

Se extendió la jerarquía de clases de la agencia **Llanquihue Tour** incorporando polimorfismo y colecciones genéricas. Se agregó el método `mostrarInformacion()` a la superclase `ServicioTuristico` y se sobrescribió en cada subclase para mostrar información específica según el tipo de servicio. Los objetos se almacenan en una colección `List<ServicioTuristico>` y se recorren de forma polimórfica mediante un bucle for-each.

---

## 🏗️ Clases modificadas

- **ServicioTuristico**: se agregó el método `mostrarInformacion()` como implementación base.
- **RutaGastronomica**: sobrescribe `mostrarInformacion()` mostrando nombre, duración y número de paradas.
- **PaseoLacustre**: sobrescribe `mostrarInformacion()` mostrando nombre, duración y tipo de embarcación.
- **ExcursionCultural**: sobrescribe `mostrarInformacion()` mostrando nombre, duración y lugar histórico.
- **GestorServicios**: almacena los servicios en una `List<ServicioTuristico>` y los recorre invocando `mostrarInformacion()`.

---

## ⚙️ Instrucciones para compilar y ejecutar

1. Clona el repositorio desde GitHub:
git clone https://github.com/kapamaite/Programa_turismo_Llanquihue.git

2. Abre el proyecto en IntelliJ IDEA.
3. Verifica que el archivo `tours.txt` esté en `src/resources/`.
4. Ejecuta el archivo `Main.java` desde el paquete `ui`.
5. La consola mostrará cada servicio turístico con su información específica.

---

**Repositorio GitHub:** https://github.com/kapamaite/Programa_turismo_Llanquihue
**Fecha de entrega:** 05/07/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
