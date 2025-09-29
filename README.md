# ActiveZoneFit 💪

Una aplicación Android moderna para fitness y entrenamiento personal desarrollada con **Jetpack Compose** y **Material Design 3**.

## 📱 Descripción

ActiveZoneFit es tu entrenador personal digital que te ayuda a alcanzar tus objetivos de fitness. La aplicación ofrece una interfaz intuitiva con navegación lateral y múltiples secciones para gestionar tu progreso físico, rutinas de entrenamiento y recursos adicionales.

## ✨ Características Principales

### 🏠 **Navegación Principal**
- **Sidebar con gradiente** verde-azul
- **5 secciones principales** con acceso rápido
- **Indicador visual** de la sección activa
- **Diseño responsive** adaptado a diferentes pantallas

### 👤 **Perfil de Usuario**
- **Información personal** (nombre, edad, nivel de fitness)
- **Estadísticas físicas** en tiempo real:
  - Peso actual: 75kg
  - Estatura: 1.75m
  - Meta de peso: 70kg
  - Grasa corporal: 15%
  - Objetivos fitness: 45
  - Sesiones activas: 12
- **Tarjetas interactivas** con barras de progreso
- **Avatar personalizado** con iniciales

### 📸 **Galería de Fotos**
- **Progreso visual** del entrenamiento
- **Grid de imágenes** organizadas
- **Interfaz limpia** para seguimiento fotográfico

### 🎥 **Videos de Entrenamiento**
- **Rutinas personalizadas** por nivel
- **Ejercicios guiados** paso a paso
- **Biblioteca de entrenamientos**:
  - Cardio Intenso (30min)
  - Fuerza y Resistencia
  - Yoga Relajante
  - HIIT Completo
  - Flexibilidad y Movilidad

### 🌐 **Recursos Web**
- **Enlaces útiles** para fitness
- **Calculadora de IMC**
- **Blog de nutrición** con consejos
- **Tienda de suplementos**
- **Comunidad fitness** para conectar con otros atletas

### 🔘 **Acciones Rápidas**
- **Botones de funciones principales**:
  - Iniciar Entrenamiento
  - Registrar Comida
  - Ver Progreso
  - Configuraciones
  - Contactar Entrenador
  - Compartir Logros

## 🛠️ Tecnologías Utilizadas

### **Frontend**
- **Kotlin** (2.0.21)
- **Jetpack Compose** (BOM 2024.09.00)
- **Material Design 3**
- **Activity Compose** (1.8.0)

### **Desarrollo**
- **Android Gradle Plugin** (8.10.1)
- **Gradle** (8.11.1)
- **Android SDK**:
  - **Min SDK**: 21 (Android 5.0+)
  - **Target SDK**: 35 (Android 14)
  - **Compile SDK**: 35

### **Arquitectura**
- **MVVM** (Model-View-ViewModel)
- **Composable Functions** para UI
- **State Management** con Compose
- **Material Theming System**

## 🎨 Diseño y UI/UX

