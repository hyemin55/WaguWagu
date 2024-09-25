package com.example.WaguWagu.repository;

import com.example.WaguWagu.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findBymemberProfile(MultipartFile memberProfile);
}
