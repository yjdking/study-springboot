package org.yjd.studyspringboot.domain.userapplication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yjd.studyspringboot.infrastructure.persistence.hibernate.UserDBO;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserApplication {
    private Integer id;
    private String name;
    private Integer age;

    public static UserApplication from(UserDBO userDBO) {
        return UserApplication.builder()
                .id(userDBO.getId())
                .age(userDBO.getAge())
                .name(userDBO.getName())
                .build();
    }
}
