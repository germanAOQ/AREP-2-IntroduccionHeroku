# Introducción Heroku                 
Haciendo uso Java, Maven y Git, Spark y Heroku se escribió un programa para cacular la media y la desviación estándar de una serie de números reales desde una página web. Esta serie de numeros se almacena con la ayuda de una linked list, hecha a partir de una implementación personal.
## Comenzando
Para obtener una copia del proyecto en nuestra máquina local y podamos realizar tareas de desarrollo, pruebas o ejecuciones debemos clonarlo utilizando el siguiente comando:
```
https://github.com/germanAOQ/AREP-2-IntroduccionHeroku.git
```
### Pre-requisitos
Para hacer uso del software es necesario tener instalado:
* Maven: Automatiza y estandariza el flujo de vida de la construcción de software.                 
    Siga las instrucciones en http://maven.apache.org/download.cgi#Installation
* Git: Administrador descentralizado de configuraciones.                     
    Siga las instrucciones en http://git-scm.com/book/en/v2/Getting-Started-Installing-Git
* Toolbelt de Heroku: Paquete de la CLI de Heroku
    Siga las instrucciones en https://devcenter.heroku.com/articles/heroku-cli
### Instalación
Una vez clonado el proyecto, en la carpeta donde hayamos hecho el procedimiento, abrimos la shell del sistema operativo en la que estemos y accedemos al directorio de este
```
AREP-2-IntroduccionHeroku
```
Ejecutamos la fase **package**, la cual ejecutara las fases previas del ciclo de vida: **validate, compile y test** y empaquetará el código ya compilado en un formato que se le haya especificado en el archivo de configuración, POM.xml
```
mvn package
```
Como se dijo previamente, este comando también compilara el código, lo empaquetará en el formato especificado y, adicionalmente, dejará estos archivos en la carpeta **target**. Esto se hace necesario saberlo para ejecutar el aplicativo. Para hacer la ejecución de la aplicación se debe ejecutar el siguiente comando. Cabe resaltar que este comando se ejecuta en un sistema operativo Windows y haciendo uso de PowerShell.
```
java $JAVA_OPTS -cp "target/classes;target/dependency/*" edu.escuelaing.arep.sparkweb.SparkWebApp
```
Una vez hecha la ejecución, se podrá acceder a la aplicación localmente através de la siguiente dirección:
```
http://localhost:4567/
```
Otra forma de ejecutar la aplicación localmente:
```
heroku local web
```
Se accede con la siguiente dirección:
```
http://localhost:5000/
```
## Ejecutando las pruebas
Para ejecutar las pruebas, un total de 4, se debe hacer uso de la fase test
```
mvn test
```
### Pruebas unitarias
Como se dijo anteriormente, se hicieron cuatro pruebas teniendo en cuenta los siguientes datos:

| Column 1 | Column 2 |
| ---------- | ---------- |
| 160   | 15.0   |
| 591   | 69.9   |
| 114   | 6.5   |
| 229   | 22.4   |
| 230   | 28.4   |
| 270   | 65.9   |
| 128   | 19.4   |
| 1657  | 198.7   |
| 624   | 38.8   |
| 1503  | 138.2   |

Los resultados obtenidos fueron los siguientes:

| Test | Columna |Descripción |Expected Value | Actual Value |
| ---------- | ---------- | ---------- | ---------- | ---------- |
|Prueba 1| Columna 1 | Cálculo de la media de los datos presentes | 550.6| 550.6|
|Prueba 2| Columna 1 | Cálculo de la desviación estándar de los datos presentes | 572.03| 572.03|
|Prueba 3| Columna 2 | Cálculo de la media de los datos presentes | 60.32| 60.32|
|Prueba 4| Columna 2 | Cálculo de la desviación estándar de los datos presentes | 62.26| 62.26|

## Documentación

### Generar documentación
Para generar la documentación se debe agregar al código del archivo de configuración de Maven, POM.xml, el siguiente plugin:
```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-javadoc-plugin</artifactId>
	<executions>
		<execution>
			<id>attach-javadocs</id>
			<goals>
				<goal>jar</goal>
			</goals>
		</execution>
	</executions>
</plugin>

```
Uno vez agregado el plugin anterior, se ejecuta el siguiente comando para generar el javadoc
```
mvn install
```
Finalmente, en la carpeta target quedará creado un archivo con el nombre **apidocs**, lugar en donde se encontrará la documentación.

## Construido con 
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://github.com/) - Control de versionamiento
* [Heroku](https://heroku.com) - Plataforma de despliegue [![Deploy](https://www.herokucdn.com/deploy/button.png)](https://sparkwebapp.herokuapp.com/)
* [Circle CI]() - Integración Continua [![CircleCI](https://circleci.com/gh/germanAOQ/AREP-2-IntroduccionHeroku.svg?style=svg)](https://circleci.com/gh/circleci/circleci-docs)

## Autores 
* [Germán Andrés Ospina Quintero](https://github.com/germanAOQ)

## Licencia 📄
Este proyecto esta licenciado por GNU General Public License v3.0
