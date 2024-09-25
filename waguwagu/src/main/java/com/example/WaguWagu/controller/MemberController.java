package com.example.WaguWagu.controller;

import com.example.WaguWagu.domain.Member;
import com.example.WaguWagu.repository.MemberRepository;
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

    @GetMapping("select")
    public ResponseEntity<List<Member>> select(){
        return ResponseEntity.status(200).body(memberRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody Member member){

        return ResponseEntity.status(200).body("추가완료!");
    }
}
