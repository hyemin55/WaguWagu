package com.example.WaguWagu.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberIdx;

    @Column(name = "m_id", unique = true, nullable = false, length = 20)
    private String memberId;

    @Column(nullable = false, length = 20)
    private String memberName;

    @Column(nullable = false, length = 20)
    private String memberPassword;

    @Column(unique = true, length = 100)
    @Email
    private String memberEmail;

    @Column(unique = true)
    private String memberPhone;

    private int memberAge;

    private String memberGender;

//    @Column(columnDefinition = "TEXT")
    private MultipartFile memberProfile;

    @Column(nullable = false, unique = true)
    private String memberNickname;

    private int memberRole;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime memberCreDate;

    private int memberLogType;


}