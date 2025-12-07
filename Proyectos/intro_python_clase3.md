# Introducción a Python y Herramientas de Desarrollo

## 🎯 Objetivos de la Clase
- Entender qué es Python y por qué es importante
- Conocer las herramientas que utilizaremos: VS Code, Jupyter Notebook, GitHub Copilot
- Preparar el entorno de trabajo
- Establecer las bases para comenzar a programar

---

## 🐍 ¿Qué es Python?

### Definición Simple
Python es un **lenguaje de programación** - básicamente, es una forma de "hablar" con las computadoras para decirles qué queremos que hagan.

**Página oficial:** https://www.python.org/

### ¿Por qué Python?
**Fácil de leer y escribir:**
```python
# Esto es Python - ¡se parece al inglés!
nombre = "María"
print(f"Hola {nombre}, bienvenida a Python!")
```

**Muy versátil - se usa para:**
- 🌐 Desarrollo web (Instagram, YouTube, Netflix)
- 📊 Análisis de datos (bancos, empresas, investigación)
- 🤖 Inteligencia Artificial (ChatGPT, reconocimiento de imágenes)
- 🔬 Investigación científica
- 🎮 Videojuegos
- 💼 Automatización de tareas repetitivas

### Ventajas de Python
- **Sintaxis clara:** Se lee casi como inglés
- **Comunidad gigante:** Millones de programadores te pueden ayudar
- **Bibliotecas abundantes:** Como tener herramientas ya hechas
- **Multiplataforma:** Funciona en Windows, Mac, Linux
- **Gratuito y de código abierto**

---

## 💻 ¿Qué es Visual Studio Code (VS Code)?

### Definición
VS Code es tu **editor de código** - piénsalo como el Microsoft Word, pero para programadores.

**Página oficial:** https://code.visualstudio.com/

### ¿Por qué usamos VS Code?
- **Gratuito y potente**
- **Extensiones:** Puedes agregar funcionalidades específicas para Python
- **Terminal integrado:** No necesitas cambiar de programa
- **Control de versiones:** Se integra con Git
- **Muy popular:** La mayoría de programadores lo usan

### Características Principales
- **Resaltado de sintaxis:** Los colores te ayudan a leer el código
- **Autocompletado:** Te sugiere mientras escribes
- **Detección de errores:** Te avisa si algo está mal
- **Múltiples archivos:** Puedes trabajar en varios proyectos a la vez

---

## 📊 ¿Qué es Jupyter Notebook?

### Definición
Jupyter es como un **cuaderno digital** donde puedes mezclar código, texto explicativo, gráficos y resultados en un solo documento.

**Página oficial:** https://jupyter.org/

### ¿Cuándo usar Jupyter?
- **Análisis de datos:** Perfecto para explorar información
- **Aprendizaje:** Ideal para experimentar y documentar
- **Prototipado:** Para probar ideas rápidamente
- **Presentaciones:** Puedes mostrar código y resultados juntos

### Jupyter Local vs. Google Colab

#### Jupyter Notebook (Local)
**¿Qué significa "local"?**
- Corre en **tu computadora** usando tus propios recursos
- Usa la **memoria RAM** y **procesador** de tu PC
- Los archivos se guardan en **tu disco duro**

**Ventajas:**
- ✅ **Sin límites de tiempo:** Puedes trabajar horas sin interrupciones
- ✅ **Privacidad total:** Tus datos nunca salen de tu computadora
- ✅ **Sin internet:** Una vez instalado, funciona offline
- ✅ **Control total:** Instalas las librerías que necesites
- ✅ **Velocidad estable:** Depende solo de tu hardware

**Desventajas:**
- ❌ **Instalación requerida:** Necesitas configurar Python y Jupyter
- ❌ **Limitado por hardware:** Si tu PC es lenta, Jupyter será lento
- ❌ **Sin colaboración fácil:** Difícil compartir en tiempo real

#### Google Colab (En la nube)
**¿Qué es Google Colab?**
- Jupyter que corre en **servidores de Google**
- Accedes desde tu **navegador web**
- Usa los **recursos de Google** (RAM, GPU, almacenamiento)

**Página oficial:** https://colab.research.google.com/

**Ventajas:**
- ✅ **Sin instalación:** Solo necesitas navegador web
- ✅ **GPU/TPU gratis:** Para machine learning y IA (con límites)
- ✅ **Colaboración fácil:** Como Google Docs para código
- ✅ **Acceso desde cualquier lugar:** Solo necesitas internet
- ✅ **Recursos potentes:** Mejor hardware que muchas PCs

