package view;

import java.util.Scanner;

import biz.StudentBiz;

public class MainUI {
	
	public static void show() {
		
		System.out.println("欢迎使用学生选课系统");
		System.out.println("1-注册；2-修改密码；3-选课；4-登录；0-退出");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		
		case "1":
			RegisterUI.show();
			break;
		case "2":
			ModifyPasswordUI.show();
			break;
		case "3":
			CourseSelection.show();
			break;
		case "4":
			LoginUI.show();
			break;
		case "0":
			System.out.print("已退出");
			break;
		}
	}
}
