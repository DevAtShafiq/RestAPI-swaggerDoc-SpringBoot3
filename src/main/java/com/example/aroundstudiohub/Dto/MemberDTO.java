package com.example.aroundstudiohub.Dto;


import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String name;
    private String email;
    private String organization;
}
