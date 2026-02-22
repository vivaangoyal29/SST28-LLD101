public class DisciplinaryRule implements EligibilityRules{

    @Override
    public String evaluate(StudentProfile profile){
        if(profile.disciplinaryFlag!=LegacyFlags.NONE){
            return "disciplinary flag present";
        }
        return null;
    }
}
