# Jaimito’s Pizzery

Jaimito's Pizzery es una pizzería que busca modernizar su sistema de administración para mejorar la eficiencia y la experiencia del cliente. Se necesita desarrollar un programa de software que permita gestionar todos los aspectos del negocio, desde la gestión de pedidos hasta el seguimiento de inventario y la administración de usuarios con distintos niveles de acceso.

**El sistema debe contar con las siguientes funcionalidades:***

- **Gestión de Clientes:** Permitir registrar nuevos clientes, actualizar información y eliminar clientes inactivos.

- **Gestión de Pedidos:** Registrar nuevos pedidos de pizza, incluyendo detalles como tipo de pizza, tamaño, ingredientes adicionales, dirección de entrega y estado del pedido (pendiente, en preparación, entregado).

- **Gestión de Inventario:** Mantener un registro del inventario de ingredientes de pizza y bebidas, permitiendo agregar nuevos ingredientes y bebidas, actualizar cantidades y eliminar ingredientes o bebidas obsoletas.

- **Registro de Transacciones:** Registrar todas las transacciones realizadas en el sistema, incluyendo pedidos, cambios en el inventario y actividades de los usuarios.

- **Gestión de Usuarios y Permisos:** Permitir la creación de distintos tipos de usuarios (administradores, empleados) con diferentes niveles de acceso y permisos dentro del sistema. Los administradores podrán realizar todas las operaciones, mientras que los empleados tendrán restricciones de acceso según su rol.

- **Gestión de Reportes:** Generar reportes detallados sobre ventas, inventario, desempeño del personal y otros aspectos relevantes del negocio.



## Clases y Atributos:

`Usuario (Clase Abstracta):
Atributos: nombre.`

`Cliente (Subclase de usuario):
Atributos: Dirección, Celular.`

`Empleado (Subclase de usuario):
Atributos: Clave, Permisos.`

`Pedido:
Atributos: cliente asociado, detalles del pedido, estado del pedido.`

`Ingrediente:
Atributos: nombre, cantidad disponible.`

`Producto (Clase Abstracta):
Atributos: nombre, precio.
Métodos Abstractos: calcularPrecio().`

`Pizza (Subclase de Producto):
Atributos adicionales: tamaño, ingredientes.`

`Bebida (Subclase de Producto):
Atributos adicionales: contenido, tipo.`


