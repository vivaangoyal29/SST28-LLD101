import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println("=== Placement Eligibility ===");
        RuleInput input = new RuleInput();
        List<EligibilityRules> rules = List.of(
                new AttendanceRules(input.minAttendance),
                new cgrRules(input.minCgr),
                new creditsRules(input.minCredits)
        );
        StudentProfile s = new StudentProfile("23BCS1001", "Ayaan", 8.10, 72, 18, LegacyFlags.NONE);
        EligibilityEngine engine = new EligibilityEngine(new FakeEligibilityStore(), rules);
        engine.runAndPrint(s);
    }
}
