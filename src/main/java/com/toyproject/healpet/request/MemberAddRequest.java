package com.toyproject.healpet.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberAddRequest {
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberSex;
    private String memberBirth;
    private String memberPhone;
    private String memberAddressPost;
    private String memberAddress;
    private String memberMarketingYn;
}
