package shopjjh.domain;

import java.util.*;
import lombok.*;
import shopjjh.domain.*;
import shopjjh.infra.AbstractEvent;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Shipped(Shipping aggregate) {
        super(aggregate);
    }

    public Shipped() {
        super();
    }
}
