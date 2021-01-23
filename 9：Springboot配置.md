# 9：Springboot配置

## 一：yaml

- 以前的配置文件，之前都是XML 文件
- 是一个标记语言，也不是一个标记语言

### 1：基本语法

![image-20210123105318172](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210123105318172.png)



## 2：用@Value 赋值

![image-20210123110417965](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210123110417965.png)



## 3： 用yaml赋值



![image-20210123110727872](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210123110727872.png)



### 1：报红的原因

- 打开网站，导入依赖就可以





### 2：运行报错

![image-20210123111943404](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210123111943404.png)

```xml
Description:

Failed to bind properties under 'person.birth' to javax.xml.crypto.Data:

    Property: person.birth
    Value: 2021/11/23
    Origin: class path resource [application.yaml] - 5:10
    Reason: No converter found capable of converting from type [java.lang.String] to type [javax.xml.crypto.Data]

Action:

Update your application's configuration
```





- **去掉date类**
- 