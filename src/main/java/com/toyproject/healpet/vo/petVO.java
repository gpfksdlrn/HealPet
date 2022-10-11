package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class petVO {
    private int petSeq;
    private int memberSeq;
    private String petName;
    private String petSex;
    private String petBirth;
    private String petBreed;
    private String petWeight;
    private String petNevteringYn;
    private String petNevteringDt;
}
