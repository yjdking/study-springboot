package org.yjd.studyspringboot.domain.userapplication;

import java.util.List;

// @DDDRepository
public interface UserApplicationRepositpory {
    List<UserApplication> getUser(String name);
}
