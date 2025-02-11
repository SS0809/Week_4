package org.generics.resumescreeningsystem;

public class ResumeScreeningApp {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();
        Resume<SoftwareEngineer> resume1 = new Resume<>("Saurabh Saraswat", softwareEngineer);
        Resume<DataScientist> resume2 = new Resume<>("Nishant Kumar", dataScientist);
        Resume<ProductManager> resume3 = new Resume<>("Shreya Gupta", productManager);
        Resume<SoftwareEngineer> resume4 = new Resume<>("Pankaj Prajapati", softwareEngineer);

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(resume1);
        screeningSystem.addResume(resume2);
        screeningSystem.addResume(resume3);
        screeningSystem.addResume(resume4);
        screeningSystem.processResumes();
    }
}
