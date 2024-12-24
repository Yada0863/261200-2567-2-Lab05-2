public class Lab05 {
    public static void main(String[] args) {
        User john = new User("John",1954,12,22) ;
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas",2200,12,31);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
        System.out.println();

        john.displayHappyBirthday();
        nicolas.displayHappyBirthday();

    }
}