### **Paleta de Colores**
- **Primario**: Verde (#4CAF50) - Verde40 (#2E7D32)
- **Gradientes**: Verde a Azul (#4CAF50 → #2196F3)
- **Acentos**: Naranja (#FF9800)
- **Neutros**: Grises y blancos para contraste

### **Tipografía**
- **Sistema**: Material Design 3 Typography
- **Pesos**: Regular, Medium, Bold
- **Tamaños**: 12sp - 24sp según jerarquía

### **Componentes**
- **Cards** con esquinas redondeadas (12-16dp)
- **Botones** con estados activos/inactivos
- **Navegación** con indicadores visuales
- **Gradientes** para elementos destacados

## 📁 Estructura del Proyecto

```
app/
├── src/main/java/com/example/activezonefit/
│   ├── MainActivity.kt                    # Actividad principal
│   ├── data/
│   │   └── UserProfile.kt                # Modelos de datos
│   ├── ui/
│   │   ├── components/
│   │   │   └── Sidebar.kt                # Componente de navegación
│   │   ├── screens/
│   │   │   ├── ProfileScreen.kt          # Pantalla de perfil
│   │   │   └── OtherScreens.kt          # Demás pantallas
│   │   └── theme/
│   │       ├── Color.kt                  # Colores de la app
│   │       ├── Theme.kt                  # Tema principal
│   │       └── Type.kt                   # Tipografía
│   └── res/
│       ├── values/
│       ├── drawable/
│       └── mipmap/
├── build.gradle.kts                      # Configuración del módulo
└── proguard-rules.pro                    # Reglas de ofuscación
```

## 🚀 Instalación y Configuración

### **Prerrequisitos**
- **Android Studio** Iguana o superior
- **JDK 11** o superior
- **Android SDK** API 35
- **Emulador Android** o dispositivo físico

### **Pasos de Instalación**

1. **Clonar el repositorio**
   ```bash
   git clone [URL-del-repositorio]
   cd ActiveZoneFit
   ```

2. **Abrir en Android Studio**
   - Abrir Android Studio
   - File → Open
   - Seleccionar la carpeta del proyecto

3. **Sincronizar dependencias**
   ```bash
   ./gradlew sync
   ```

4. **Compilar el proyecto**
   ```bash
   ./gradlew assembleDebug
   ```

5. **Instalar en dispositivo**
   ```bash
   ./gradlew installDebug
   ```

### **Comandos útiles**

```bash
# Limpiar proyecto
./gradlew clean

# Compilar release
./gradlew assembleRelease

# Ejecutar tests
./gradlew test

# Generar APK
./gradlew build
```

## 📊 Características Técnicas

### **Rendimiento**
- **Compose** para renderizado eficiente
- **Lazy Loading** en listas y grids
- **State Hoisting** para gestión de estado
- **Recomposición inteligente**

### **Accesibilidad**
- **Content Descriptions** para lectores de pantalla
- **Contraste** adecuado en colores
- **Tamaños de toque** según guidelines
- **Navegación por teclado** compatible

### **Compatibilidad**
- **Android 5.0+** (API 21+)
- **Orientación**: Portrait y Landscape
- **Densidades**: mdpi a xxxhdpi
- **Idiomas**: Español (extensible)

## 🧪 Testing

### **Tests Incluidos**
- **Unit Tests**: ExampleUnitTest.kt
- **Instrumented Tests**: ExampleInstrumentedTest.kt
- **UI Tests**: Compose Test Rules

### **Ejecutar Tests**
```bash
# Tests unitarios
./gradlew test

# Tests instrumentados
./gradlew connectedAndroidTest
```

## 🔮 Próximas Características

- [ ] **Integración con APIs** de fitness
- [ ] **Base de datos local** con Room
- [ ] **Notificaciones push** para recordatorios
- [ ] **Sincronización en la nube**
- [ ] **Modo oscuro** personalizable
- [ ] **Widgets** para pantalla de inicio
- [ ] **Wear OS** companion app
- [ ] **Soporte multiidioma**

## 👥 Contribución

¡Las contribuciones son bienvenidas! Por favor:

1. **Fork** el proyecto
2. **Crear** una branch para tu feature
3. **Commit** tus cambios
4. **Push** a la branch
5. **Abrir** un Pull Request

### **Convenciones de Código**
- **Kotlin Coding Conventions**
- **Material Design Guidelines**
- **Compose Best Practices**
- **MVVM Architecture Pattern**

## 📄 Licencia

Este proyecto está bajo la **Licencia MIT** - ver el archivo [LICENSE.md](LICENSE.md) para detalles.

## 📞 Contacto y Soporte

- **Desarrollador**: [Tu Nombre]
- **Email**: [tu-email@ejemplo.com]
- **GitHub**: [tu-usuario-github]
- **LinkedIn**: [tu-perfil-linkedin]

## 📋 Changelog

### Versión 1.0.0 (2025-09-29)
- ✅ **Lanzamiento inicial**
- ✅ **Interfaz principal** con navegación
- ✅ **Pantalla de perfil** con estadísticas
- ✅ **5 secciones** funcionales
- ✅ **Diseño Material 3**
- ✅ **Tema personalizable**

---

**ActiveZoneFit** - Tu compañero digital para un estilo de vida saludable 🏃‍♂️✨

*Desarrollado con ❤️ usando Jetpack Compose y Material Design 3*