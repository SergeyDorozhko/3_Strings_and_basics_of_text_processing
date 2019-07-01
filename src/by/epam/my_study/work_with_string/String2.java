package by.epam.my_study.work_with_string;

/*
В строке вставить после каждого сивола а символ b
 */
public class String2 {
    public static void main(String[] args){
        String text = "Returns the string representation of a specific subarray of the char array argument.";

        System.out.println(text.replaceAll("a", "ab"));
    }
}
