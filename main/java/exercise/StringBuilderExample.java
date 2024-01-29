package exercise;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder calendarBodyStringBuilder = new StringBuilder();

        calendarBodyStringBuilder.append("Monday: First day of the week\n");
        calendarBodyStringBuilder.append("Tuesday: Second day of the week\n");
        calendarBodyStringBuilder.append("Wednesday: Third day of the week\n");

        String calendarBodyString = calendarBodyStringBuilder.toString();
        System.out.println(calendarBodyString);

    }
}
