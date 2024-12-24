import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name,int year,int month,int day ){
        this.name = name;
        LocalDate today = LocalDate.now();
        if(year > today.getYear() || month <= 0 || month > 12){
            System.out.println("Invalid year or month");
            this.dob = LocalDate.now();
        }
        else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31){
            System.out.println("Invalid day. This month has only 31 days");
            this.dob = LocalDate.now();
        }
        else if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            System.out.println("Invalid day. This month has only 30 days");
            this.dob = LocalDate.now();
        }
        else if(month == 2 && (day > 29 || (day == 29 && !LocalDate.of(year, 2, 29).isLeapYear()))){ // เงื่อนไขนี้ถาม chatgpt สำหรับเคสที่เดือนกุมภาพันธ์บางปีมี 29 เดือน
            System.out.println("Invalid day. This month has only 28/29 days");
            this.dob = LocalDate.now();
        }
        else
            this.dob = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    public void displayInfo() {
        System.out.println(name +" was born on " + dob);
    }

    public boolean isBirthday(){
        LocalDate today = LocalDate.now(); // ไว้หาวันเดือนปัจจุบัน
        if(today.getMonth() == dob.getMonth()&&today.getDayOfMonth() == dob.getDayOfMonth()){ // ใช้.getMonth() กับ.getDayOfMonth() ตาม method ของ LocalDate
            return true;
        } else {
            return false;
        }
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
        else
            System.out.println("Today is not " + this.name + "'s birthday!");
    }
}
