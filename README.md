# RESTfulWS
Final project in Advanced Computing using Java

# Acerca de
Evidencia final de Computacion Avanzada en Java Avanzada en donde se crearon cuatro recursos REST utilizando Spring Framework. Estos recursos van a ser utilizados para modificar y mostar
informacion recuperada de los datos que se encuentran inicializados dentro del Servicio.

#Proyecto
Este proyecto se realizo teniendo en mente el uso la implementacion de una RESTful API,
de manera que nosotros podamos hacer uso de los metodos, GET, POST, OPTIONS y DELETE, mas que nada es solo una version de un Sistema CRUD sin el update de la informacion. 
Dentro de las clases que cree, se hizo utilizando como base el ejercicio 12 de blackboard.

De entre las clases que se agregaron son las siguiente:
** FileForm: ** Este se utiliza para poder obtener la informacion de un archivo cualquiera o agregar uno.
** NotificationForm: ** Para obtener las notificacion de envio a correos electronicos o la generacion uno
** File: ** Para obtener los recursos necesarios de cada uno de los documentos y mostrarlos en un json o xml
** FileLinkListResource: ** Listar cada uno de los archivos guardados
** Notification: ** Para obtener los recursos necesarios de cada uno de los correos y mensajes enviados y mostrarlos en un json o xml
** NotificacionLinkListResource: ** Listar cada uno de los correo enviados
** OptionsDoc: ** Para obtener y manejar los metodos del Servicio REST
** DirectoryRest: ** Agregar los links de los directorios en este caso de los archivos que se mandaron guardar o de los que se encunetran en nustra pc para poder descargarlos
** IndexRest: ** Para establecer cuales son los links de cada uno de los servicios (user, directory, file y notify)
** NotificationRest: ** Agregar los links de notificaciones
** FileRest: ** Agregar los links de los archivos guardados
** FileService: ** Instancia los metodos de los servicios
** FileServiceImpl: ** Realiza acciones que aclaran los procedimientos que realizamos dentro de los archivos (Aclara si se subio correctamente, o si hay algun problema en si al momento de hacer una requisicion POST o GET)
** NotificationService: ** Instancia los metodos de los servicios
** NotificationServiceImpl: ** Realiza acciones que aclaran los procedimientos que realizamos dentro de las notificaciones (Aclara si se subio correctamente, o si hay algun problema en si al momento de hacer una requisicion POST o GET).

# Instalacion
** Clonar el repositorio **
> git clone https://github.com/alexrsolutions/RESTfulWS.git

Una vez habiendo descargado el repositorio
1. Abrir eclipse
2. En la pestaña file ir a Importar
3. Se va a seleccionar exportar como proyecto de Maven
4. Actualizar las dependencias
5. Correr en el servidor

** Nota: ** si se corre en eclipse, los archivos que se van a descargar
en archivos tipo json en vez de mostrarse en xml.

Para poder ver los archivos desde el buscador es recomendable tener el 
Tomcat Monitor instalado y accesar al manager. Ejemplo: localhost:8090/manager
para poder realizar deploy del war (este se encuentra agregado en la pestaña de release)

Despues de hacer deploy en la tabla principal va a salir una nueva direccion que se genero
al hacer el deploy, hacer click y va redireccionar

** Para exportar el proyecto en war desde eclipse **
Es necesario hacer click derecho a la carpeta donde esta el proyecto en eclipse
ir a la opcion exportar y escoger la opcion war. De ahi es solo seguir los pasos de 
escoger la direccion donde se va a guardar el archivo y el nombre.

# Uso
Si el proyecto se desplego correctamente, lo primero que deberia salir es:
![alt text](https://firebasestorage.googleapis.com/v0/b/computacion-en-java.appspot.com/o/Computacion%20en%20Java%2Flogin.jpg?alt=media&token=d63b1bce-4b99-4545-8d6f-f922bc96552b)

En la URL es donde se van a generar la mayoria de las requisiciones de nuestro servicio:


# Créditos
Salvador Alexandro Ramírez Martínez
Matrícula: 2823053
# Licencia
Estudiante, Tecmilenio Campus las Torres