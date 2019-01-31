# springboot-study
从零开始学习springboot

## chapter1

构建第一个Springboot工程

+ springboot的自动类路径扫描只扫描
  Chapter1Application.class所在的目录和它的子目录

## chapter2

学习Springboot自定义配置

+ @ConfigurationProperties
+ @PropertySource

## chapter3

SpringBoot日志配置

​	Spring Boot 内部采用的是 Commons Logging进行日志记录，但在底层为 Java Util Logging、Log4J2、Logback 等日志框架提供了默认配置 。

日志默认输出内容：

+ 时间日期：精确到毫秒,可以用于排序
+ 日志级别：ERROR、WARN、INFO、DEBUG、TRACE
+ 进程ID
+ 分隔符：采用 --- 来标识日志开始部分
+ 线程名：方括号括起来（可能会截断控制台输出）
+ Logger名：通常使用源代码的类名
+ 日志内容：我们输出的消息

SpringBoot 默认为我们输出的日志级别为 INFO、WARN、ERROR