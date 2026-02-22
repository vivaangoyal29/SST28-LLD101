public class Demo01 {
    public static void main(String[] args) {
        System.out.println("=== Student Onboarding ===");
        Parse parser=new Parse();
        ProgramList programList=new ProgramList();
        Database db = new FakeDb();
        programList.add("CSE");
        Validation validator=new Validation(programList);
        OnboardingService svc = new OnboardingService(db, parser, validator);

        String raw = "name=Riya;email=riya@sst.edu;phone=9876543210;program=CSE";
        svc.registerFromRawInput(raw);

        String raw2 = "name=Vivaan;email=vivaan@sst.edu;phone=8358923423;program=IT";
        svc.registerFromRawInput(raw2);
    }
}
