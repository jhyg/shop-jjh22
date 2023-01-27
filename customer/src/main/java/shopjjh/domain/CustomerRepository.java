package shopjjh.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopjjh.domain.*;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository
    extends PagingAndSortingRepository<Customer, Long> {}
