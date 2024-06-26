package com.example.aroundstudiohub.Controller;

import com.example.aroundstudiohub.Dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping(value = "/default")
    public String putMethod() {
        return "Hello world";
    }


    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(
                map_elements -> {
                    sb.append(map_elements.getKey() + " : " + map_elements.getValue());
                }
        );

        return sb.toString();
    }


    @PutMapping(value = "/member1")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping(value = "/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }


}
