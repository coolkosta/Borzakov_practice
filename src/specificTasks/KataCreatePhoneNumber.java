package specificTasks;

public class KataCreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return String.format(
                "(%1$d%2$d%3$d) %4$d%5$d%6$d-%7$d%8$d%9$d%10$d",
                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}
// https://www.codewars.com/kata/525f50e3b73515a6db000b83/java