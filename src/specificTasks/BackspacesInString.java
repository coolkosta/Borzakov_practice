package specificTasks;

public class BackspacesInString {
    public String cleanString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '#'){
                if(!stringBuilder.isEmpty()){
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
// https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/java