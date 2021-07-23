package ribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@Component
public class MyLoadBalanceRule implements IRule {
    public Server choose(Object o) {
        return null;
    }

    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        System.out.println(1111);

    }

    public ILoadBalancer getLoadBalancer() {
        System.out.println(1111);
        return null;
    }

    //public Server choose(ILoadBalancer lb, Object key) {
    //    if (lb == null) {
    //        return null;
    //    } else {
    //        Server server = null;
    //
    //        while(server == null) {
    //            if (Thread.interrupted()) {
    //                return null;
    //            }
    //
    //            List<Server> upList = lb.getReachableServers();
    //            List<Server> allList = lb.getAllServers();
    //            int serverCount = allList.size();
    //            if (serverCount == 0) {
    //                return null;
    //            }
    //
    //            int index = this.chooseRandomInt(serverCount);
    //            server = (Server)upList.get(index);
    //            if (server == null) {
    //                Thread.yield();
    //            } else {
    //                if (server.isAlive()) {
    //                    return server;
    //                }
    //
    //                server = null;
    //                Thread.yield();
    //            }
    //        }
    //
    //        return server;
    //    }
    //}
    //
    //protected int chooseRandomInt(int serverCount) {
    //    return ThreadLocalRandom.current().nextInt(serverCount);
    //}
    //
    //public Server choose(Object key) {
    //    return this.choose(this.getLoadBalancer(), key);
    //}
    //
    //public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
    //
    //}
    //
    //public ILoadBalancer getLoadBalancer() {
    //    return null;
    //}
    //
    //public void initWithNiwsConfig(IClientConfig clientConfig) {
    //}
}
