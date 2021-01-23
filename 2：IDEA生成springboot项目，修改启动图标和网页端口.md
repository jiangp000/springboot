# 2：IDEA生成springboot项目，修改启动图标和网页端口

## 1：IDEA生成springboot项目

![image-20210122121436273](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210122121436273.png)



- 新建 **spring initializer**
- 选择custome **http://start/springboot.io**
- default可能会导入失败（网速过慢）

## 2：修改启动图标



![image-20210122121621346](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210122121621346.png)





- 在网页中搜索 springboot banner  在线生成
- https://www.bootschool.net/ascii
- 在resources 中创建banner.text
- 将复制好的文本粘贴到该文件里面就可以了
- 再次启动就有自定义的图形了



## 3：修改网页端口

- 在**application.properties** 中 写入
- **server.popt=8081**

