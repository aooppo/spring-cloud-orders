package cc.voox.orders.repository;

import cc.voox.orders.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findAllByOidIn(List<Integer> oids);
}
