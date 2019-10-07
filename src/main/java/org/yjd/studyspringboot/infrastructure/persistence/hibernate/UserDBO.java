package org.yjd.studyspringboot.infrastructure.persistence.hibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yjd.studyspringboot.domain.userapplication.UserApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class UserDBO {

    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private Integer age;

    public static UserApplication to(UserDBO userDBO) {
        return UserApplication.builder()
                .id(userDBO.getId())
                .age(userDBO.getAge())
                .name(userDBO.getName())
                .build();
    }
}
