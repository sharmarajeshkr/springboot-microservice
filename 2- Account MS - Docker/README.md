H2 DB
Open in browser
 http://localhost:8080/h2-console/
 
Swagger-UI
	http://localhost:8080/swagger-ui/index.html

learning :  https://spring.io/microservices

Execution Steps and Generated Logs

1. Open CMD Or PowerShell or Terminal
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

2. Locate ur project directory
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker> cd .\accounts\   
3. Execute mvn clean install
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< com.sharma:accounts >-------------------------
[INFO] Building accounts 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ accounts ---
[INFO] Deleting D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ accounts ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ accounts ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Installing D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar to C:\Users\rajes\.m2\repository\com\sharma\accounts\0.0.1-SNAPSHOT\accounts-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  27.855 s
[INFO] Finished at: 2024-02-05T12:52:33+05:30
[INFO] ------------------------------------------------------------------------

4. Execute docker build . -t sharma/accounts:s4
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> docker build . -t sharma/accounts:s4
[+] Building 9.0s (7/7) FINISHED                                                                                                                    docker:default
=> [internal] load build definition from Dockerfile                                                                                                          0.1s
=> => transferring dockerfile: 375B                                                                                                                          0.0s
=> [internal] load .dockerignore                                                                                                                             0.1s
=> => transferring context: 2B                                                                                                                               0.0s
=> [internal] load metadata for docker.io/library/openjdk:17-jdk-slim                                                                                        3.2s
=> [internal] load build context                                                                                                                             4.2s
=> => transferring context: 54.70MB                                                                                                                          4.2s
=> CACHED [1/2] FROM docker.io/library/openjdk:17-jdk-slim@sha256:aaa3b3cb27e3e520b8f116863d0580c438ed55ecfa0bc126b41f68c3f62f9774                           0.0s
=> [2/2] COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar                                                                                 0.8s
=> exporting to image                                                                                                                                        0.5s
=> => exporting layers                                                                                                                                       0.5s
=> => writing image sha256:1246daad2ce630cfd4b1fb7ed451aac5a7d5c88614bfa27e12905b9013378a07                                                                  0.0s
=> => naming to docker.io/sharma/accounts:s4                                                                                                                0.0s

5. Run image using docker run -p 8080:8080 sharma/accounts:s4
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> docker run -p 8080:8080 sharma/accounts:s4
Exception in thread "main" java.lang.UnsupportedClassVersionError: com/sharma/accounts/AccountsApplication has been compiled by a more recent version of the Java Runtime (class file version 65.0), this version of the Java Runtime only recognizes class file versions up to 61.0
at java.base/java.lang.ClassLoader.defineClass1(Native Method)
at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:149)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
at java.base/java.lang.Class.forName0(Native Method)
at java.base/java.lang.Class.forName(Class.java:467)
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:46)
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95)
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< com.sharma:accounts >-------------------------
[INFO] Building accounts 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ accounts ---
[INFO] Deleting D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ accounts ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ accounts ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 20 source files with javac [debug release 21] to target\classes
[INFO] Annotation processing is enabled because one or more processors were found
on the class path. A future release of javac may disable annotation processing
unless at least one processor is specified by name (-processor), or a search
path is specified (--processor-path, --processor-module-path), or annotation
processing is enabled explicitly (-proc:only, -proc:full).
Use -Xlint:-options to suppress this message.
Use -proc:none to disable annotation processing.
[INFO] /D:/test-Microservices-git/springboot-microservice/2- Account MS - Docker/accounts/src/main/java/com/sharma/accounts/entity/Customer.java: D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\src\main\java\com\sharma\accounts\entity\Customer.java uses or overrides a deprecated API.        
[INFO] /D:/test-Microservices-git/springboot-microservice/2- Account MS - Docker/accounts/src/main/java/com/sharma/accounts/entity/Customer.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ accounts ---
[INFO] skip non existing resourceDirectory D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\src\test\resources
[INFO]
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ accounts ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] Compiling 1 source file with javac [debug release 21] to target\test-classes
[INFO] Annotation processing is enabled because one or more processors were found
on the class path. A future release of javac may disable annotation processing
unless at least one processor is specified by name (-processor), or a search
path is specified (--processor-path, --processor-module-path), or annotation
processing is enabled explicitly (-proc:only, -proc:full).
Use -Xlint:-options to suppress this message.
Use -proc:none to disable annotation processing.
[INFO]
[INFO] --- surefire:3.0.0:test (default-test) @ accounts ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.sharma.accounts.AccountsApplicationTests
13:05:04.430 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test cla
ss [com.sharma.accounts.AccountsApplicationTests]: AccountsApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
13:05:04.730 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.sharma.accounts.AccountsApplication for test class com.sharma.accounts.AccountsApplicationTests

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v3.1.3)

