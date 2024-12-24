import java.time.LocalDate;
public class Admin extends User {
    public Admin (String name,int year,int month,int day) {
        super (name,year,month,day);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("Birthday: " + getDob());
            System.out.println("User type: admin");
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }

    }

    public void displayHappyBirthday() {
        LocalDate today = LocalDate.now(); // ไว้หาปีปัจจุบัน
        int age = today.getYear() - getDob().getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }  else {
            System.out.println("Today is not " + getName() + "'s birthday! You are " + age );
        }
    }
}