package com.toyproject.healpet.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_member")
public class HealPetMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_SEQ")
    private int memberSeq;

    @Column(name = "MEMBER_ID", length = 50, nullable = false)
    private String memberId;

    @Column(name = "MEMBER_PW", length = 300, nullable = false)
    private String memberPw;

    @Column(name = "MEMBER_NAME", length = 50, nullable = false)
    private String memberName;

    @Column(name = "MEMBER_SEX", length = 1, nullable = false)
    private String memberSex;

    @Column(name = "MEMBER_BIRTH", length = 45, nullable = false)
    private String memberBirth;

    @Column(name = "MEMBER_PHONE", length = 20, nullable = false)
    private String memberPhone;

    @Column(name = "MEMBER_ADDRESS_POST", length = 10, nullable = false)
    private String memberAddressPost;

    @Column(name = "MEMBER_ADDRESS", length = 45, nullable = false)
    private String memberAddress;

    @Column(name = "MEMBER_MARKETING_YN", length = 1, nullable = false)
    private String memberMarketingYn;

    @Column(name = "REG_DT", nullable = false)
    private LocalDateTime regDt;

    @Column(name = "UPD_DT", nullable = false)
    private LocalDateTime updDt;

    @Column(name = "USE_YN" , length = 1, nullable = false)
    private String useYn;

//    @OneToMany(mappedBy = "pmsTeam")
//    private List<PmsUgroup> pmsUgroups = new ArrayList<>();
}
