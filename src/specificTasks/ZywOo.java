package specificTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZywOo {
    public static boolean validateUsr(String s) {
        String regex = "^[a-z0-9_]{4,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
}

// https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023