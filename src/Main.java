import std.Student;

public class Main {
    public static void main(String[] args) {
        Student stud= new Student();
        int[] list={44,90,55,73,88,22};
        System.out.println(stud.nAusreichend(list));
        System.out.println(stud.durchschnitt(list));
        System.out.println(stud.abgerundet(list));
        System.out.println(stud.maxi(list));
    }
}