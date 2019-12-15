package com.ddd.demo.domain.enums;

import lombok.Data;

@Data
public enum FaceStyle
{
    CIRCLE(0, "圆脸"), SQUARE(1, "方脸"), OVAL_FACE(2, "鹅蛋脸");
    private Integer value;
    private String description;

    FaceStyle(Integer value, String description)
    {
        this.value = value;
        this.description = description;
    }

}
