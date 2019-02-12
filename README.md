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

## chapter4

整合Thymeleaf模板

## chapter5

使用JdbcTemplate访问数据库

## chapter6

整合SpringDataJpa

### JPA

​	JPA是Java Persistence API的简称，中文名Java持久层API，是官方（Sun）在JDK5.0后提出的Java持久化规范。其目的是为了简化现有JAVA EE和JAVA SE应用开发工作，以及整合现有的ORM技术实现规范统一

+ ORM映射元数据： 支持XML和注解两种元数据的形式，元数据描述对象和表之间的映射关系，框架据此将实体对象持久化到数据库表中；
+ API： 操作实体对象来执行CRUD操作，框架在后台替代我们完成所有的事情，开发者从繁琐的JDBC和SQL代码中解脱出来。
+ 查询语言： 通过面向对象而非面向数据库的查询语言查询数据，避免程序的SQL语句紧密耦合。

​      JPA只是一种规范，它需要第三方自行实现其功能，在众多框架中Hibernate是最为强大的一个。从功能上来说，JPA就是Hibernate功能的一个子集。Hibernate 从3.2开始，就开始兼容JPA。同时Hibernate3.2获得了Sun TCK的JPA(Java Persistence API) 兼容认证。

### Spring Data JPA

​	常见的ORM框架中Hibernate的JPA最为完整，因此Spring Data JPA 是采用基于JPA规范的Hibernate框架基础下提供了Repository层的实现。Spring Data Repository极大地简化了实现各种持久层的数据库访问而写的样板代码量，同时CrudRepository提供了丰富的CRUD功能去管理实体类。

优点：

+ 丰富的API，简单操作无需编写额外的代码
+ 丰富的SQL日志输出

缺点：

+ 学习成本较大，需要学习HQL
+ 配置复杂，虽然SpringBoot简化的大量的配置，关系映射多表查询配置依旧不容易
+ 性能较差，对比JdbcTemplate、Mybatis等ORM框架，它的性能无异于是最差的

## chapter7

整合Mybatis