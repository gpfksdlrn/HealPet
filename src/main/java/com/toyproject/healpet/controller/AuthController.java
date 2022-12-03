package com.toyproject.healpet.controller;


import com.toyproject.healpet.request.MemberAddRequest;
import com.toyproject.healpet.service.AuthService;
import com.toyproject.healpet.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/healpet/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;

    @GetMapping("list")
    @Transactional
    public Object memberList() throws Exception {
        Object member = authService.getMember();

        return member;
    }

    @PostMapping("add")
    @Transactional
    public Object memberAdd(@RequestBody MemberAddRequest memberAddRequest) throws Exception {
        Object addResult = authService.addMember(memberAddRequest);

        return addResult;
    }

}
