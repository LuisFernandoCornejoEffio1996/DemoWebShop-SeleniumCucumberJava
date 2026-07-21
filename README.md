# DemoWebShop-SeleniumCucumberJava  
Framework de Automatización de Pruebas E2E para Demo Web Shop (Tricentis)  
Tecnologías: **Selenium + Cucumber + Java**

---

## 👤 QA Responsable  
**Luis Fernando Cornejo Effio**  
QA Functional & Automation Engineer  
🇵🇪 Chiclayo, Perú  
🔧 Especialista en pruebas funcionales, automatización web y herramientas asistidas por IA.

---

## 🏷 Identificador del Proyecto  
**Tag QA:** `@LuisQA`  
Este tag se utiliza en reportes, commits y documentación para identificar los módulos desarrollados por el QA.

---

## 📌 Descripción del Proyecto  
Este repositorio contiene un framework profesional de automatización E2E para la aplicación **Demo Web Shop (Tricentis)**.  
El objetivo es validar funcionalidades críticas del e‑commerce mediante pruebas automatizadas modulares, escalables y mantenibles.

El framework está diseñado para:
- Ejecutar **regresión completa**  
- Integrar **nuevos módulos** sin afectar la estabilidad  
- Mantener una arquitectura limpia basada en **Page Object Model (POM)**  
- Facilitar la ejecución por **tags** (smoke, regression, módulos)

### ✅ Condición para etiquetar `@regresion`
Se etiqueta con `@regresion` únicamente a escenarios que:
1. Ya pasan correctamente.
2. Se mantienen estables en ejecuciones repetidas.

---

## 🧱 Arquitectura del Framework  
DemoWebShop-SeleniumCucumberJava
│
├── src
│   ├── main/java
│   │   ├── interactions/       # Acciones comunes (click, type, wait)
│   │   ├── pages/               # Objetos de página (POM)
│   │   ├── questions/           # Preguntas (validaciones, assertions)
│   │   └── tasks/             # Tareas (acciones compuestas)
│   │
│   └── test/java
│       ├── stepDefinition/       # Definiciones de pasos (Cucumber)
│       ├── RunnersTest.java      # Clase de ejecución (Cucumber Runner)
│   │
│   └── test/resources
│       ├── features/            # Archivos .feature (Cucumber)
│       ├── serenity.conf   # Configuración de Serenity BDD
├── pom.xml                      # Dependencias Maven
└── README.md

---

## 🧪 Tecnologías Utilizadas  
- **Java 17**  
- **Selenium WebDriver**  
- **Cucumber**  
- **JUnit**  
- **Maven**  
- **Serenity BDD**  
- **GitHub Actions (CI/CD)**  

---
## 🔧 Configuración
La configuración principal vive en:
src/test/resources/serenity.conf
Ejemplo clave:
- **home.url = "https://demowebshop.tricentis.com/"**
- **timeouts y capacidades del navegador (Chrome/Edge/Firefox)**

---
## 🚀 Ejecución del Proyecto

### Ejecutar regresión:
## ▶️ Ejecución de pruebas

> Nota: para que se genere `target/site/serenity/index.html` debes ejecutar hasta fase `verify` o llamar `serenity:aggregate`.

### 1) Ejecutar todo el proyecto + generar reporte
```bash
mvn clean verify
```

### 2) Ejecutar por etiquetas + generar reporte

```bash
mvn clean verify -Dcucumber.filter.tags="@smoke"
mvn clean verify -Dcucumber.filter.tags="@login"
mvn clean verify -Dcucumber.filter.tags="@regression"
```

### 3) Ejecutar combinación de etiquetas + generar reporte
```bash
mvn clean verify -Dcucumber.filter.tags="@smoke and @navigation"
mvn clean verify -Dcucumber.filter.tags="@login and @regression"
```
### 4) Si ya ejecutaste mvn test y solo quieres generar el reporte
```bash
mvn serenity:aggregate
```

---

## 📊 Reportes
Al finalizar la ejecución, Serenity genera reportes en:
> target/site/serenity

Abre **index.html** para ver resultados, evidencia y trazabilidad de pasos. 
