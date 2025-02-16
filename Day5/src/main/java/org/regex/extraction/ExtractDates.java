package java.org.regex.extraction;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6️⃣ Extract Dates in dd/mm/yyyy Format
//🔹 Example Text:
//        "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
//        🔹 Expected Output:
//        12/05/2023, 15/08/2024, 29/02/2020
public class ExtractDates {
    ArrayList<String> ans = new ArrayList<>();
    void validate(String input){
//        12/05/2023, 15/08/2024, 29/02/2020
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()){
            this.ans.add(m.group());
        }
    }
    public static void main(String[] args) {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ExtractDates vu = new ExtractDates();
        vu.validate(input);
        System.out.println(vu.ans);
    }
}
