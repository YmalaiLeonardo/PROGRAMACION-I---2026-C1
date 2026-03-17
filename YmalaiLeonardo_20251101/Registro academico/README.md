# 📚 Registro Académico — Calculadora de Calificaciones

Aplicación de escritorio desarrollada en Java con interfaz gráfica Swing que permite registrar los datos de un estudiante, ingresar sus calificaciones y calcular automáticamente su nota final, determinando si aprobó o reprobó el curso.

---

## ✨ Características

- Registro de datos del estudiante: nombre, matrícula y carrera
- Validación de matrícula (8 dígitos, rango 20200001 – 20262999)
- Validación de nombre y carrera (solo letras y espacios)
- Ingreso de calificaciones con rangos definidos:
  - Prácticas: 0 – 40 puntos
  - Parciales: 0 – 20 puntos
  - Asignaciones: 0 – 20 puntos
  - Examen Final: 0 – 20 puntos
- Cálculo automático de la nota final (máximo 100 puntos)
- Resultado en tiempo real: **Aprobado** (≥ 60) o **Reprobado** (< 60)
- Limpieza automática del formulario después de calcular
- Interfaz centrada y adaptable al tamaño de la ventana

---

## 🗂️ Estructura del proyecto
```
RegistroAcademico/
├── src/
│   ├── Main.java
│   ├── Estudiante.java
│   └── RegistroAcademicoGUI.java
└── nbproject/
```

## ▶️ Cómo ejecutar

### Requisitos
- Java JDK 8 o superior

### Pasos

1. Descarga los archivos del repositorio:
   - `Main.java`
   - `Estudiante.java`
   - `RegistroAcademicoGui.java`

2. Coloca los 3 archivos en la misma carpeta

3. Compila los archivos:
```
javac Estudiante.java RegistroAcademicoGui.java Main.java
```

4. Ejecuta el programa:
```
java Main
```

---

## 📋 Uso

1. Ingresa el **nombre completo** del estudiante
2. Ingresa la **matrícula** (8 dígitos entre 20200001 y 20262999)
3. Ingresa la **carrera**
4. Completa las **calificaciones** dentro de los rangos indicados
5. Presiona **Calcular Resultado**
6. El panel derecho mostrará la nota final y el resultado

---

## 🛠️ Tecnologías

- Java
- Java Swing
- NetBeans IDE

---

## 👨‍💻 AUTOR
**Ymalai Dorangel Leonardo Ramon**  
ITLA - Programación Orientada a Objetos - 2026
