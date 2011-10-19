package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import Model.Employee;
import Model.Student;

public class InheritanceMain{

 public static void main(String[] args) throws 
 ParseException {
	Student s = new Student ();
	s.setNim("12101011");
	s.setNama("Dadang Iswanto");
	s.setAlamat("Jalan Taman Bunga No.2");
	s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse
	("20-06-1990"));
	s.setNoHp("081122334455");
	
	Employee e = new Employee ();
	e.setNip("21005648");
	e.setNama("Adi Sulistiono");
	e.setAlamat("Jl.Asem Jajar no.6");
	e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse
	("13-06-1986"));
	e.setNoHp("085210891465");
	
	showData(s);
	System.out.println("\n===============================\n");
	showData(e);
	}
	
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NIM: " + s.getNim());
		System.out.println("Nama: " + s.getNama());
		System.out.println("Alamat: " + s.getAlamat());
		System.out.println("Tgl Lahir: " + new
		SimpleDateFormat("dd-MMMM-yyyy").format
		(s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	
	static void showData (Employee e){
		System.out.println("ClassEmployee");
		System.out.println("NIP: " + e.getNip());
		System.out.println("Nama: " + e.getNama());
		System.out.println("Alamat: " + e.getAlamat());
		System.out.println("Tgl Lahir: " + new 
		SimpleDateFormat("dd-MMMM-yyyy").format
		(e.getTglLahir()));
		System.out.println("No HP: " + e.getNoHp());
	}
}
		