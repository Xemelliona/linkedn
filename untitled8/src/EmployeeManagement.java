import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private Scanner scanner;
    private Employee employee;

    public EmployeeManagement() {
        this.scanner = new Scanner(System.in);
        this.employee = new Employee();
    }

    public void setJobListings(ArrayList<String> jobListings) {
        for (String job : jobListings) {
            employee.addJobListing(job);
        }
    }

    public void jobList() {
        ArrayList<String> listings = employee.getJobListings();
        if (listings.isEmpty()) {
            System.out.println("Şu an için listelenmiş iş ilanı yok.");
        } else {
            System.out.println("Mevcut İş İlanları:");
            for (int i = 0; i < listings.size(); i++) {
                System.out.println((i + 1) + ". " + listings.get(i));
            }
        }
    }

    public void showEmployers() {
        ArrayList<String> employerListings = employee.getEmployerListings();
        System.out.println("\nMevcut İşverenler:");
        for (int i = 0; i < employerListings.size(); i++) {
            System.out.println((i + 1) + ". " + employerListings.get(i));
        }
    }

    public void manageJobs() {
        while (true) {
            System.out.println("\nBir seçenek belirleyin:");
            System.out.println("1. İş İlanlarını Görüntüle");
            System.out.println("2. Mevcut İşverenleri Görüntüle");
            System.out.println("3. Çıkış Yap");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Hata önlemek için ek satır okuma

            switch (choice) {
                case 1:
                    jobList();
                    break;
                case 2:
                    showEmployers();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lütfen geçerli bir seçenek girin!");
            }
        }
    }
}
