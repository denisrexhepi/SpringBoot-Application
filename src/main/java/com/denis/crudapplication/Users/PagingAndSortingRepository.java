package com.denis.crudapplication.Users;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
@NoRepositoryBean

public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {
    Page<Users> findAll(Pageable pageable);

}
