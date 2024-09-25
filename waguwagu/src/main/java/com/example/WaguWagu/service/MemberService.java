package com.example.WaguWagu.service;

import com.example.WaguWagu.domain.Member;
import com.example.WaguWagu.dto.MemberRequestDto;
import com.example.WaguWagu.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void insert(MemberRequestDto memberRequestDto) {
//        getOriginalFilename는 확장자를 포함한 파일이름을 반환한다.
        String filename = memberRequestDto.getMemberProfile().getOriginalFilename();
//        memberProfile.getOriginalFilename();
//        확장자가
        if (!filename.isEmpty()) {
            return;
        } else if (filename != null && !filename.matches(".*\\.(jpg|jpeg|png)$")) {
            throw new IllegalArgumentException("파일 형식은 jpg, jpeg, png만 가능합니다.");
        }
    }
}
