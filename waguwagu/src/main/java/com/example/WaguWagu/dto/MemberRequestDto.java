package com.example.WaguWagu.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
public class MemberRequestDto {

    private Long memberIdx;

    @Length(min = 5, max = 20)
    private String memberId;

    @Length(min = 2, max = 20)
    private String memberName;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,20}$",
            message = "비밀번호는 8자 이상 20자 이하이며, 영문자, 숫자, 특수문자를 각각 하나 이상 포함해야 합니다.")
    // 예외 생성을 통한 비밀번호 강도 검증(동일 문자 포함, 아이디와 이메일과 비슷한 비밀번호 등)이 좋을 듯 Pattern은 임시
    @Length(min = 8, max = 20)
    private String memberPassword;

    @NotEmpty
    private String memberEmail;

    @NotEmpty
    private String memberPhone;

    private int memberAge;

    private String memberGender;

    private MultipartFile memberProfile;

    @NotEmpty
    private String memberNickname;

    private int memberRole;

    private LocalDateTime memberCreDate;

    private int memberLogType;


}
