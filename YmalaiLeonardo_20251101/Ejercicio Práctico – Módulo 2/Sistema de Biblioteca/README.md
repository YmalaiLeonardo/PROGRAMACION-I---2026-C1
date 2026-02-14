# 📚 Sistema de Biblioteca


## 📋 DESCRIPCIÓN

**Sistema de Biblioteca** es una aplicación de consola desarrollada en Java que simula la gestión básica de una biblioteca. El sistema permite administrar libros, usuarios y préstamos, demostrando conceptos fundamentales de Programación Orientada a Objetos (POO).

Este proyecto fue desarrollado como práctica académica y muestra la implementación de relaciones entre clases, encapsulamiento y métodos de negocio.

---

## ✨ CARACTERÍSTICAS

### 📖 **Clase Libro**
- Almacena título, autor, ISBN y disponibilidad
- Método para consultar si está disponible
- Getters y setters para acceso controlado

### 👤 **Clase Usuario**
- Nombre e ID único (generado automáticamente)
- Colección de libros prestados (ArrayList)
- Métodos para prestar y devolver libros
- Visualización de libros prestados

### 📋 **Clase Préstamo**
- Registra fecha, usuario y libro asociado
- Contador estático de total de préstamos
- Muestra información detallada del préstamo

### 🎯 **Funcionalidades**
- ✅ Prestar libros (solo si están disponibles)
- ✅ Devolver libros
- ✅ Consultar disponibilidad
- ✅ Ver libros prestados por usuario
- ✅ IDs únicos automáticos
- ✅ Control de préstamos duplicados

---

## 🚀 CÓMO EJECUTAR

### **Requisitos Previos**
- Java JDK 8 o superior instalado
- Terminal / Símbolo del sistema

### **Pasos de Ejecución**

1. **Compilar todos los archivos:**
   ```bash
   javac Libro.java Usuario.java Prestamo.java SitemaBiblioteca.java
2. **Ejecutar el programa:**
   ```bash
   java SistemaBiblioteca
   ```
---

##👨‍💻 AUTOR
**Ymalai Dorangel Leonardo Ramon**
**Estudiante de Desarrollo de Software**

**Institución:** ITLA - Instituto Tecnológico de Las Américas
**Fecha:** Febrero 2026
