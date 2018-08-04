//Deserialization
package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desrialization {
	public static void main(String[] args) {
		ArrayList<MyClass> list;
		try {

			FileInputStream fis = new FileInputStream("list.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// objects to array list
			list = (ArrayList<MyClass>) ois.readObject();
			System.out.println(list);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
