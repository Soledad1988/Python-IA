# Guía del Ecosistema de Python y sus Librerías

## Índice
1. [Introducción al Ecosistema de Python](#introducción)
2. [¿Qué es una Librería?](#qué-es-una-librería)
3. [Gestores de Paquetes](#gestores-de-paquetes)
4. [Librerías Estándar](#librerías-estándar)
5. [Librerías Populares por Categoría](#librerías-populares)
6. [Entornos Virtuales](#entornos-virtuales)

---

## Introducción al Ecosistema de Python {#introducción}

Python es uno de los lenguajes más populares del mundo gracias a su ecosistema robusto y extenso. Este ecosistema se compone de miles de librerías que extienden la funcionalidad básica del lenguaje, permitiendo resolver problemas complejos con pocas líneas de código.

El Python Package Index (PyPI) es el repositorio oficial que alberga más de 500,000 paquetes disponibles para la comunidad.

---

## ¿Qué es una Librería? {#qué-es-una-librería}

Una librería (o biblioteca) es un conjunto de módulos y funciones reutilizables que resuelven problemas específicos. En lugar de escribir código desde cero, puedes importar una librería y usar sus funcionalidades.

**Ejemplo básico:**
```python
# Sin librería
def calcular_raiz_cuadrada(numero):
    return numero ** 0.5

# Con librería
import math
resultado = math.sqrt(16)
```

---

## Gestores de Paquetes {#gestores-de-paquetes}

### pip - El gestor por defecto

`pip` es el gestor de paquetes estándar de Python. Permite instalar, actualizar y desinstalar librerías desde PyPI.

**Comandos básicos:**
```bash
# Instalar una librería
pip install nombre_libreria

# Instalar versión específica
pip install nombre_libreria==1.2.3

# Actualizar una librería
pip install --upgrade nombre_libreria

# Desinstalar
pip uninstall nombre_libreria

# Listar librerías instaladas
pip list

# Guardar dependencias
pip freeze > requirements.txt

# Instalar desde requirements.txt
pip install -r requirements.txt
```

### Otros gestores populares

- **conda**: Gestor de paquetes de Anaconda, popular en ciencia de datos
- **poetry**: Gestor moderno con mejor manejo de dependencias
- **pipenv**: Combina pip y entornos virtuales

---

## Librerías Estándar {#librerías-estándar}

Python incluye una "batería de librerías" que vienen instaladas por defecto. No requieren instalación adicional.

### Ejemplos de librerías estándar:

#### datetime - Manejo de fechas y horas
```python
from datetime import datetime, timedelta

# Fecha actual
ahora = datetime.now()
print(f"Fecha actual: {ahora}")

# Operaciones con fechas
manana = ahora + timedelta(days=1)
print(f"Mañana: {manana}")

# Formateo de fechas
fecha_formateada = ahora.strftime("%d/%m/%Y %H:%M")
print(f"Formato personalizado: {fecha_formateada}")
```

#### os - Interacción con el sistema operativo
```python
import os

# Directorio actual
print(f"Directorio actual: {os.getcwd()}")

# Listar archivos
archivos = os.listdir('.')
print(f"Archivos: {archivos}")

# Crear directorio
os.makedirs('nueva_carpeta', exist_ok=True)

# Variables de entorno
usuario = os.getenv('USER', 'desconocido')
```

#### json - Manejo de archivos JSON
```python
import json

# Diccionario a JSON
datos = {'nombre': 'Juan', 'edad': 30, 'ciudad': 'Buenos Aires'}
json_string = json.dumps(datos, indent=2)

# Guardar en archivo
with open('datos.json', 'w') as archivo:
    json.dump(datos, archivo, indent=2)

# Leer desde archivo
with open('datos.json', 'r') as archivo:
    datos_cargados = json.load(archivo)
```

#### random - Generación de números aleatorios
```python
import random

# Número aleatorio entre 1 y 10
numero = random.randint(1, 10)

# Elemento aleatorio de una lista
colores = ['rojo', 'azul', 'verde']
color_elegido = random.choice(colores)

# Mezclar lista
random.shuffle(colores)
```

---

## Librerías Populares por Categoría {#librerías-populares}

### 1. Análisis de Datos y Ciencia de Datos

#### NumPy - Computación numérica
```python
import numpy as np

# Crear array
arr = np.array([1, 2, 3, 4, 5])

# Operaciones vectorizadas
cuadrados = arr ** 2
print(f"Cuadrados: {cuadrados}")

# Estadísticas
print(f"Media: {np.mean(arr)}")
print(f"Desviación estándar: {np.std(arr)}")

# Matrices
matriz = np.array([[1, 2], [3, 4]])
print(f"Transpuesta:\n{matriz.T}")
```

#### Pandas - Manipulación de datos
```python
import pandas as pd

# Crear DataFrame
datos = {
    'nombre': ['Ana', 'Luis', 'María'],
    'edad': [25, 30, 28],
    'ciudad': ['Córdoba', 'Buenos Aires', 'Rosario']
}
df = pd.DataFrame(datos)

# Filtrar datos
mayores_27 = df[df['edad'] > 27]

# Estadísticas descriptivas
print(df.describe())

# Leer CSV
# df = pd.read_csv('archivo.csv')

# Groupby
# promedio_edad = df.groupby('ciudad')['edad'].mean()
```

#### Matplotlib - Visualización de datos
```python
import matplotlib.pyplot as plt

# Gráfico de líneas
x = [1, 2, 3, 4, 5]
y = [2, 4, 6, 8, 10]

plt.figure(figsize=(10, 6))
plt.plot(x, y, marker='o', linestyle='-', color='blue')
plt.title('Gráfico de Ejemplo')
plt.xlabel('Eje X')
plt.ylabel('Eje Y')
plt.grid(True)
plt.savefig('grafico.png')
# plt.show()
```

### 2. Desarrollo Web

#### Flask - Framework web minimalista
```python
from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/')
def inicio():
    return '¡Hola, Mundo!'

@app.route('/api/datos')
def obtener_datos():
    return jsonify({'mensaje': 'Datos de la API', 'codigo': 200})

# if __name__ == '__main__':
#     app.run(debug=True)
```

#### Streamlit - Aplicaciones web para datos y ML
```python
import streamlit as st
import pandas as pd
import numpy as np

# Título de la aplicación
st.title('Mi Primera App con Streamlit')

# Texto y markdown
st.write('Streamlit hace que crear apps web sea muy fácil')
st.markdown('### Subtítulo con Markdown')

# Widgets interactivos
nombre = st.text_input('¿Cuál es tu nombre?')
if nombre:
    st.write(f'¡Hola, {nombre}!')

edad = st.slider('Selecciona tu edad', 0, 100, 25)
st.write(f'Tienes {edad} años')

# Mostrar datos
df = pd.DataFrame({
    'columna1': [1, 2, 3, 4],
    'columna2': [10, 20, 30, 40]
})
st.dataframe(df)

# Gráficos
chart_data = pd.DataFrame(
    np.random.randn(20, 3),
    columns=['a', 'b', 'c']
)
st.line_chart(chart_data)

# Botones
if st.button('Haz clic aquí'):
    st.balloons()
    st.success('¡Botón presionado!')

# Sidebar
st.sidebar.header('Opciones')
opcion = st.sidebar.selectbox(
    '¿Qué quieres ver?',
    ['Opción 1', 'Opción 2', 'Opción 3']
)

# Columnas
col1, col2 = st.columns(2)
with col1:
    st.header('Columna 1')
    st.write('Contenido izquierdo')
with col2:
    st.header('Columna 2')
    st.write('Contenido derecho')

# Ejecutar: streamlit run app.py
```

**Características clave de Streamlit:**
- Crea dashboards interactivos sin HTML/CSS/JavaScript
- Recarga automática al guardar cambios
- Widgets interactivos integrados
- Integración perfecta con Pandas, Matplotlib, Plotly
- Ideal para prototipos rápidos de ciencia de datos
- Deployment fácil en Streamlit Cloud

#### Requests - Cliente HTTP simple
```python
import requests

# GET request
response = requests.get('https://api.github.com/users/python')
datos = response.json()
print(f"Usuario: {datos['login']}")

# POST request
payload = {'clave': 'valor'}
response = requests.post('https://httpbin.org/post', json=payload)

# Manejo de errores
try:
    response = requests.get('https://api.ejemplo.com/datos', timeout=5)
    response.raise_for_status()
except requests.exceptions.RequestException as e:
    print(f"Error: {e}")
```

### 3. Automatización y Web Scraping

#### Beautiful Soup - Parseo de HTML
```python
from bs4 import BeautifulSoup
import requests

# Obtener página web
url = 'https://ejemplo.com'
response = requests.get(url)
soup = BeautifulSoup(response.content, 'html.parser')

# Encontrar elementos
titulo = soup.find('h1')
print(f"Título: {titulo.text}")

# Encontrar todos los enlaces
enlaces = soup.find_all('a')
for enlace in enlaces[:5]:  # Primeros 5
    print(f"Enlace: {enlace.get('href')}")
```

#### Selenium - Automatización de navegadores
```python
from selenium import webdriver
from selenium.webdriver.common.by import By

# Configurar driver
driver = webdriver.Chrome()

# Navegar a página
driver.get('https://www.python.org')

# Encontrar elemento
elemento = driver.find_element(By.ID, 'elemento_id')
elemento.click()

# Cerrar navegador
driver.quit()
```

### 4. Machine Learning e IA

#### Scikit-learn - Aprendizaje automático
```python
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error
import numpy as np

# Datos de ejemplo
X = np.array([[1], [2], [3], [4], [5]])
y = np.array([2, 4, 6, 8, 10])

# Dividir datos
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)

# Entrenar modelo
modelo = LinearRegression()
modelo.fit(X_train, y_train)

# Predecir
predicciones = modelo.predict(X_test)
error = mean_squared_error(y_test, predicciones)
print(f"Error: {error}")
```

### 5. Manejo de Archivos y Datos

#### openpyxl - Archivos Excel
```python
from openpyxl import Workbook, load_workbook

# Crear libro nuevo
wb = Workbook()
ws = wb.active
ws.title = "Datos"

# Escribir datos
ws['A1'] = 'Nombre'
ws['B1'] = 'Edad'
ws.append(['Ana', 25])
ws.append(['Luis', 30])

# Guardar
wb.save('datos.xlsx')

# Leer archivo existente
wb = load_workbook('datos.xlsx')
ws = wb['Datos']
valor = ws['A1'].value
```

#### Pillow - Procesamiento de imágenes
```python
from PIL import Image, ImageFilter

# Abrir imagen
imagen = Image.open('foto.jpg')

# Redimensionar
imagen_pequena = imagen.resize((800, 600))

# Aplicar filtro
imagen_blur = imagen.filter(ImageFilter.BLUR)

# Rotar
imagen_rotada = imagen.rotate(90)

# Guardar
imagen_pequena.save('foto_pequeña.jpg')
```

### 6. Testing y Calidad de Código

#### pytest - Framework de testing
```python
# archivo: test_calculadora.py
import pytest

def sumar(a, b):
    return a + b

def test_sumar_positivos():
    assert sumar(2, 3) == 5

def test_sumar_negativos():
    assert sumar(-1, -1) == -2

def test_sumar_cero():
    assert sumar(5, 0) == 5

# Ejecutar: pytest test_calculadora.py
```

### 7. Utilidades Generales

#### python-dotenv - Variables de entorno
```python
from dotenv import load_dotenv
import os

# Cargar archivo .env
load_dotenv()

# Obtener variables
api_key = os.getenv('API_KEY')
database_url = os.getenv('DATABASE_URL')
```

#### tqdm - Barras de progreso
```python
from tqdm import tqdm
import time

# Barra de progreso simple
for i in tqdm(range(100)):
    time.sleep(0.01)  # Simular trabajo

# Con descripción
for i in tqdm(range(50), desc="Procesando"):
    time.sleep(0.02)
```

---

## Entornos Virtuales {#entornos-virtuales}

Los entornos virtuales permiten aislar las dependencias de cada proyecto, evitando conflictos entre versiones de librerías.

### Crear y usar entornos virtuales

```bash
# Crear entorno virtual
python -m venv mi_entorno

# Activar (Linux/Mac)
source mi_entorno/bin/activate

# Activar (Windows)
mi_entorno\Scripts\activate

# Desactivar
deactivate

# Ver librerías instaladas
pip list

# Exportar dependencias
pip freeze > requirements.txt
```

### Buenas prácticas

1. **Un entorno por proyecto**: Cada proyecto debe tener su propio entorno virtual
2. **requirements.txt**: Mantener actualizado el archivo de dependencias
3. **Gitignore**: Excluir carpetas de entornos virtuales del control de versiones
4. **Documentar versiones**: Especificar versiones compatibles de librerías críticas

---

## Recursos Adicionales

### Documentación oficial
- Python Docs: https://docs.python.org/
- PyPI: https://pypi.org/

### Tutoriales y cursos
- Real Python
- Python.org/about/gettingstarted
- Documentación de cada librería

### Comunidad
- Stack Overflow
- Reddit: r/learnpython
- Python Discord

---

## Conclusión

El ecosistema de Python es vasto y continúa creciendo. Esta guía cubre las librerías más fundamentales, pero existen miles más especializadas para prácticamente cualquier tarea que necesites realizar.

**Consejos finales:**
- Comienza con librerías populares y bien mantenidas
- Lee la documentación oficial
- Practica con ejemplos pequeños antes de proyectos grandes
- Mantén tus dependencias actualizadas
- Usa entornos virtuales siempre

¡Feliz programación con Python! 🐍