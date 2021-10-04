# Read me

本实例主要用于记录springboot整合各类持久层的方案

### 1.data-persistence-jpa 
springboot + jpa + jpa buddy快速生成domain + dao

### 2.data-persistence-mybatis
springboot + mybatis + free mybatis plugin 快速生成domain + dao

### 3.data-persistence-tkmapper
不用插件而是使用通用mapper框架


### 4.springboot 整合 redis

pom.xml
application.yml


### 5.自制maven archetype
1.mvn archetype:create-from-project     //生成archetype项目文件
2.cd target/generated-sources/archetype/   //切换到archetype项目跟目录
3.mvn install   //对archetype项目打包安装
4.mvn archetype:generate -DarchetypeCatalog=local  //利用local本地提供的archetype创建项目
