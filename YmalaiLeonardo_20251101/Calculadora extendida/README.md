# 🧮 Calculadora Extendida - Java Swing

Aplicación de escritorio desarrollada con **Java Swing** que integra en una sola interfaz una calculadora aritmética, un conversor de temperatura y una calculadora de raíz cuadrada y exponente.


## ✨ Características

- ➕ **Calculadora aritmética** con las 4 operaciones (suma, resta, multiplicación y división)
- ⚠️ **Validación de división por cero** con mensaje de error emergente
- 🌡️ **Conversor de temperatura** bidireccional (°F ↔ °C)
- √ **Raíz cuadrada** con validación de números negativos
- 🔢 **Exponente** (base^n)
- 📜 **Scroll** para navegar entre las secciones
- 🎨 Interfaz gráfica limpia y organizada

## 📐 Fórmulas utilizadas
```
°C = (°F − 32) × 5/9
°F = (°C × 9/5) + 32
Raíz cuadrada: Math.sqrt(n)
Potencia: Math.pow(base, exp)
```

## 🛠️ Tecnologías utilizadas

- **Java JDK** 8 o superior
- **Java Swing** para la interfaz gráfica
- **Apache NetBeans IDE**
- **Principios de POO**
- 
## 🗂️ Estructura del proyecto
```
CalculadoraExtendida/
├── src/
│   ├── Main.java                   # Punto de entrada
│   ├── CalculadoraExtendida.java   # Interfaz gráfica principal
│   ├── Calculadora.java            # Lógica de operaciones aritméticas
│   ├── ConversorTemperatura.java   # Lógica de conversión de temperatura
│   └── Raizcuadrada_Exponente.java # Lógica de raíz cuadrada y potencia
└── nbproject/
```


## ▶️ Cómo ejecutar

### Requisitos
- Java JDK 8 o superior

### Pasos

1. Descarga los archivos del repositorio:
   - `Main.java`
   - `CalculadoraExtendida.java`
   - `Calculadora.java`
   - `ConversorTemperatura.java`
   - `Raizcuadrada_Exponente.java`
   

2. Coloca los 3 archivos en la misma carpeta

3. Compila los archivos:
```
javac Main.java CalculadoraExtendida.java Calculadora.java ConversorTemperatura.java Raizcuadrada_Exponente.java
```

4. Ejecuta el programa:
```
java Main
```

## 👨‍💻 AUTOR
**Ymalai Dorangel Leonardo Ramon**  
ITLA - Programación Orientada a Objetos - 2026
