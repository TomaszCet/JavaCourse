package zadania.Map;

import java.util.Scanner;


public class CompannyApp {
    static Scanner sc = new Scanner(System.in);

    private Company getFirma() {
        return firma;
    }

    private Company firma;

    public CompannyApp() {
        this.firma = new Company();
    }

    public static void main(String[] args) {
        CompannyApp compannyApp = new CompannyApp();
        int option;
        do {
            System.out.println("Co chcesz zrobić: ");
            showOptions();
            option = sc.nextInt();
            sc.nextLine();
            Options chosenOption = Options.values()[option];
            switch (chosenOption){
                case ADD_EMPLOYEE:
                    compannyApp.addEmployee();
                    break;
                case GET_EMPLOYEE:
                    String choosenEmployee = compannyApp.getEmployee();
                    System.out.println(choosenEmployee);
                    break;
                case EXIT:
                    System.out.println("Thank you for choosing our system!");
                    break;
                default:
                    System.out.println("No such option");
            }
            System.out.println();
        } while ( option != 2);

    }

    private static void showOptions() {
        for (int i = 0; i< Options.values().length ; i++){
            System.out.println(i + " - " +Options.values()[i]);
        }
    }

    private String getEmployee(){
        System.out.println("Enter employee data:");
        StringBuilder fullName = new StringBuilder();
        System.out.println("Employee name");
        String name = sc.nextLine();
        fullName.append(name);
        fullName.append(" ");
        System.out.println("Employee surname");
        String surname = sc.nextLine();
        fullName.append(surname);
        return this.getFirma().getEmployee(fullName.toString());
    }

    private void addEmployee(){
        System.out.println("Add new employee to the system:");
        System.out.println("Employee name");
        String name = sc.nextLine();
        System.out.println("Employee surname");
        String surname = sc.nextLine();
        System.out.println("Employee salary");
        String salary = sc.nextLine();
        this.getFirma().addEmployee(new Employee(name, surname,Double.parseDouble(salary)));
    }
}
//    enum trzyma wartości po kolei i można się do nich dobrać jak do tablicy
//    numerowane od 0: values()[i]
    enum Options { ADD_EMPLOYEE, GET_EMPLOYEE, EXIT }


