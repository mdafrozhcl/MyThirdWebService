package com.afroz.webclient;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.afroz.third.StudentServiceStub.AddStudentResponse;
import com.afroz.third.StudentServiceStub;
import com.afroz.third.StudentServiceStub.AddStudent;

public class StudnetDetails extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//Student stud = (Student) session.getAttribute("student");
		StudentServiceStub stub = new StudentServiceStub();
		AddStudent add = new AddStudent();
		add.setO(session.getAttribute("student"));
		AddStudentResponse res = stub.addStudent(add);
		response.getWriter().print(res.get_return());
	}
}