**Desventajas:**
- ❌ **Límites de tiempo:** Sesiones de ~12 horas máximo
- ❌ **Requiere internet:** No funciona sin conexión
- ❌ **Límites de recursos gratuitos:** Google puede restringir uso intensivo
- ❌ **Menos privacidad:** Tus datos pasan por servidores de Google
- ❌ **Cola de espera:** En horas pico puede haber demora para GPU

### Hardware Recomendado para Machine Learning Local

#### **Hardware Mínimo (Entrada):**
- **CPU:** Intel i5 / AMD Ryzen 5 (4+ núcleos)
- **RAM:** 16 GB mínimo
- **GPU:** NVIDIA RTX 3060 / GTX 1660 Ti (8GB+ VRAM)
- **Almacenamiento:** SSD 500GB+

#### **Hardware Óptimo (Serio):**
- **CPU:** Intel i7/i9 / AMD Ryzen 7/9
- **RAM:** 32 GB o más
- **GPU:** NVIDIA RTX 4070/4080/4090 (12GB+ VRAM)
- **Almacenamiento:** SSD NVMe 1TB+

#### **¿Cuándo considerar hardware local?**
- **Proyectos largos:** Entrenamientos de días/semanas
- **Datos sensibles:** Información que no puede salir de tu empresa
- **Control total:** Sin límites de tiempo ni recursos
- **Múltiples experimentos:** Cuando Colab te limita mucho

### ¿Cuál Usar y Cuándo?

| Situación | Recomendación |
|-----------|---------------|
| **Aprendiendo Python** | Jupyter Local |
| **Experimentos ML pequeños** | Google Colab |
| **ML serio con buen hardware** | Jupyter Local |
| **Entrenamiento intensivo** | Local si tienes RTX 4070+ |
| **Datos confidenciales** | Jupyter Local |
| **Trabajo colaborativo** | Google Colab |
| **Sin buena conexión internet** | Jupyter Local |
| **PC básica sin GPU** | Google Colab |
| **Presupuesto limitado** | Google Colab primero |

### Diferencias con VS Code
| VS Code | Jupyter Local | Google Colab |
|---------|---------------|---------------|
| Archivos .py | Archivos .ipynb | Archivos .ipynb |
| Para aplicaciones completas | Para análisis y experimentación | Para análisis y experimentación |
| Código en bloques continuos | Código en celdas separadas | Código en celdas separadas |
| Más profesional | Más educativo/experimental | Más educativo/experimental |
| Local únicamente | Local únicamente | Solo en la nube |

---

## 🤖 ¿Qué es GitHub Copilot?

### Definición
GitHub Copilot es tu **asistente de programación con IA** - como tener un programador experto que te ayuda mientras escribes código.

**Página oficial:** https://github.com/features/copilot

### ¿Cómo funciona?
- **Autocompletado inteligente:** Sugiere líneas completas de código
- **Entiende contexto:** Sabe qué estás tratando de hacer
- **Múltiples lenguajes:** No solo Python
- **Aprende de millones de códigos:** Usa las mejores prácticas

### Ejemplo Práctico
```python
# Tú escribes el comentario:
# función para calcular el área de un círculo

# Copilot te sugiere:
import math

def area_circulo(radio):
    return math.pi * radio ** 2
```

### Beneficios para Principiantes
- **Acelera el aprendizaje:** Ves ejemplos mientras programas
- **Reduce errores:** Te ayuda con la sintaxis
- **Explica patrones:** Aprendes buenas prácticas automáticamente
- **Menos frustración:** No te quedas atascado tanto tiempo

---

## 🛠️ ¿Cómo Trabajaremos?

### Extensiones de VS Code que Instalaremos

#### 1. 🌐 Spanish Language Pack (Extensión de Idioma Español)
**¿Para qué sirve?**
- Traduce la interfaz de VS Code al español
- Menús, botones y mensajes aparecen en español
- Facilita la navegación para quienes prefieren trabajar en su idioma nativo
- **Instalación:** Buscar "Spanish Language Pack" en extensiones

#### 2. 🐍 Python Extension
**¿Para qué sirve?**
- Soporte completo para programar en Python
- **Resaltado de sintaxis:** Colores que facilitan la lectura del código
- **IntelliSense:** Autocompletado inteligente de código
- **Depuración:** Encuentra y corrige errores paso a paso
- **Linting:** Detecta problemas de estilo y errores potenciales
- **Formateo automático:** Organiza tu código automáticamente
- **Instalación:** Buscar "Python" (de Microsoft) en extensiones

