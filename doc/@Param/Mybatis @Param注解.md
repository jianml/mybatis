# Mybatis的Mapper中多参数方法不使用@param注解报错的问题

### 问题描述

Mybatis的Mapper中多参数方法，没有用@Param注解，同样的代码，有时候运行没有问题，有时候运行会报如下错误：





在JDK8之前，java编译器会忽略我们编写代码时候设定的参数名

jdk中新增-parameters参数，开启此参数可以将编译后的class文件保留原码中的参数名
保留参数名方便反射的时候判断参数，比如Mybatis中mapper中的参数，可以不加@Param显性指定
不加-parameters参数



jdk 1.8是可以拿到参数名的, 而且mybatis是支持题主所说的。 即使不用jdk 1.8也是可以不用@Param注解的， 可以使用#{0} 或者#{arg0} 或者#{param0} 这三者取决于useActualParamName 这个配置的值和mybatis的版本。 当然有@Param会多一种实现方式，在jdk1.8版本之前也可以使用#{参数名}这种方式。



mybatis通过注解把参数封装进map了，咱们不用再次封装

1.8的字节码还是没有参数信息的吧，javac加上-paramters 字节码就有参数信息了



3.4.2版本之前设置属性中useActualParamName参数的默认值为flase



3.4.2版本之后设置属性中useActualParamName参数的默认值为true 



允许使用方法签名中的名称作为语句参数名称。 为了使用该特性，你的项目必须采用 Java 8 编译，并且加上 `-parameters` 选项。（新增于 3.4.1）

https://mybatis.org/mybatis-3/zh/configuration.html#settings