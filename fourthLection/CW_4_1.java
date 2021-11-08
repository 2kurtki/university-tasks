package fourthLection;

import java.util.*;

public class CW_4_1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();

        while (true){

            System.out.print("Enter student's name: ");
            String name = in.next();
            System.out.print("Enter student's age: ");
            int age = in.nextInt();
            System.out.print("Enter student's average score: ");
            int averageScore = in.nextInt();

            Student student = new Student(name, age, averageScore);
            studentsList.add(student);

            System.out.println("Do you want to continue? (y/n)");
            String answer = in.next();

            if ( !(answer.equals("y") | answer.equals("n")) ) {
                System.out.println("Wrong input. Try again.");
            } else if( answer.equals("n") ) {
                break;
            }
        }

        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i1 = o1.getAverageScore();
                int i2 = o2.getAverageScore();
                return (Integer.compare(i2, i1));
            }
        });

        Student theBestStudent = studentsList.get(0);
        System.out.println("The student with the highest average score:");
        System.out.println("Name: " + theBestStudent.getName());
        System.out.println("Age: " + theBestStudent.getAge());
        System.out.println("Average score: " + theBestStudent.getAverageScore());
    }
}

class Student {

    private String name;
    private int age;
    private int averageScore;

    Student(String name, int age, int averageScore){
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getAverageScore(){
        return this.averageScore;
    }

}