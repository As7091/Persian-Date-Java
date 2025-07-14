package ir.reyminsoft;

public class Main {
    public static void main(String[] args) {
        System.out.println(new PersianCalendar(System.currentTimeMillis()).toStringDateTimeYYYYMMDD_HHMMSS());
        System.out.println(new PersianCalendar(System.currentTimeMillis()).getStartOfTheMonth().toStringDateTimeYYYYMMDD_HHMMSS());
    }
}
