import java.util.*;
public class Validation {
    static ProgramList programList;
    Validation(ProgramList programList){
        this.programList = programList;
    }
    public static List<String> validate(String name, String email, String phone, String program){
        List<String> errors = new ArrayList<>();
        if (name.isBlank()) errors.add("name is required");
        if (email.isBlank() || !email.contains("@")) errors.add("email is invalid");
        if (phone.isBlank() || !phone.chars().allMatch(Character::isDigit)) errors.add("phone is invalid");
        if(program.isBlank()) errors.add("Program is invalid");
        else if(!programList.contains(program))  errors.add("Program does not exist");
        return errors;
    }
}
