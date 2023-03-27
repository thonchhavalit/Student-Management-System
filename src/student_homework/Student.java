package student_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String classroom;
    private double score;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setScore(double score) {
        this.score = score;
    }

    Student() {
        id = 0;
        name = null;
        gender = null;
        age = 0;
        classroom = null;
        score = 0;
    }

    public Student(int id, String name, String gender, int age, String classroom, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classroom = classroom;
        this.score = score;
    }

    void inputStudent(Scanner input) {
        System.out.println("============================ENTER STUDENT INFO============================");
        boolean valueId = false;
        String strId;
        do {
            System.out.print("Enter ID : ");
            try {
                strId = input.next();
                id = Integer.parseInt(strId);
                if (Integer.parseInt(strId) < 0) {
                    throw new InputMismatchException("ID Can't Be Negative Numbers! ");
                }
                valueId = true;
            } catch (Exception e) {
                System.out.println("ID Must Be Integer!!");
            }
        } while (!valueId);
        input.nextLine();
        System.out.print("Enter Student Name : ");
        name = input.nextLine();
        boolean validGender = false;
        while (!validGender) {
            try {
                System.out.print("Enter Student Gender (M/F): ");
                gender = input.nextLine();
                if (gender.equals("M") || gender.equals("F"))
                    validGender = true;
                else
                    throw new InputMismatchException("only 'F' or 'M' are allow!");
            } catch (InputMismatchException e) {
                System.out.println("Value Input Is Invalid! Please Enter Gender Again!!");
            }
        }
        boolean validAge = false;
        while (!validAge) {
            try {
                System.out.print("Enter Student Age: ");
                age = input.nextInt();
                validAge = true;
            } catch (InputMismatchException e) {
                System.out.println("Value Input Is Invalid! Please Enter Age Again!!");
                input.nextLine();
            }
        }

        input.nextLine();
        boolean validClassromm = false;
        while (!validClassromm) {
            try {
                System.out.print("Enter Student Class Room : ");
                classroom = input.next();
                validClassromm = true;
            } catch (InputMismatchException e) {
                System.out.println("Value Input Is Invalid! Please Enter ClassRoom!!");
            }
        }
        boolean valueScore = false;
        String strScore;
        do {
            System.out.print("Enter Student Score :");
            try {
                strScore = input.next();
                score = Double.parseDouble(strScore);
                valueScore = true;
            } catch (Exception e) {
                System.out.println("Score Can't Be String..!");
            }
        } while (!valueScore);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getClassroom() {
        return classroom;
    }

    public double getScore() {
        return score;
    }


    //Output Value Student
    void outputStudent() {
        System.out.println("Student ID          : " + getId() );
        System.out.println("Student Name        : " + getName());
        System.out.println("Student Gender      : " + getGender());
        System.out.println("Student Age         : " + getAge());
        System.out.println("Student ClassRoom   : " + getClassroom());
        System.out.println("Student Score       : " + getScore());
    }
    void updateStudent(Scanner input){
        System.out.print("Enter New Student Update Name :");
        name=input.next();
        boolean validGender = false;
        while (!validGender) {
            try {
                System.out.print("Enter Student Gender (F/M): ");
                gender = input.next();
                if (gender.equals("F") || gender.equals("M"))
                    validGender = true;
                else
                    throw new InputMismatchException("only 'F' or 'M' are allow!");
            } catch (InputMismatchException e) {
                System.out.println("Value Input Is Invalid! Please Enter Gender Again!!");
            }
        }
        boolean valueAge= false;
        String strAge;
        do{
            System.out.print("Enter New Student Age To Update : ");
            try {
                strAge=input.next();
                age=Integer.parseInt(strAge);
                if(age>0){
                    valueAge=true;
                }else{
                    System.out.println("Value Input Is Invalid! Please Enter ID Again!!");
                }
            }catch (Exception e){
                System.out.println(" Age Must Be Integer..!");
            }
        }while (!valueAge);
        input.nextLine();
        System.out.print("Enter New Student Class Room To Update :");
        classroom=input.next();
        boolean valueScore= false;
        String strScore;
        do{
            System.out.print("Enter New Student Score To Update  :");
            try {
                strScore=input.next();
                score=Double.parseDouble(strScore);
                if(score>0){
                    valueScore=true;
                }else{
                    System.out.println("Value Input Is Invalid!! Please Enter Score Again!!");
                }
            }catch (Exception e){
                System.out.println("Score Can't Be String..!");
            }
        }while (!valueScore);
    }

    void pressKey() {
        Scanner input = new Scanner(System.in);
        System.out.println("===========================PRESS 'ENTER' TO BE CONTINUE===========================");
        input.nextLine();
    }
}