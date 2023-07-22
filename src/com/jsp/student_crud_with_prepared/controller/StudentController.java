package com.jsp.student_crud_with_prepared.controller;

import com.jsp.student_crud_with_prepared.service.StudentService;
import com.jsp.student_crud_with_prepared.dto.Student;
import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("main method started!!!");

		Student student = null;

		StudentService studentService = new StudentService();

		System.out.println("main method ended!!!");
		System.out.println("1.Insert\n2.Update\n3.Display");
		System.out.println("Enter your option");
		int ch = sc.nextInt();
		switch (ch) {
		/*
		 * case 1 for insertion data
		 */

		case 1: {
			System.out.println("Enter student id");
			int id = sc.nextInt();
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter student email");
			String email = sc.next();
			System.out.println("Enter student phone");
			long phone = sc.nextLong();

			student = new Student(id, name, email, phone);
			studentService.insertStudentService(student);

		}
			break;

		case 2: {
//			case 2 for update of data

			System.out.println("1. Name\n2. Email\n3. Phone");
			System.out.println("please choose your option to update your data");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1: {
				System.out.println("Enter the user id");
				int id = sc.nextInt();
				System.out.println("Enter the student Name");
				String name = sc.next();
				int id1 = studentService.updateStudentNameService(id, name);
				if (id1 == 1) {
					System.out.println("Data---Updated");
				} else {
					System.out.println("Id not found please check once");
				}
			}

				break;
			case 2: {
				System.out.println("first create method");
			}
				break;
			case 3: {
				System.out.println("first create method");
			}
				break;
			}
		}
			break;
		case 3: {
			studentService.displayStudentDetails();
		}
			break;
		}
	}
}
