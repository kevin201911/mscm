 模块结构说明:
   
   mscloud-common:基础模块(包括统一日志管理、redis服务、断路监控、权限认证管理、swagger API文档管理、数据库管理等)
   
   mscloud-mesh-business:业务服务模块(包含用户管理功能)
   
   mscloud-mesh-config:统一配置中心
   
   mscloud-mesh-gateway:智能路由网关
   
   mscloud-mesh-user:统一api安全验证中心
   
   
  
  
  
  前端项目技术选型:
    Vue         (https://vuejs.org/)
    Vue-router  (https://router.vuejs.org/)
    Vuex        (https://vuex.vuejs.org/)
    Element | 前端UI框架 | [https://element.eleme.io/](https://element.eleme.io/)
    Axios | 前端HTTP框架 | [https://github.com/axios/axios](https://github.com/axios/axios)
   
    node安装 下载地址:https://nodejs.org/zh-cn/download/releases/
    
    axios安装:
    npm install axios

    安装element-ui
    npm i element-ui -S
   


 

  1.注册中心Nacos安装说明:

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
