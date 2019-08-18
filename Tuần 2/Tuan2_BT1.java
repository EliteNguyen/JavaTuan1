//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 2 BT1
//Tao lop Hoc Sinh
package BTTuan2;
import java.io.*;
import java.util.Scanner;

class Student {
	private String ID;
	private String Name;
	private float AvgPoint;
	
	//Get ID
	public String getID() {
		return ID;
	} 
	//Set ID
	public void setID(String ID) {
		this.ID = ID;
	} 
	//Get Name
	public String getName() {
		return Name;
	} 
	//Set Name
	public void setName(String Name) {
		this.Name = Name;
	} 	
	//Get AvgPoint
	public float getAvgPoint() {
		return AvgPoint;
	} 
	//Set AvgPoint
	public void setAvgPoint(float AvgPoint) {
		this.AvgPoint = AvgPoint;
	} 
	public void Rank() {
		if(AvgPoint >= 8)
			System.out.println("Xep loai Gioi");
		else if(AvgPoint >=6.5)
			System.out.println("Xep loai Kha");
			else if(AvgPoint >=5)
				System.out.println("Xep loai Trung binh");
				else
					System.out.println("Xep loai yeu");
	}
	public void Input() {
		Scanner x = new Scanner(System.in);
		System.out.print("Input Student ID:");
		ID = x.nextLine();
		System.out.print("Input Student Name:");
		Name = x.nextLine();
		System.out.print("Input AvgPoint:");
		AvgPoint = x.nextFloat(); 
		}
	public void Output() {
		System.out.println("INFORMATION STUDENT");
		System.out.println("ID: " + ID);
		System.out.println("Name: " + Name);
		System.out.println("AvgPoint: " + AvgPoint);				
	}
}

class Demo1 {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		Student st = new Student();
		st.Input();
		st.Output();
		st.Rank();
		System.out.print("Input New Student: ");
		String NewStudent = x.nextLine();
		st.setName(NewStudent);
		System.out.println("Fix Name Student:" + st.getName());
	}
}