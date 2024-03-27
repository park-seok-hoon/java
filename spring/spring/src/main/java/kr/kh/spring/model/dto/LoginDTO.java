package kr.kh.spring.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTO {

	private String id;
	private String pw;
	private boolean autoLogin; //login.jsp autoLogin을 받을 변수
}