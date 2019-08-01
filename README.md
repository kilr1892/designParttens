# designParttens
大话设计模式 , 用java实现书中所有代码
每一章都从"菜鸟"最初的版本演化的最新的版本
# maven配置
第一章需要用到`switch (String )` 需要jdk1.7以上的版本
这里使用了jdk11
```xml
  <properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
  </properties>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.7.0</version>
      </plugin>
    </plugins>
  </build>
```
# 第一章

v1.0 原始版

v2.0 减少if

v3.0 面向对象, 封装操作类, 将业务与界面分离

v4.0 使用简单工厂模式生成操作类 

# 第二章

v1.0 原始版

v2.0 增加打折