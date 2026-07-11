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
**Tag oficial del QA:** `@LuisQA`  
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

---

## 🧱 Arquitectura del Framework  
DemoWebShop-SeleniumCucumberJava
│
├── src
│   ├── main/java
│   │   ├── pages/               # Page Objects
│   │   ├── utils/               # Helpers, waits, config
│   │   └── drivers/             # WebDriver setup
│   │
│   └── test/java
│       ├── features/            # Archivos .feature (Gherkin)
│       ├── steps/               # Step Definitions
│       ├── runners/             # Test Runners
│       ├── modules/             # Nuevos módulos
│       ├── regression/          # Suite de regresión
│       └── smoke/               # Suite de smoke
│
├── pom.xml                      # Dependencias Maven
└── README.md


---

## 🧪 Tecnologías Utilizadas  
- **Java 17**  
- **Selenium WebDriver**  
- **Cucumber (BDD)**  
- **JUnit / TestNG**  
- **Maven**  
- **Page Object Model (POM)**  
- **GitHub Actions (CI/CD)**  

---

## 🚀 Ejecución del Proyecto

### Ejecutar regresión:
```bash
mvn test -Dcucumber.filter.tags="@regression"
