package com.earth.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private Integer salary;
}
