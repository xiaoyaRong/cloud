# cloud
springCloud 生态


1.eureka集群，多个eureka节点平等的，所以在每一个节点都需要声明其他节点的空间
2.ribbon 是消费端的负载均衡，需要在消费端集成，消费端本可以用springcloud-restful的方式http调用提供者
  因为需要导入eureka，让消费端到注册中心请求，所以可以不导入ribbon的jar,但是注意到eureka请求时使用的是
  提供者的事例名而不是ip+端口
