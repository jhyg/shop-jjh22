package shopjjh.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductSearch_table")
@Data
public class ProductSearch {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String deliveryStatus;
    private String productId;
    private String orderStatus;
    private Long stock;
}
