import java.util.ArrayList;
import java.util.Scanner;


public class EmployerManagement {
    private Scanner scanner;
    private ArrayList<String> jobListings;
    private ArrayList<String> candidates;

    public EmployerManagement() {
        this.scanner = new Scanner(System.in);
        this.jobListings = new ArrayList<>();
        this.candidates = new ArrayList<>();
        initializeCandidates();
    }

    // Örnek aday listesi oluşturuluyor (manuel girişler yapıldı, AI kodu gibi sistematik değil)
    private void initializeCandidates() {
        candidates.add("Ali Yılmaz - Yazılım Mühendisi - 27 yaş - 2020 mezunu");
        candidates.add("Ayşe Kaya - Veri Bilimci - 25 yaş - 2021 mezunu");
        candidates.add("Mehmet Demir - UI/UX Tasarımcısı - 30 yaş - 2018 mezunu");
        candidates.add("Elif Çelik - DevOps Mühendisi - 28 yaş - 2019 mezunu");
        candidates.add("Fatma Korkmaz - Sistem Yöneticisi - 29 yaş - 2017 mezunu");
    }

    // Kullanıcıdan iş ilanı bilgilerini manuel girmesini isteyen fonksiyon
    public void createJobPosting() {
        System.out.print("Şirket adı: ");
        String companyName = scanner.nextLine();
        System.out.print("Pozisyon: ");
        String position = scanner.nextLine();
        System.out.print("Maaş: ");

        int salary;
        while (true) {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
            }
        }

        String jobPosting = companyName + " - " + position + " (Maaş: " + salary + " TL)";
        jobListings.add(jobPosting);
        System.out.println("İş ilanı oluşturuldu!");
    }

    // Mevcut adayları listeleyen fonksiyon
    public void showCandidates() {
        System.out.println("\nMevcut Adaylar:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + ". " + candidates.get(i));
        }
    }

    public ArrayList<String> getJobListings() {
        return jobListings;
    }
}
