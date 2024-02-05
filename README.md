# Welcome to Account MicroService!

**H2 DB Open in browser**  [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)

**Swagger-UI**  [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

**learning** :  [https://spring.io/microservices](https://spring.io/microservices)


# Execution Steps and Generated Logs

1.  **Open CMD Or PowerShell or Terminal**    
2.  **Locate ur project directory** D:\..\.\.> cd .\accounts    
3.  **Execute '''mvn clean install'''** D:\...\accounts> mvn clean install
   
# Generated Logs

 [INFO] Scanning for projects... [INFO] [INFO] ------------------------< com.sharma:accounts >------------------------- [INFO] Building accounts 0.0.1-SNAPSHOT [INFO] from pom.xml [INFO] --------------------------------[ jar ]--------------------------------- [INFO] [INFO] --- clean:3.2.0:clean (default-clean) @ accounts --- [INFO] Deleting D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target [INFO] [INFO] --- resources:3.3.1:resources (default-resources) @ accounts --- [INFO] Copying 1 resource from src\main\resources to target\classes [INFO] Copying 1 resource from src\main\resources to target\classes [INFO] [INFO] --- compiler:3.11.0:compile (default-compile) @ accounts --- [INFO] Changes detected - recompiling the module! :source [INFO] Installing D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar to C:\Users\rajes.m2\repository\com\sharma\accounts\0.0.1-SNAPSHOT\accounts-0.0.1-SNAPSHOT.jar [INFO] ------------------------------------------------------------------------ [INFO] BUILD SUCCESS [INFO] ------------------------------------------------------------------------ [INFO] Total time: 27.855 s [INFO] Finished at: 2024-02-05T12:52:33+05:30 [INFO] ------------------------------------------------------------------------
    
4.  **Execute Docker Build**    docker build . -t sharma/accounts:s4  
D:\.\.\accounts> docker build . -t sharma/accounts:s4

# Generated Logs

[+] Building 9.0s (7/7) FINISHED docker:default => [internal] load build definition from Dockerfile 0.1s => => transferring dockerfile: 375B 0.0s => [internal] load .dockerignore 0.1s => => transferring context: 2B 0.0s => [internal] load metadata for docker.io/library/openjdk:17-jdk-slim 3.2s => [internal] load build context 4.2s => => transferring context: 54.70MB 4.2s => CACHED [1/2] FROM docker.io/library/openjdk:17-jdk-slim@sha256:aaa3b3cb27e3e520b8f116863d0580c438ed55ecfa0bc126b41f68c3f62f9774 0.0s => [2/2] COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar 0.8s => exporting to image 0.5s => => exporting layers 0.5s => => writing image sha256:1246daad2ce630cfd4b1fb7ed451aac5a7d5c88614bfa27e12905b9013378a07 0.0s => => naming to docker.io/sharma/accounts:s4 0.0s
    
6.  **Run image using docker run -p 8080:8080 sharma/accounts:s4**
 D:\.\.\.\accounts> docker run -p 8080:8080 sharma/accounts:s4


# Generated Logs **Error due to different Jdk version (In Intelliji and Docker)**

Exception in thread "main" java.lang.UnsupportedClassVersionError: com/sharma/accounts/AccountsApplication has been compiled by a more recent version of the Java Runtime (class file version 65.0), this version of the Java Runtime only recognizes class file versions up to 61.0 at java.base/java.lang.ClassLoader.defineClass1(Native Method) at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012) at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150) at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524) at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427) at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421) at java.base/java.security.AccessController.doPrivileged(AccessController.java:712) at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420) at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587) at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:149) at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) at java.base/java.lang.Class.forName0(Native Method) at java.base/java.lang.Class.forName(Class.java:467) at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:46) at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) 

6 . **After Fix Error in DockerFile: - Start from Step 3 till Step 5**
	**mvn clean install**
	**Execute Docker Build** 
	**Run image**
