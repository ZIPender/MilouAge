import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class main {
    public static void main(String[] args) {
        
        LocalDate targetDate = LocalDate.of(2023, 11, 22);

        
        LocalDate currentDate = LocalDate.now();

        
        long daysPassed = ChronoUnit.DAYS.between(targetDate, currentDate);

        daysPassed++;
        
        System.out.println("\r\n" + //
                        "   __  _________   ____  __  __\r\n" + //
                        "  /  |/  /  _/ /  / __ \\/ / / /\r\n" + //
                        " / /|_/ // // /__/ /_/ / /_/ / \r\n" + //
                        "/_/  /_/___/____/\\____/\\____/  \r\n" + //
                        "                               \r\n" + //
                        "");
        System.out.println("Aujourd'hui, Milou fete ses: " + daysPassed + " jours!\n");
    }
}
