# 4：springapplication.run 原理



## 1：run的作用

- 判断该项目要是普通的Java项目还是web 项目
  - Java项目运行完就结束了，web项目是一直在运行
- 查找并且加载所有可用的初始化器
  - 设置到initializers属性中
- 找出所有的应用程序监听器
  - 设置到listeners属性中
  - 查看上下文 处理 bean
- 推断并设置main方法的定义类
  - 找到运行的主类

- 我们使用的

