# dubbo-demo

### dubbo-api 
	
	通常为通用配置,其他Maven模块需依赖此模块
	
### dubbo-provider
	
	服务提供端者

### dubbo-consumer

	服务消费端
	
### 项目启动
	
	1.将api模块安装到本地仓库
	2.使用指令tomcat7:run依次启动提供者消费端
	3.浏览器访问http://localhost:8080/show/say
	
	
dubbo-demo
	dubbo-sso
		dubbo-sso-provider(8091)
		dubbo-sso-consumer(8082)
	dubbo-provider(8090)
	dubbo-consumer(8080)
	dubbo-quartz(7001)
	dubbo-activemq(7002)

