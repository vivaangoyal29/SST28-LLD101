public class creditsRules implements EligibilityRules{
    private int minCredits;

    creditsRules(int minCredits){
        this.minCredits = minCredits;
    }
    @Override
    public String evaluate(StudentProfile profile){
        if(profile.earnedCredits< minCredits){
            return "credits below "+ minCredits;
        }
        return null;
    }
}
