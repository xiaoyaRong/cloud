# cloud
springCloud 生态


1.eureka集群，多个eureka节点平等的，所以在每一个节点都需要声明其他节点的空间

2.ribbon 是消费端的负载均衡，需要在消费端集成，消费端本可以用springcloud-restful的方式http调用提供者
  因为需要导入eureka，让消费端到注册中心请求，所以可以不导入ribbon的jar,但是注意到eureka请求时使用的是
  提供者的事例名而不是ip+端口
  
3.业务服务（提供者）集群，搭建多个相同服务，或者把核心服务工程以微服务的形式部署到多台云服务器上可采用
  注意：服务（provider）需要向所有eureka集群中注册，因为eureka集群是地位同等的，没有主从之说
       多个服务需要名称相同，因为eureka集群形式，消费者需要通过服务名称（application:name）去
          访问提供者
          
4.自定义负载均衡算法 MyLoadBalanceRule
  注意不可放在springboot启动类的上下文中 然后在修改项目启动注入的负载均衡算法bean
  
5.feign 实现负载均衡 
  需要引入feign的jar包，另外定一个service接口用feign的注解标记 value里指定提供服务的项目名称（application-name）
  所以feign实现的负载均衡也是需要依赖ribbon的，底层是包装ribbon实现负载均衡，只是写法和理解是更适合java程序的编程方式
  写法：在公共项目里定义feign接口DeptFeignService 确保自己的feignconsumer项目消费者可以访问到（以pom的形式引入）
  然后DeptFeignService每个方法@RequestMapping("")指定提供服务的项目的controller方法上的mapping
  在consumer调用时只需要autowire-feign的接口类，调用内部的方法即可
  
   

