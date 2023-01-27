package shopjjh.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopjjh.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderdetails",
    path = "orderdetails"
)
public interface OrderDetailRepository
    extends PagingAndSortingRepository<OrderDetail, Long> {}
