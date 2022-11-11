package com.toyproject.healpet.controller;


import com.toyproject.healpet.service.MemberService;
import com.toyproject.healpet.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healpet/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private final MemberService memberService;

    @GetMapping("list")
    @Transactional
    public MemberVO memberList() throws Exception {
        MemberVO member = memberService.memberList();

        return member;
    }

}
