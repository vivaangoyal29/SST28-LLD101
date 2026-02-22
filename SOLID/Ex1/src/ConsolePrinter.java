import java.util.*;

public class ConsolePrinter {
    public static void printInput(String raw){
        System.out.println("INPUT: " + raw);
    }
    public static void printSuccess(StudentRecord rec, int total){
        System.out.println("OK: created student " + rec.id);
        System.out.println("Saved. Total students: " + total);
        System.out.println("CONFIRMATION:");
        System.out.println(rec);
    }
    public static void printDbDump(Database db){
        System.out.println();
        System.out.println("--DB DUMP--");
        System.out.println(TextTable.render3(db));
    }
    public static void printError(List<String> errors) {
        System.out.println("ERROR: cannot register");
        for (String e : errors) System.out.println("- " + e);
    }
}
