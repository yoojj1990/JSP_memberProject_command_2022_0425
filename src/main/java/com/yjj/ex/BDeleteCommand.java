package com.yjj.ex;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;

public class BDeleteCommand implements MCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletRequest response) {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		Member dao = new MemberDao();
		dao.deleteMember(id);
		
		
	}

}