2024-02-05T13:05:05.665+05:30  INFO 3544 --- [           main] c.s.accounts.AccountsApplicationTests    : Starting AccountsApplicationTests using Java 21.0.1 with PID 3544 (started by rajes in D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts)
2024-02-05T13:05:05.668+05:30  INFO 3544 --- [           main] c.s.accounts.AccountsApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2024-02-05T13:05:08.106+05:30  INFO 3544 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-02-05T13:05:08.228+05:30  INFO 3544 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 105 ms. Found 2 JPA repository interfaces.
2024-02-05T13:05:09.084+05:30  INFO 3544 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-02-05T13:05:10.146+05:30  INFO 3544 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@537ca28e
2024-02-05T13:05:10.150+05:30  INFO 3544 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-02-05T13:05:10.434+05:30  INFO 3544 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-02-05T13:05:10.694+05:30  INFO 3544 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.7.Final
2024-02-05T13:05:10.707+05:30  INFO 3544 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2024-02-05T13:05:11.122+05:30  INFO 3544 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-02-05T13:05:11.387+05:30  INFO 3544 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-02-05T13:05:11.943+05:30  INFO 3544 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-02-05T13:05:13.164+05:30  INFO 3544 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: alter table accounts modify column created_at  datetime(6)
Hibernate: alter table accounts modify column updated_at  datetime(6)
Hibernate: alter table customer modify column created_at  datetime(6)
Hibernate: alter table customer modify column updated_at  datetime(6)
2024-02-05T13:05:13.462+05:30  INFO 3544 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-02-05T13:05:14.874+05:30  WARN 3544 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-02-05T13:05:16.223+05:30  INFO 3544 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2024-02-05T13:05:16.492+05:30  INFO 3544 --- [           main] c.s.accounts.AccountsApplicationTests    : Started AccountsApplicationTests in 11.461 seconds (process running for 13.757)
WARNING: A Java agent has been loaded dynamically (C:\Users\rajes\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.6\byte-buddy-agent-1.14.6.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.649 s - in com.sharma.accounts.AccountsApplicationTests
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ accounts ---
[INFO] Building jar: D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.1.3:repackage (repackage) @ accounts ---
[INFO] Replacing main artifact D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] --- install:3.1.1:install (default-install) @ accounts ---
[INFO] Installing D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\pom.xml to C:\Users\rajes\.m2\repository\com\sharma\accounts\0.0.1-SNAPSHOT\accounts-0.0.1-SNAPSHOT.pom
[INFO] Installing D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts\target\accounts-0.0.1-SNAPSHOT.jar to C:\Users\rajes\.m2\repository\com\sharma\accounts\0.0.1-SNAPSHOT\accounts-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  30.247 s
[INFO] Finished at: 2024-02-05T13:05:20+05:30
[INFO] ------------------------------------------------------------------------
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> docker build . -t sharma/accounts:s4      
[+] Building 51.0s (7/7) FINISHED                                                                                                                   docker:default
=> [internal] load build definition from Dockerfile                                                                                                          0.1s
=> => transferring dockerfile: 396B                                                                                                                          0.0s
=> [internal] load .dockerignore                                                                                                                             0.1s
=> => transferring context: 2B                                                                                                                               0.0s
=> [internal] load metadata for docker.io/library/openjdk:21-jdk                                                                                             3.5s
=> [1/2] FROM docker.io/library/openjdk:21-jdk@sha256:af9de795d1f8d3b6172f6c55ca9ba1c5768baa11bb2dc8af7045c7db9d4c33ac                                      43.4s
=> => resolve docker.io/library/openjdk:21-jdk@sha256:af9de795d1f8d3b6172f6c55ca9ba1c5768baa11bb2dc8af7045c7db9d4c33ac                                       0.1s
=> => sha256:af9de795d1f8d3b6172f6c55ca9ba1c5768baa11bb2dc8af7045c7db9d4c33ac 1.04kB / 1.04kB                                                                0.0s
=> => sha256:c67f402f77197f2e6ae84ff1fca868699ce3b38bfa78604524051420fa2e4383 954B / 954B                                                                    0.0s
=> => sha256:079114de2be199f2ae0f7766ac0187d24a0c3a2d658fc51bffc6af5b8bd85469 4.42kB / 4.42kB                                                                0.0s
=> => sha256:5262579e8e45cb87fdc8fb6182d30da3c9e4f1036e02223508f287899ea434c0 44.96MB / 44.96MB                                                             13.3s
=> => sha256:0eab4e2287a59db00ae2d401e107a120e21ac3a291b097faffb1af38a1bc773c 15.03MB / 15.03MB                                                              6.7s
=> => sha256:7c002e8f606286a649b6f6cc6420c9056f7d3075fe3094b9cc33a715ff609335 203.93MB / 203.93MB                                                           36.5s
=> => extracting sha256:5262579e8e45cb87fdc8fb6182d30da3c9e4f1036e02223508f287899ea434c0                                                                     8.4s
=> => extracting sha256:0eab4e2287a59db00ae2d401e107a120e21ac3a291b097faffb1af38a1bc773c                                                                     3.3s
=> => extracting sha256:7c002e8f606286a649b6f6cc6420c9056f7d3075fe3094b9cc33a715ff609335                                                                     6.4s
=> [internal] load build context                                                                                                                            12.9s
=> => transferring context: 54.70MB                                                                                                                         12.9s
=> [2/2] COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar                                                                                 3.1s
=> exporting to image                                                                                                                                        0.5s
=> => exporting layers                                                                                                                                       0.5s
=> => writing image sha256:ae5aa7bdd2dc8fdd2bb1185ab893b1ede6536f0cfa4ac16189471d55f7bf4dc1                                                                  0.0s
=> => naming to docker.io/sharma/accounts:s4                                                                                                                 0.0s

