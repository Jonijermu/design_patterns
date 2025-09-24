public class Main {

    public static void main(String[] args) {
     NewDateInterface date = new CalenderToNewDateAdapter();
     date.setYear(2025);
     date.setMonth(9);
     date.setDay(24);

     System.out.println("Today: "+date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
     date.advanceDays(10);
        System.out.println("10 days later the date is: " +
                date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
