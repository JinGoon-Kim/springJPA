package jpabook.jpashop.repository.order.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderItemQueryDto {

    @JsonIgnore
    private Long orderId;
    private String itmeName;
    private int orderPrice;
    private int count;

    public OrderItemQueryDto(Long orderId, String itmeName, int orderPrice, int count) {
        this.orderId = orderId;
        this.itmeName = itmeName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
