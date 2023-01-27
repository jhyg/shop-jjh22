package shopjjh.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shopjjh.OrderApplication;
import shopjjh.domain.OrderCancelled;
import shopjjh.domain.OrderPlaced;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productId;

    private Integer qty;

    private String customerId;

    @OneToMany
    private OrderDetail orderDetail;

    @Embedded
    private Payment payment;

    @Embedded
    private Money price;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PostRemove
    public void onPostRemove() {
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {
        // Get request from Order
        //shopjjh.external.Order order =
        //    Application.applicationContext.getBean(shopjjh.external.OrderService.class)
        //    .getOrder(/** mapping value needed */);

    }

    @PreRemove
    public void onPreRemove() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public static void apologizeCustomer(
        OutOfStockOccurred outOfStockOccurred
    ) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(outOfStockOccurred.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }
}
