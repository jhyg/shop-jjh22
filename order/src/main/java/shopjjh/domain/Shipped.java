package shopjjh.domain;

import java.util.*;
import lombok.Data;
import shopjjh.infra.AbstractEvent;

@Data
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;
}
