# In-Action
本项目是一个学习DEMO项目，结合博客(语雀)来做演示。

## 信息记录
- SpringBoot、SpringCloud对应适配版本[地址](https://start.spring.io/actuator/info)。

## 版本
- JDK1.8
- Spring Boot
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>2.3.1.RELEASE</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
    ```
- Spring Cloud
    ```xml
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-dependencies</artifactId>
        <version>Hoxton.SR6</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
    ```
- Spring Cloud Alibaba
    ```xml
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-alibaba-dependencies</artifactId>
        <version>2.2.1.RELEASE</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
    ```
  
## 包名命名规则
以com.inaction.<module_name>开头

例如module是Spring-Boot-Actuator-In-Action，那么包名将是以`com.inaction.springboot.actuator`开头。