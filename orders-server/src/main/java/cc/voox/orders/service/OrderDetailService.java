package cc.voox.orders.service;

import cc.voox.orders.model.OrderDetail;
import cc.voox.orders.repository.OrderDetailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailDAO orderDetailDAO;

    public List<OrderDetail> findAllByOidIn(List<Integer> oids) {
        return orderDetailDAO.findAllByOidIn(oids);
                
    }

    public List<OrderDetail> findAll() {
        return orderDetailDAO.findAll();

    }
}
