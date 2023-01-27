package shopjjh.domain;

import java.util.*;
import lombok.Data;
import shopjjh.infra.AbstractEvent;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
}
