package com.yjj.ex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BDeleteCommand implements MCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		MemberDao dao = new MemberDao();
		dao.deleteMember(id);
		
		
	}

}