What's Next?
View a summary of image vulnerabilities and recommendations → docker scout quickview
PS D:\test-Microservices-git\springboot-microservice\2- Account MS - Docker\accounts> docker run -p 8080:8080 sharma/accounts:s4

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v3.1.3)

2024-02-05T07:36:38.668Z  INFO 1 --- [           main] c.sharma.accounts.AccountsApplication    : Starting AccountsApplication v0.0.1-SNAPSHOT using Java 21 with PID 1 (/accounts-0.0.1-SNAPSHOT.jar started by root in /)
2024-02-05T07:36:38.673Z  INFO 1 --- [           main] c.sharma.accounts.AccountsApplication    : No active profile set, falling back to 1 default profile: "default"
2024-02-05T07:36:47.028Z  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-02-05T07:36:47.453Z  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 377 ms. Found 2 JPA repository interfaces.
2024-02-05T07:36:51.316Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-02-05T07:36:51.383Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-02-05T07:36:51.384Z  INFO 1 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]
2024-02-05T07:36:52.011Z  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-02-05T07:36:52.025Z  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 12798 ms
2024-02-05T07:36:53.316Z  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-02-05T07:36:55.126Z ERROR 1 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:175) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-6.0.11.jar!/:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-6.0.11.jar!/:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-6.0.11.jar!/:6.0.11]
at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:332) ~[spring-jdbc-6.0.11.jar!/:6.0.11]
at org.springframework.boot.jdbc.EmbeddedDatabaseConnection.isEmbedded(EmbeddedDatabaseConnection.java:168) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.jdbc.init.DataSourceScriptDatabaseInitializer.isEmbeddedDatabase(DataSourceScriptDatabaseInitializer.java:67) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.isEnabled(AbstractScriptDatabaseInitializer.java:84) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.applyScripts(AbstractScriptDatabaseInitializer.java:107) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.applySchemaScripts(AbstractScriptDatabaseInitializer.java:98) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.initializeDatabase(AbstractScriptDatabaseInitializer.java:76) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.afterPropertiesSet(AbstractScriptDatabaseInitializer.java:66) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar!/:6.0.11]      
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:313) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1155) ~[spring-context-6.0.11.jar!/:6.0.11]      
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932) ~[spring-context-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar!/:6.0.11]       
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.3.jar!/:3.1.3]
at com.sharma.accounts.AccountsApplication.main(AccountsApplication.java:42) ~[classes!/:0.0.1-SNAPSHOT]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[na:na]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:62) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:150) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:166) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:89) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.NativeSession.connect(NativeSession.java:121) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:945) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 47 common frames omitted
Caused by: java.net.ConnectException: Connection refused
at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:682) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:542) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:592) ~[na:na]
at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327) ~[na:na]
at java.base/java.net.Socket.connect(Socket.java:751) ~[na:na]
at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 50 common frames omitted

