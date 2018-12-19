package Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class SerialziationTest {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		System.out.println("Serialization starts");
		Emp e  = new Emp("Ravi",100);
		FileOutputStream fos = new FileOutputStream("ser.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		System.out.println("Deserialization starts");
		FileInputStream fis = new FileInputStream("ser.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e1 = (Emp)ois.readObject();
		System.out.println("employee id:" +e1.getId());
		
		

		

	}

}
