/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

import java.util.Scanner;

/**
 *
This has been edited in github.com
*/
public class StudentList {

    /**
     */
    public static void main(String[] args) {
    //Scanner input = new Scanner(System.in);
    Student[] studentList = new Student[3];
    studentList[0] = new Student("s1", "Robert");
    studentList[1] = new Student("s2", "Rashed");
    studentList[2] = new Student("s3", "Het");
    
        for(int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getSname());
        }
    }
    
}
