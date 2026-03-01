# 🚗 Sistema de Vehículos con Herencia

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/POO-Herencia-4A4A55?style=for-the-badge)


## 📋 DESCRIPCIÓN

**Sistema de Vehículos con Herencia** es una aplicación de consola en Java que demuestra **HERENCIA** y **POLIMORFISMO** en Programación Orientada a Objetos mediante una jerarquía de vehículos.

## ✨ CARACTERÍSTICAS

### 🚗 **Clase AutoMovil** (Padre)
- Atributos: `marca`, `modelo`, `year`, `color`
- Métodos: `encender()`, `apagar()`, `acelerar()`, `frenar()`
- Getters y setters

### 🏎️ **Clase HondaCivic** (Hija)
- Hereda de `AutoMovil` usando `extends`
- Sobrescribe todos los métodos con `@Override`
- Llama al constructor padre con `super()`

### 🎯 **Conceptos Demostrados**
- ✅ Herencia (`extends`)
- ✅ Llamada al constructor padre (`super()`)
- ✅ Sobrescritura de métodos (`@Override`)
- ✅ Polimorfismo
- ✅ Encapsulamiento

## 🚀 CÓMO EJECUTAR

# Compilar
`javac Vehiculo_Herencia.java AutoMovil.java HondaCivic.java`

# Ejecutar
`java Vehiculo_Herencia`

## 👨‍💻 AUTOR
**Ymalai Dorangel Leonardo Ramon**  
ITLA - Programación Orientada a Objetos - 2026
