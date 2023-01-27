package shopjjh.domain;

import java.util.*;
import lombok.*;
import shopjjh.domain.*;
import shopjjh.infra.AbstractEvent;

@Data
@ToString
public class OutOfStockOccurred extends AbstractEvent {

    private Long id;
}