#### 3. 📊 Jupyter Extension
**¿Para qué sirve?**
- Permite usar Jupyter Notebooks **dentro de VS Code**
- Ejecutar celdas de código interactivamente
- Ver gráficos y resultados en el mismo editor
- **Combina lo mejor de ambos mundos:** VS Code + Jupyter
- Trabajar con archivos .ipynb sin salir de VS Code
- **Instalación:** Buscar "Jupyter" (de Microsoft) en extensiones

#### 4. 🤖 GitHub Copilot Extension
**¿Para qué sirve?**
- Activa el asistente de IA para programación
- Sugerencias de código en tiempo real
- Autocompletado inteligente contextual
- Ayuda a escribir funciones completas
- **Completamente gratuito** para uso personal
- **Instalación:** Buscar "GitHub Copilot" en extensiones

### Flujo Típico de Trabajo
1. **Abrir VS Code** → Editor principal (en español)
2. **Crear archivo .py** → Para programas completos (con Python Extension)
3. **Crear archivo .ipynb** → Para notebooks (con Jupyter Extension)
4. **Copilot activo** → Asistencia constante mientras programas
5. **Ejecutar código** → Ver resultados
6. **Iterar y mejorar** → Aprender haciendo

---

## 🌎 Contexto para LATAM

### Oportunidades con Python en LATAM
- **Fintech:** Mercado Pago, Nubank, Rappi usan Python
- **E-commerce:** MercadoLibre tiene miles de desarrolladores Python
- **Startups:** La mayoría usa Python para MVP (Producto Mínimo Viable)
- **Trabajo remoto:** Python abre oportunidades globales
- **Freelancing:** Alta demanda de desarrolladores Python

---

## 📚 Recursos de Apoyo

### Documentación Oficial
- **Python.org:** https://www.python.org/ - Documentación oficial de Python
- **VS Code Docs:** https://code.visualstudio.com/docs - Guías y tutoriales de VS Code
- **Jupyter.org:** https://jupyter.org/ - Todo sobre notebooks locales
- **Google Colab:** https://colab.research.google.com/ - Notebooks en la nube
- **GitHub Copilot:** https://github.com/features/copilot - Asistente de IA para programar

### Comunidades en Español
- **Python México, Argentina, Colombia:** Grupos activos
- **Stack Overflow en Español:** Para resolver dudas
- **Discord/Telegram:** Comunidades de programadores LATAM

### Práctica Adicional
- **W3Schools Python:** https://www.w3schools.com/python/ - Tutoriales interactivos paso a paso
- **HackerRank:** Ejercicios de programación
- **Codecademy:** Cursos interactivos
- **Real Python:** Tutoriales avanzados

---

## ❓ Preguntas Frecuentes

**P: ¿Necesito saber matemáticas avanzadas?**
R: No para empezar. Python se puede usar para muchas cosas que no requieren matemáticas complejas.

**P: ¿Cuánto tiempo toma aprender Python?**
R: Para hacer cosas básicas: 2-3 meses. Para ser competente profesionalmente: 6-12 meses con práctica constante.

**P: ¿Python es suficiente para conseguir trabajo?**
R: Python + bases de datos + un poco de web = muy buenas oportunidades laborales.

**P: ¿Qué hago si me atoré en un problema?**
R: 1) Copilot, 2) Google/Stack Overflow, 3) Compañeros de clase, 4) Profesor.

---

## 🎯 Próximos Pasos

### En Esta Clase
1. **Instalar Python** desde python.org
2. **Configurar VS Code** con las 4 extensiones esenciales:
   - Spanish Language Pack
   - Python Extension
   - Jupyter Extension
   - GitHub Copilot Extension
3. **Probar Jupyter Notebook** (local)
4. **Explorar Google Colab**
5. **Activar GitHub Copilot**
6. **Primeros pasos en Python** - Conceptos fundamentales:
   - Variables y asignación
   - Tipos de datos básicos (int, float, str, bool)
   - Conversión de tipos (casting)
   - Operadores matemáticos y lógicos
   - Manejo de texto y formato de strings
   - Entrada y salida de datos (input/print)
   - Colecciones básicas (listas, tuplas, diccionarios)

---

*¿Preguntas antes de empezar con la instalación y configuración?*