package method;

import fields.Member;

public class MemberService {

	private Member member;

	public void setMember(Member member) { // setter 메서드

		this.member = member;
	}

	public boolean login(String email, String pass) {
		// 이메일이 일치하는지 확인

		if (member.getEmail().equals(email)) {

			// 비밀번호 일치한지 확인
			if (member.getPass().equals(pass)) {
				return true;
			}
		}

		return false;
	}// 이메일이 일치하지 않은 상황 or 비밀번호 실패시 동작

}
