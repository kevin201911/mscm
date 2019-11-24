
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
