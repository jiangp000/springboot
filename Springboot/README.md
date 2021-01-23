# 1：创建springboot，打包，运行

## 1：编写controller

![](https://i.loli.net/2021/01/22/vBW7gUyO6mqYEuz.png)



## 1:Springboot的POM.XML文件

![](https://i.loli.net/2021/01/22/FCrnH8Dc3d2RJIY.png)

### 1：parent

```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
```



- 继承了spring=boot-starter-parent的**依赖管理，控制版本和打包的内容**
- 内容有版本号码

### 2：元数据信息

```xml
 <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>demo</name>
    <description>Demo project for Spring Boot</description>

```

- **groupId**
- **artifactId**
- **version**
- **name**
- **descript**

### 3：依赖信息

```
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

```

- **web**  和**test**



### 4：build

```xml
    <build>
<!--        打包jar包插件-->
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

```

- 构建配置文件，默认使用**spring-boot-maven-plugin**



## 2：maven项目打包

- 点开IDEA右边的maven符号
- 点开 **Lifecycle**
- **双击 package**
- 在target中就可以看到jar包

## 3：运行 jar包

- 在当前的文件夹 **按住shirt+鼠标右击**
- 打开**powershell**
- **java -jar hello**
- 然后在浏览器访问 localhost:8080/hello 

