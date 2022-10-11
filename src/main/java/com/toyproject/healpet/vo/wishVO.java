package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class wishVO {
    private int wishSeq;
    private int itemSeq;
    private int memberSeq;
    private String regDt;
    private String useYn;
}
