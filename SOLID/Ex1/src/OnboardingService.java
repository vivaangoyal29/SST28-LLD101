import java.util.*;

public class OnboardingService {
    private final Database db;

    public OnboardingService(Database db, Parse parser, Validation validator) { this.db = db; }

    // Intentionally violates SRP: parses + validates + creates ID + saves + prints.
    public void registerFromRawInput(String raw) {
        ConsolePrinter.printInput(raw);

        Map<String, String> kv=Parse.parsing(raw);

        String name = kv.getOrDefault("name","");
        String email = kv.getOrDefault("email", "");
        String phone = kv.getOrDefault("phone", "");
        String program = kv.getOrDefault("program", "");

        // validation inline, printing inline
        List<String> errors = Validation.validate(name, email, phone, program);
        if (!errors.isEmpty()) {
            ConsolePrinter.printError(errors);
            return;
        }

        String id = IdUtil.nextStudentId(db.count());
        StudentRecord rec = new StudentRecord(id, name, email, phone, program);

        db.save(rec);

        ConsolePrinter.printSuccess(rec, db.count());
        ConsolePrinter.printDbDump(db);
    }
}