2024-02-05T07:36:55.749Z  INFO 1 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-02-05T07:36:56.324Z  INFO 1 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.7.Final
2024-02-05T07:36:56.338Z  INFO 1 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2024-02-05T07:36:57.603Z  INFO 1 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-02-05T07:36:59.138Z  INFO 1 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-02-05T07:36:59.373Z  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-02-05T07:37:00.444Z ERROR 1 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:175) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:316) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:152) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:34) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:230) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:198) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:166) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1380) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1451) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar!/:6.0.11]      
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1155) ~[spring-context-6.0.11.jar!/:6.0.11]      
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932) ~[spring-context-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar!/:6.0.11]       
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.3.jar!/:3.1.3]
at com.sharma.accounts.AccountsApplication.main(AccountsApplication.java:42) ~[classes!/:0.0.1-SNAPSHOT]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[na:na]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:62) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:150) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:166) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:89) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.NativeSession.connect(NativeSession.java:121) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:945) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 53 common frames omitted
Caused by: java.net.ConnectException: Connection refused
at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:682) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:542) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:592) ~[na:na]
at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327) ~[na:na]
at java.base/java.net.Socket.connect(Socket.java:751) ~[na:na]
at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 56 common frames omitted

2024-02-05T07:37:00.455Z  WARN 1 --- [           main] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:175) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:316) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:152) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:34) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:230) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:198) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:166) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1380) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1451) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar!/:6.0.11]      
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1155) ~[spring-context-6.0.11.jar!/:6.0.11]      
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932) ~[spring-context-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar!/:6.0.11]       
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.3.jar!/:3.1.3]
at com.sharma.accounts.AccountsApplication.main(AccountsApplication.java:42) ~[classes!/:0.0.1-SNAPSHOT]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[na:na]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:62) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:150) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:166) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:89) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.NativeSession.connect(NativeSession.java:121) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:945) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 53 common frames omitted
Caused by: java.net.ConnectException: Connection refused
at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:682) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:542) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:592) ~[na:na]
at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327) ~[na:na]
at java.base/java.net.Socket.connect(Socket.java:751) ~[na:na]
at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 56 common frames omitted

2024-02-05T07:37:03.086Z  INFO 1 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-02-05T07:37:10.554Z  INFO 1 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2024-02-05T07:37:10.689Z  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-02-05T07:37:11.697Z ERROR 1 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:175) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:316) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl.getIsolatedConnection(DdlTransactionIsolatorNonJtaImpl.java:46) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl.getIsolatedConnection(DdlTransactionIsolatorNonJtaImpl.java:39) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.exec.ImprovedExtractionContextImpl.getJdbcConnection(ImprovedExtractionContextImpl.java:63) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.exec.ImprovedExtractionContextImpl.getJdbcDatabaseMetaData(ImprovedExtractionContextImpl.java:70) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.InformationExtractorJdbcDatabaseMetaDataImpl.processTableResultSet(InformationExtractorJdbcDatabaseMetaDataImpl.java:64) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.AbstractInformationExtractorImpl.getTables(AbstractInformationExtractorImpl.java:564) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.DatabaseInformationImpl.getTablesInformation(DatabaseInformationImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.GroupedSchemaMigratorImpl.performTablesMigration(GroupedSchemaMigratorImpl.java:72) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.performMigration(AbstractSchemaMigrator.java:232) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.doMigration(AbstractSchemaMigrator.java:117) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]  
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:284) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.lambda$process$5(SchemaManagementToolCoordinator.java:143) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at java.base/java.util.HashMap.forEach(HashMap.java:1429) ~[na:na]
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:140) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.SessionFactoryObserverForSchemaExport.sessionFactoryCreated(SessionFactoryObserverForSchemaExport.java:37) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.internal.SessionFactoryObserverChain.sessionFactoryCreated(SessionFactoryObserverChain.java:35) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:292) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:431) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1455) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar!/:6.0.11]      
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1155) ~[spring-context-6.0.11.jar!/:6.0.11]      
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932) ~[spring-context-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar!/:6.0.11]       
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.3.jar!/:3.1.3]
at com.sharma.accounts.AccountsApplication.main(AccountsApplication.java:42) ~[classes!/:0.0.1-SNAPSHOT]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[na:na]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:62) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:150) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:166) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:89) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.NativeSession.connect(NativeSession.java:121) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:945) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 60 common frames omitted
Caused by: java.net.ConnectException: Connection refused
at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:682) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:542) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:592) ~[na:na]
at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327) ~[na:na]
at java.base/java.net.Socket.connect(Socket.java:751) ~[na:na]
at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 63 common frames omitted

