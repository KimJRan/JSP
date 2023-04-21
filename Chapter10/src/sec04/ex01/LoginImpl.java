package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class LoginImpl implements HttpSessionBindingListener {
	String user_id;
	String user_pwd;
	static int total_user = 0;		//세션에 바인딩 시 1씩 증가시킨다.
	public LoginImpl() {
		
	}
	
	public LoginImpl(String user_id, String user_pwd) {
		this.user_id = user_id;
		this.user_pwd = user_pwd;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("사용자 접속");
		++total_user;
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("사용자 접속 해제");
		total_user--;
	}
	
	
}
