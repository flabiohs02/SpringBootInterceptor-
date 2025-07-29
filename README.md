# Spring Boot Interceptor Demo

Este proyecto demuestra la implementación de interceptores en Spring Boot, una característica poderosa que permite interceptar las solicitudes HTTP antes o después de que sean procesadas por los controladores.

## Características

- Implementación de interceptor personalizado para medir el tiempo de carga
- Configuración de rutas específicas para la aplicación de interceptores
- Ejemplos de exclusión de rutas específicas

## Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       └── com/springboot/santiago/ineterceptor/springboot_interceptor/
│           ├── AppConfig.java                    # Configuración de la aplicación
│           ├── SpringbootInterceptorApplication.java  # Clase principal
│           ├── controllers/
│           │   └── FooController.java            # Controlador de ejemplo
│           └── interceptors/
│               └── LoadingTimeInterceptor.java   # Interceptor personalizado
```

## Requisitos Previos

- Java 8 o superior
- Maven 3.x
- Spring Boot

## Instalación

1. Clona el repositorio:
```bash
git clone [URL-del-repositorio]
```

2. Navega al directorio del proyecto:
```bash
cd springboot-interceptor
```

3. Ejecuta la aplicación:
```bash
./mvnw spring-boot:run
```

## Configuración

El proyecto incluye un interceptor de tiempo de carga que está configurado en `AppConfig.java`. Las rutas `/app/bar` y `/app/baz` están excluidas del interceptor.

```java
@Override
public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar", "/app/baz");
}
```

## Uso

El interceptor registrará automáticamente el tiempo de carga para todas las rutas excepto las excluidas específicamente.

## Contribuir

Si deseas contribuir al proyecto, por favor:

1. Haz un Fork del repositorio
2. Crea una rama para tu característica (`git checkout -b feature/AmazingFeature`)
3. Realiza tus cambios
4. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
5. Push a la rama (`git push origin feature/AmazingFeature`)
6. Abre un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