2024-02-05T07:37:11.712Z  WARN 1 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 08S01
2024-02-05T07:37:11.712Z ERROR 1 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
2024-02-05T07:37:11.737Z ERROR 1 --- [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: [PersistenceUnit:
default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.exception.JDBCConnectionException: Unable to open JDBC Connection for DDL execution [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
2024-02-05T07:37:11.739Z  WARN 1 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling
refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/
springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.exception.JDBCConnectionException: Unable to open JDBC Connection for DDL execution [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
2024-02-05T07:37:11.751Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2024-02-05T07:37:11.878Z  INFO 1 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2024-02-05T07:37:12.033Z ERROR 1 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/b
oot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.exception.JDBCConnectionException: Unable to open JDBC Connection for DDL execution [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar!/:6.0.11]      
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1155) ~[spring-context-6.0.11.jar!/:6.0.11]      
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932) ~[spring-context-6.0.11.jar!/:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar!/:6.0.11]       
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.3.jar!/:3.1.3]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.3.jar!/:3.1.3]
at com.sharma.accounts.AccountsApplication.main(AccountsApplication.java:42) ~[classes!/:0.0.1-SNAPSHOT]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[accounts-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: jakarta.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.exception.JDBCConnectionException: Unable to open JDBC Connection for DDL execution [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:421) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.11.jar!/:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.11.jar!/:6.0.11]
... 22 common frames omitted
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to open JDBC Connection for DDL execution [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl.getIsolatedConnection(DdlTransactionIsolatorNonJtaImpl.java:74) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl.getIsolatedConnection(DdlTransactionIsolatorNonJtaImpl.java:39) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.exec.ImprovedExtractionContextImpl.getJdbcConnection(ImprovedExtractionContextImpl.java:63) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.exec.ImprovedExtractionContextImpl.getJdbcDatabaseMetaData(ImprovedExtractionContextImpl.java:70) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.InformationExtractorJdbcDatabaseMetaDataImpl.processTableResultSet(InformationExtractorJdbcDatabaseMetaDataImpl.java:64) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.AbstractInformationExtractorImpl.getTables(AbstractInformationExtractorImpl.java:564) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.extract.internal.DatabaseInformationImpl.getTablesInformation(DatabaseInformationImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.GroupedSchemaMigratorImpl.performTablesMigration(GroupedSchemaMigratorImpl.java:72) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.performMigration(AbstractSchemaMigrator.java:232) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.doMigration(AbstractSchemaMigrator.java:117) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]  
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:284) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.lambda$process$5(SchemaManagementToolCoordinator.java:143) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at java.base/java.util.HashMap.forEach(HashMap.java:1429) ~[na:na]
at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:140) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.SessionFactoryObserverForSchemaExport.sessionFactoryCreated(SessionFactoryObserverForSchemaExport.java:37) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.internal.SessionFactoryObserverChain.sessionFactoryCreated(SessionFactoryObserverChain.java:35) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:292) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:431) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1455) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.11.jar!/:6.0.11]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.11.jar!/:6.0.11]
... 26 common frames omitted
Caused by: com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:175) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:316) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl.getIsolatedConnection(DdlTransactionIsolatorNonJtaImpl.java:46) ~[hibernate-core-6.2.7.Final.jar!/:6.2.7.Final]
... 47 common frames omitted
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502) ~[na:na]
at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) ~[na:na]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:62) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:150) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:166) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:89) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.NativeSession.connect(NativeSession.java:121) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:945) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 60 common frames omitted
Caused by: java.net.ConnectException: Connection refused
at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:682) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:542) ~[na:na]
at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:592) ~[na:na]
at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327) ~[na:na]
at java.base/java.net.Socket.connect(Socket.java:751) ~[na:na]
at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-j-8.0.33.jar!/:8.0.33]
... 63 common frames omitted

