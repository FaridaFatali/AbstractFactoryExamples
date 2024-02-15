package university.solution1;

public class Test {
    public static void main(String[] args) {
        System.out.println("A University:");
        new Client(new AUniversityFactory());
        System.out.println("\nB University:");
        new Client(new BUniversityFactory());
    }
}
