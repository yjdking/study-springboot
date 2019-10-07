package org.yjd.studyspringboot.controller.dto;

// 这是只是单纯的模拟，这个entity 实际上不用转化

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Integer id;
    private String name;
    private Integer age;
}
