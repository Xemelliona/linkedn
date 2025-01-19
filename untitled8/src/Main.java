import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        EmployerManagement employerManagement = new EmployerManagement();

        while (true) {
            System.out.println("\nAna Menü");
            System.out.println("1. İş Arayan");
            System.out.println("2. İş Veren");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    employeeManagement.setJobListings(employerManagement.getJobListings());
                    employeeManagement.manageJobs();
                    break;
                case 2:
                    System.out.println("\nİşveren Paneli");
                    System.out.println("1. Yeni İş İlanı Ekle");
                    System.out.println("2. Mevcut Adayları Görüntüle");
                    System.out.print("Seçiminiz: ");

                    int employerChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (employerChoice == 1) {
                        employerManagement.createJobPosting();
                    } else if (employerChoice == 2) {
                        employerManagement.showCandidates();
                    } else {
                        System.out.println("Geçersiz seçim!");
                    }
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Yanlış giriş yaptınız!");
            }
        }
    }
}
