package org.yjd.studyspringboot.infrastructure.persistence.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
 // @RepositoryDefinition(domainClass = UserDBO.class, idClass = Integer.class)
public interface UserDBRepo extends JpaRepository<UserDBO, Integer> {
    List<UserDBO> findByName(String name);
}
