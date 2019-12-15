package com.ddd.demo.domain.enums;

import lombok.Data;

@Data
public enum AgeRange
{
    YOUNG(0, "少年"), MIDDLE(1, "中年"), OLD(2, "老年");
    private Integer value;
    private String description;

    AgeRange(Integer value, String description)
    {
        this.value = value;
        this.description = description;
    }
}
