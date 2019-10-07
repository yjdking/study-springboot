package org.yjd.studyspringboot.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import org.yjd.studyspringboot.domain.userapplication.UserApplication;
import org.yjd.studyspringboot.infrastructure.persistence.hibernate.UserDBO;
import org.yjd.studyspringboot.infrastructure.persistence.hibernate.UserDBRepo;
import org.yjd.studyspringboot.domain.userapplication.UserApplicationRepositpory;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepositporyImpl implements UserApplicationRepositpory {
    private UserDBRepo userDBRepo;

    @Override
    public List<UserApplication> getUser(String name) {
        return userDBRepo.findByName(name)
                .stream()
                .map(UserApplication::from)
                .collect(Collectors.toList());
    }
}
