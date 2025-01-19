import java.util.ArrayList;
import java.util.Scanner;

 class Employee {
    private ArrayList<String> jobListings;
    private ArrayList<String> employerListings;

    public Employee() {
        this.jobListings = new ArrayList<>();
        this.employerListings = new ArrayList<>();
        initializeEmployers();
    }

    // Önceden tanımlı işverenleri ekleyen bir metot
    private void initializeEmployers() {
        employerListings.add("Aselsan - Yazılım Mühendisi (Maaş: 15.000 TL)");
        employerListings.add("Tusaş - Veri Bilimci (Maaş: 16.000 TL)");
        employerListings.add("Roketsan - DevOps Mühendisi (Maaş: 18.000 TL)");
    }

    public void addJobListing(String job) {
        jobListings.add(job);
    }

    public ArrayList<String> getJobListings() {
        return jobListings;
    }

    public ArrayList<String> getEmployerListings() {
        return employerListings;
    }

}
