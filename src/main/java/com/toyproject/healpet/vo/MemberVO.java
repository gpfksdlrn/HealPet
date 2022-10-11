package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemberVO {
    private int memberSeq;              // 회원 일련번호
    private String memberId;            // 회원 아이디(이메일)
    private String memberPw;            // 회원 비밀번호
    private String memberName;          // 회원 이름
    private String memberSex;           // 회원 성별
    private String memberBirth;         // 회원 생년월일
    private String memberPhone;         // 회원 휴대폰번호
    private String memberAddressPost;   // 우편번호
    private String memberAddress;       // 주소
    private String memberMarketingYn;   // 마케팅 수신 동의 여부
    private String regDt;               // 등록 날짜
    private String updDt;               // 수정 날짜
    private String useYn;               // 회원 비활성화 여부
}
