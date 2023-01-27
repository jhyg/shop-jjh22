package shopjjh.domain;

import java.util.*;
import lombok.*;
import shopjjh.domain.*;
import shopjjh.infra.AbstractEvent;

@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Returned(Shipping aggregate) {
        super(aggregate);
    }

    public Returned() {
        super();
    }
}
