package cc.voox.orders.controller;

import cc.voox.orders.model.OrderDetail;
import cc.voox.orders.service.OrderDetailService;
import cc.voox.product.client.ProductClient;
import cc.voox.product.vo.ProductOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
//@RibbonClient(name = "product")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private ProductClient productClient;

    @GetMapping("ps")
    public List<ProductOutput> getProducts() {
        return productClient.findByIds(Arrays.asList(17L, 18L));
    }

    @GetMapping("get")
    public String gets() {
        return productClient.hello();
    }

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @RequestMapping("orders")
//    public List<OrderDetail> getAllOrders() {
//        return orderDetailService.findAll();
//    }
//
//
//    @RequestMapping("test")
//    public String msg() {
////        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance si = loadBalancerClient.choose("product");
//        System.out.println(si.getPort());
//        String url = String.format("http://%s:%s/%s", si.getHost(), si.getPort(), "list");
//        RestTemplate rs = new RestTemplate();
//        String resp = rs.getForObject(url, String.class);
////        return "test from order";
//
//        return resp + si.getPort();
//    }

}
