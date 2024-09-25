package com.example.WaguWagu.controller;

import com.example.WaguWagu.domain.Member;
import com.example.WaguWagu.dto.MemberRequestDto;
import com.example.WaguWagu.repository.MemberRepository;
import com.example.WaguWagu.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("member")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("select")
    public ResponseEntity<List<Member>> select(){
        return ResponseEntity.ok().body(memberRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody MemberRequestDto memberRequestDto){

        memberService.insert(memberRequestDto);

        return ResponseEntity.ok().body("추가완료!");
    }
}
