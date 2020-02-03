package com.paypal.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//First run the program to generate the serialization file
//Next uncomment the 5 files for deserialization
//If you change the value of the serialVersionUID during 
//Deserialization then you will get classCastException. 
public class SerializationExample {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fileOutputStream = new FileOutputStream("Ravi.Ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(new Serial(1, "Ravi"));
		
//		FileInputStream fileInputStream = new FileInputStream("Ravi.Ser");
//		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//		Serial serial = (Serial)objectInputStream.readObject();
//		
//		System.out.println("Value of the id:::::" + serial.getId());
//		System.out.println("Value of the name:::" + serial.getName());
	}
}