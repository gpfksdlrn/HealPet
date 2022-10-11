package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class memberVO {
    private int memberSeq;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberSex;
    private String memberBirth;
    private String memberPhone;
    private String memberAddressPost;
    private String memberAddress;
    private String memberMarketingYn;
    private String regDt;
    private String updDt;
    private String useYn;
}
