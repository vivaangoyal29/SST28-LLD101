public class cgrRules implements EligibilityRules{
    private double minCgr;
    cgrRules(double cgr){
        this.minCgr=cgr;
    }
    @Override
    public String evaluate(StudentProfile profile){
        if(profile.cgr<minCgr){
            return "cgr below "+minCgr;
        }
        return null;
    }
}
