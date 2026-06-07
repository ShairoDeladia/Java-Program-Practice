
public class Practice{
    public static void main(String[] args){
        String day = "monday";
        String whatDay = switch (day) {
            case "monday","tuesday","wednesday","thursday","friday" -> "Week day.";
            case "saturday","sunday" -> "Week end.";
            default -> "Not a day";
        };
        System.out.println(whatDay);
    }
}