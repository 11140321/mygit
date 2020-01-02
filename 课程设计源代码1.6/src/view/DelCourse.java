package view;
import biz.*;
import java.util.Scanner;

public class DelCourse {

	public static void show() {
		// TODO Auto-generated method stub
		System.out.println("你已经选择的课程");
		SCBiz csBiz = new SCBiz();
		csBiz.bianli();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要退选课程编号");
		String courseNo = scanner.nextLine();
		csBiz.DelCourse(courseNo);
		
	}
}
