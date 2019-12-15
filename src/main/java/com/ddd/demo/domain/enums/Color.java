package com.ddd.demo.domain.enums;

import lombok.Data;

@Data
public enum Color
{
    PINK(0, "分红"), BLOOD_RED(1, "血红"), BRIGHT_RED(3, "大红");
    private Integer value;
    private String description;

    Color(Integer value, String description)
    {
        this.value = value;
        this.description = description;
    }
}
