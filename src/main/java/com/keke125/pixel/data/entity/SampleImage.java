package com.keke125.pixel.data.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleImage extends AbstractEntity {

    private Integer colorDepth;
    private Integer pixelSize;
    private String smooth;
    private String edgeCrispening;
    private Integer saturation;
    private Integer contrastRatioBox;
    private boolean isPublic;
}