mscm微服分布式框架采用前后端分离
 
 
 后端模块结构说明:

  
  ├── mscloud-common -- 通用服务
  
      ├── mscloud-auth -- 权限验证服务
      
      ├── mscloud-db-spring-boot-starter  -- 通用数据库服务
      
      ├── mscloud-log-spring-boot-starter -- 通用日志服务
      
      ├── mscloud-redis-spring-boot-starter -- 通用redis服务
      
      ├── mscloud-ribbon-spring-boot-starter -- 通用ribbon服务
      
      └── mscloud-sentinel-spring-boot-starter -- 通用链路追踪服务
      
      └── mscloud-spring-boot-starter -- 通用spring-boot服务
      
      └── mscloud-swagger2-spring-boot-starter -- 通用api文档服务
      
  ├── mscloud-mesh-business -- 业务服务模块
  
      └── user-center -- 用户及系统管理服务
      
  ├── components -- 通用组件封装
  
  ├── mscloud-mesh-config -- 统一配置中心
  
  ├── mscloud-mesh-gateway -- 智能路由网关
  
  ├── mscloud-mesh-user -- 用户安全验证
  
  
  
   
   
   
   
   
   
   注册中心采用Nacos:

   Nacos安装
   前往 https://github.com/alibaba/nacos/releases 下载

   unzip nacos-server-1.0.0.zip

   或者

   tar -xvf nacos-server-1.0.0.tar.gz

   启动

   #Linux/Unix/Mac 下
   sh startup.sh -m standalone

   #Windows 下
   cmd startup.cmd

   测试，打开 http://localhost:8848/nacos/#/login ，默认账号密码都是nacos
   
   
  
  
  
  前端项目技术选型:
  
    Vue         (https://vuejs.org/)
    
    Vue-router  (https://router.vuejs.org/)
    
    Vuex        (https://vuex.vuejs.org/)
    
    Element     (https://element.eleme.io/)
    
    Axios       (https://github.com/axios/axios)
    
   
    node安装 下载地址:https://nodejs.org/zh-cn/download/releases/
    
    axios安装:
    npm install axios

    安装element-ui
    npm i element-ui -S
