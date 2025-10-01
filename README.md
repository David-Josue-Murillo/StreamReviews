# StreamReviews

[![Java](https://img.shields.io/badge/language-Java-blue.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Issues](https://img.shields.io/github/issues/David-Josue-Murillo/StreamReviews)](https://github.com/David-Josue-Murillo/StreamReviews/issues)
[![Last Commit](https://img.shields.io/github/last-commit/David-Josue-Murillo/StreamReviews)](https://github.com/David-Josue-Murillo/StreamReviews/commits/main)

Aplicación en Java que utiliza la API de Streams para procesar opiniones de clientes sobre productos, identificar reseñas positivas, agruparlas por producto y generar un ranking de los más valorados.

---

## 🚀 Instalación

1. **Clona este repositorio**
   ```bash
   git clone https://github.com/David-Josue-Murillo/StreamReviews.git
   cd StreamReviews
   ```

2. **Compila el proyecto**
   - Usando Maven:
     ```bash
     mvn clean package
     ```
   - O usando javac:
     ```bash
     javac -d out src/**/*.java
     ```

3. **Ejecuta la aplicación**
   - Con Maven:
     ```bash
     mvn exec:java -Dexec.mainClass="com.tuempresa.streamreviews.Main"
     ```
   - O directamente:
     ```bash
     java -cp out com.tuempresa.streamreviews.Main
     ```

---

## 🧑‍💻 Uso

1. **Carga las reseñas**  
   La aplicación carga un archivo (por ejemplo, `opiniones.csv`) con las reseñas de los clientes.

2. **Procesa las opiniones**  
   Utiliza la API de Streams de Java para:
   - Identificar reseñas positivas
   - Agrupar reseñas por producto
   - Generar un ranking de productos más valorados

3. **Visualiza resultados**  
   En la interfaz, podrás ver:
   - Listado de reseñas por producto
   - Ranking de productos por valoración

---

## 🗺️ Roadmap

- [x] Procesar archivos de opiniones usando Streams
- [x] Identificar reseñas positivas
- [x] Agrupar reseñas por producto
- [x] Generar ranking de productos más valorados

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más información.

---

## 💡 Créditos

Desarrollado por [David Josué Murillo](https://github.com/David-Josue-Murillo)
