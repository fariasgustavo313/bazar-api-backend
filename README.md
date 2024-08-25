# Bazar API - Backend

## Descripción

Este proyecto es un backend para la gestión de un bazar, diseñado para manejar productos, clientes y ventas. Proporciona una API que puede ser consumida por aplicaciones web y móviles.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **JPA + Hibernate**
- **Maven**

## Endpoints Principales

### Productos
- **Crear**: `POST /productos/crear`
- **Listar todos**: `GET /productos`
- **Obtener por código**: `GET /productos/{codigo_producto}`
- **Editar**: `PUT /productos/editar/{codigo_producto}`
- **Eliminar**: `DELETE /productos/eliminar/{codigo_producto}`
- **Bajo stock**: `GET /productos/falta_stock`

### Clientes
- **Crear**: `POST /clientes/crear`
- **Listar todos**: `GET /clientes`
- **Obtener por ID**: `GET /clientes/{id_cliente}`
- **Editar**: `PUT /clientes/editar/{id_cliente}`
- **Eliminar**: `DELETE /clientes/eliminar/{id_cliente}`

### Ventas
- **Crear**: `POST /ventas/crear`
- **Listar todas**: `GET /ventas`
- **Obtener por código**: `GET /ventas/{codigo_venta}`
- **Editar**: `PUT /ventas/editar/{codigo_venta}`
- **Eliminar**: `DELETE /ventas/eliminar/{codigo_venta}`
- **Productos en venta**: `GET /ventas/productos/{codigo_venta}`
