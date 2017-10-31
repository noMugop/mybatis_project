package update;

import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import greeting.Greeting;

public class mybatisUpdate {
	public static void main(String args[]) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter new greeting : ");
		String input = scanner.nextLine();

		System.out.println("New greeting = " + input);
		System.out.println("____________________________________\n");
		scanner.close();

		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		// select a particular Greeting using id
		Greeting greeting = (Greeting) session.selectOne("Greeting.getById", 1);

		// Set new values to the mail and phone number of the Greeting
		greeting.setGreeting(input);

		// Update the Greeting record
		session.update("Greeting.update", greeting);
		System.out.println("Record updated successfully");
		System.out.println("____________________________________\n");
		session.commit();
		// session.close();

		// verifying the record
		Greeting std = (Greeting) session.selectOne("Greeting.getById", 1);
		System.out.println("Details after update operation : " + std);
		session.commit();
		session.close();
	}
}
