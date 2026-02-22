public class AttendanceRules implements EligibilityRules {

    private int minAttendance;
    AttendanceRules(int minAttendance){
        this.minAttendance = minAttendance;
    }

    @Override
    public String evaluate(StudentProfile profile){
        if(profile.attendancePct < minAttendance){
            return "attendance below " + minAttendance;
        }
        return null;
    }
}
