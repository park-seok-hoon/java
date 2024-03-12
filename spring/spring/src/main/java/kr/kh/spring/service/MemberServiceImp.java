package kr.kh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.MemberDAO;

@Service //@service가 있어야 멤버서비스 자동 추가
public class MemberServiceImp implements MemberService {
	
	@Autowired
	private MemberDAO memberDao;

	@Override
	public int testCountMember() {
		return memberDao.selectMemberCount();
	}
	

}
