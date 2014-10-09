package io.github.nail2008.cookbook_bootstrap.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nail2008.cookbook_bootstrap.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
