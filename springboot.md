## 3：什么是微服务架构

​		微服务是在开发过程中，把服务拆分成一个一个效地组合。通过http或者是进行互通。

​		all in one：所有的应用服务都放在一个应用中

​		优点：一个人可以做所有，但是不易于扩展

​		all in one,MVC,RPC,SOA

​		比如一个电商系统，查缓存，连接数据库，浏览页面，结账，支付等服务都是一个个独立的功能服务。

​		运维变难了

​		SPRINGBOOT ,SPRINGCLOUD,   SPRING CLOUD DATA FLOW

​		

MVC  三次架构架构view mode controller  MVVM 架构

微服务就是一个一个的业务

service：userService 把一个服务放一个模块，放一个电脑上

springmvc：

## 4：springboot第一天

打包 直接点击 package   java -jar 名称

微服务 就是把服务拆分成一个一个的块



## 13：springboot web开发（没有代码）

I：springboot帮我们配置了什么？能不能进行修改？能不能扩展

- xxxxxAutoConfiguration。向容器中自动配置组件
- 

要解决的问题：

- 导入静态的资源，比如说配置
- 首页
- jsp，模板引擎thymeleaf
- 装配扩展springmvs
- 增删改查
- 拦截器
- 国际化

## 14：静态资源问题

先写controller

I：什么是webjars 

webjars所引入的所有资源，都满足META-INF/resources/webjars  /**

在springboot中，我们可以使用以下的资源来处理静态资源

- webjars
- public static /** resources  locolhost：8080
- 

II：resources

public ：最低

static：其次

 resources :最高

templates 

## 15 首页和图标的制定

get index html  映射到首页中

在templates目录下的所有页面，只能拖过controller来跳转

自己的图标放在public 下面，放在外面中不到

## 16 thymeleaf模板引擎

如果需要使用thymeleaf，只需要导入相应的依赖就可以了。

我们将html放到我们的templates目录下即可

通过controller 跳到html文件就可以了

所有的html元素都可以被th接管 th:style

## 18 MVC配置原理（难点）

在config宝中写auto-configuration ：全面的接管

ALT+SHIRT

实现了视图解析器，获取候选的视图，等到最好的视图

## 20 员工管理系统的准备工作

一共是四个页面

模板 搜索：bootstars

## 29 聊聊该如何写一个网站

bootstrap 后台模板

或者是 使用框架

自己写网站要求很高

常见的：bootstrap，layui，semantic-ui

- 栅格系统
- 导航栏
- 曾边栏
- 表单



第一：前端搞定，页面长成什么样子

第二：设计数据库

第三：前端让他自动的运行，独立化的工程

第四：前端接口如何对接：json，对象 all in one

第五：前后端联调测试

有一条熟悉的后台模板：工作必要的 X-ADMIN



有一套自己熟悉的后台模板：工作必要的 x-admin

前端的页面：至少自己能够通过前端的框架，组合出来一个网站的首页

让这个网站能够独立的运行



至少需要一个月的时间

写一个 关于焙焙的web网站



## 30 回顾以及这周的安排

- jdbc
- mybatis
- druid
- shiro
- spring security
- 异步任务：邮件的返送：安全，重点
- swagger
- dubbo+zook