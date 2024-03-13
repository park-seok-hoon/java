package kr.kh.spring.service;

import java.util.ArrayList;

import kr.kh.spring.model.dto.LoginDTO;
import kr.kh.spring.model.vo.BoardVO;
import kr.kh.spring.model.vo.MemberVO;
import kr.kh.spring.pagination.Criteria;

public interface MemberService {

	boolean insertMember(MemberVO member);

	MemberVO login(LoginDTO loginDto);


}