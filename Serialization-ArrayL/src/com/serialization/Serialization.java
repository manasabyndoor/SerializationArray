//serialization
package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {
	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>();

		// creating objects
		MyClass m1 = new MyClass(101, "manasa", 20000);
		MyClass m2 = new MyClass(102, "manu", 20000);
		MyClass m3 = new MyClass(103, "naksha", 560000);

		// adding to list
		list.add(m1);
		list.add(m2);
		list.add(m3);
		try {
			FileOutputStream fos = new FileOutputStream("list.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("Successful");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
