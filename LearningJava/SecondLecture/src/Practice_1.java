public class Practice_1 {
    public static void main(String[] args) {

        int salary = 2000;
        if (salary > 1500) {
            salary = salary + 1000;
        } else {
            salary = salary + 500;
        }

        System.out.println("Salary with bonous: " + salary);

    }
}
