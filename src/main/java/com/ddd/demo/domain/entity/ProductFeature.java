package com.ddd.demo.domain.entity;

import com.ddd.demo.domain.enums.AgeRange;
import com.ddd.demo.domain.enums.Color;
import com.ddd.demo.domain.enums.FaceStyle;

import lombok.Data;

@Data
public class ProductFeature
{
    private String productId;
    private AgeRange ageRange;
    private Color color;
    private FaceStyle faceStyle;
}
