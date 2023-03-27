package student_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int op=0;
        do{
            System.out.println("============================STUDENT MANAGEMENT SYSTEM============================");
            System.out.println("1. Insert Student To System");
            System.out.println("2. Edit   Student Information");
            System.out.println("3. Search Student Information");
            System.out.println("4. Delete Student Information");
            System.out.println("5. Show   Student Information");
            System.out.println("6. Exit..!");
            System.out.println("==================================================================================");
            boolean valueManu=false;
            String strManu;
            do {
                System.out.print("Please Choose Option (1-6) :");
                try {
                    strManu=sc.next();
                    op=Integer.parseInt(strManu);
                    valueManu=true;
                } catch (Exception e) {
                    System.out.println("Value Input Is Invalid! Choose Again!!");
                }
            }while (!valueManu);

            switch (op){
                //Add Student Information
                case 1:{
                    Student student = new Student();
                    student.inputStudent(sc);
                    arr.add(student);
                    student.pressKey();
                }break;
                //Update Student Information
                case 2:{
                    Student student = new Student();
                    System.out.println("============================EDIT STUDENT INFO============================");
                    boolean editId= false;
                    String strId;
                    int editValueId=0;
                    do{
                        System.out.print("Enter Student ID To Edit :");
                        try {
                            strId=sc.next();
                            editValueId=Integer.parseInt(strId);
                            editId=true;
                        }catch (Exception e){
                            System.out.println("Student ID Must Be Integer!!");
                        }
                    }while (!editId);
                    boolean checked=false;
                    for (int i=0;i< arr.size();i++){
                        if(editValueId==arr.get(i).getId()){
                            System.out.print("Student ID :"+arr.get(i).getId());

                            student.setId(arr.get(i).getId());
                            student.updateStudent(sc);
                            arr.set(i,student);
                            System.out.println("Student Info Updated Successfully");
                            checked=true;
                        }
                    }
                    if(checked==false){
                        System.out.println("Student ID "+editValueId+" NOT FOUND!!");
                    }
                    student.pressKey();
                }break;

                case 3:{
                    int searchOption=0;
                    if (arr.size()>0) {
                        do {
                            Student student = new Student();
                            System.out.println("============================SEARCH STUDENT INFO============================");
                            System.out.println("1. Search By Id");
                            System.out.println("2. Search By Name");
                            System.out.println("3. Search By Gender");
                            System.out.println("4. Search By ClassRoom");
                            System.out.println("5. Exit");
                            System.out.println("============================================================================");
                            boolean valueSearch = false;
                            String strSearch;
                            do {
                                System.out.print("Please Choose Option (1-5) :");
                                try {
                                    strSearch = sc.next();
                                    searchOption = Integer.parseInt(strSearch);
                                    valueSearch = true;
                                } catch (Exception e) {
                                    System.out.println("Value Input Is Invalid! Choose Again!! ");
                                }
                                switch (searchOption) {
                                    case 1: {
                                        System.out.println("============================Search By Id============================");
                                        int studentId = 0;
                                        boolean valueID = false;
                                        String sValueId;
                                        boolean studentValueId = false;
                                        do {
                                            System.out.print("Enter ID For Search :");
                                            try {
                                                sValueId = sc.next();
                                                studentId = Integer.parseInt(sValueId);
                                                studentValueId = true;
                                            } catch (Exception e) {
                                                System.out.println("ID Must Be Integer!!");
                                            }
                                        } while (!studentValueId);
                                        int num = 0;
                                        for (int i = 0; i < arr.size(); i++) {
                                            if (studentId == arr.get(i).getId()) {
                                                System.out.println("============================Student Information :" + (num + 1) + "============================");
                                                arr.get(i).outputStudent();
                                                valueID = true;
                                                num++;
                                            }
                                        }
                                        if (valueID == false) {
                                            System.out.println("Student Information NOT FOUND!!");
                                        }
                                        student.pressKey();
                                    }
                                    break;
                                    case 2: {
                                        System.out.println("============================Search By Name============================");
                                        String s_name;
                                        boolean valueName = false;
                                        System.out.print("Enter Name For Search :");
                                        s_name = sc.next();
                                        int num = 0;
                                        for (int i = 0; i < arr.size(); i++) {
                                            if (s_name.equalsIgnoreCase(arr.get(i).getName())) {
                                                System.out.println("============================Student Information :" + (num + 1) + "============================");
                                                arr.get(i).outputStudent();
                                                valueName = true;
                                                num++;
                                            }
                                        }
                                        if (valueName == false) {
                                            System.out.println("Student Information NOT FOUND!!");
                                        }
                                        student.pressKey();
                                    }
                                    break;
                                    case 3: {
                                        System.out.println("============================Search By Gender============================");
                                        String studentGender;
                                        boolean valueGender = false;
                                        System.out.print("Enter Gender For Search :");
                                        studentGender = sc.next();
                                        int num = 0;
                                        for (int i = 0; i < arr.size(); i++) {
                                            if (studentGender.equalsIgnoreCase(arr.get(i).getGender())) {
                                                System.out.println("============================Student Information :" + (num + 1) + "============================");
                                                arr.get(i).outputStudent();
                                                valueGender = true;
                                                num++;
                                            }
                                        }
                                        if (valueGender == false) {
                                            System.out.println("Student Information NOT FOUND!!");
                                        }
                                        student.pressKey();
                                    }
                                    break;
                                    case 4: {
                                        System.out.println("============================Search By ClassRoom============================");
                                        String studentClass;
                                        boolean valueClass = false;
                                        System.out.print("Enter ClassRoom For Search :");
                                        studentClass = sc.next();
                                        int num = 0;
                                        for (int i = 0; i < arr.size(); i++) {
                                            if (studentClass.equalsIgnoreCase(arr.get(i).getClassroom())) {
                                                System.out.println("============================Student Information :" + (num + 1) + "============================");
                                                arr.get(i).outputStudent();
                                                valueClass = true;
                                                num++;
                                            }
                                        }
                                        if (valueClass == false) {
                                            System.out.println("Student Information NOT FOUND!!");
                                        }
                                        student.pressKey();
                                    }
                                    break;
                                    case 5:{

                                    }break;
                                    default: {
                                        System.out.println("Value Input Is Invalid! Choose Again (1-5)!!");
                                        student.pressKey();
                                    }
                                    break;
                                }
                            } while (!valueSearch);
                        } while (searchOption!=5);
                    }else {
                        Student student = new Student();
                        System.out.println("No Student For Search!!");
                        student.pressKey();
                    }
                }break;
                //Delete Student Information
                case 4:{
                    Student student=new Student();
                    System.out.println("============================Delete Student Information============================");
                    int deleteId=0;
                    boolean valueDelete=false;
                    boolean checked=false;
                    String strId;
                    do {
                        System.out.print("Enter Student ID to Delete :");
                        try {
                            strId=sc.next();
                            deleteId=Integer.parseInt(strId);
                            checked=true;
                        }catch (Exception e){
                            System.out.println("ID Must Be Integer!!");
                        }
                    }while (!checked);
                    for (int i=0;i<arr.size();i++){
                        if(deleteId==arr.get(i).getId()){
                            arr.remove(i);
                            System.out.println("Student ID of "+deleteId+" has been removed!!");
                            valueDelete=true;
                        }
                    }
                    if(valueDelete==false){
                        System.out.println("Student ID of "+deleteId+" NOT FOUND!!");
                    }
                    student.pressKey();
                }break;

                case 5:{
                    System.out.println("============================Show Student Information============================");
                    Student student = new Student();
                    for(int i=0;i< arr.size();i++){
                        arr.get(i).outputStudent();
                    }
                    student.pressKey();
                }break;

                case 6:{


                }break;

                default:{
                    System.out.println("Option Invalid!! Please Choose Again (1-6) !!");
                    Student student = new Student();
                    student.pressKey();
                }break;
            }
        }while(op!=6);
    }
}