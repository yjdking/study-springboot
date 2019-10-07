package org.yjd.studyspringboot.domain.userapplication;

import org.springframework.stereotype.Repository;

import java.util.List;

// @DDDRepository
@Repository
public interface UserApplicationRepositpory {
    List<UserApplication> getUser(String name);
}
