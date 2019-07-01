package by.epam.my_study.work_with_string_as_with_array_of_char;

public class String3 {
    /*
    В строке найти количество цифр
     */
    public static void main(String[] args){
        String line = "jksdfj1456fs641fds12131sfd111d2f1";

        System.out.println(countDigit(line));
    }

    public static int countDigit(String line){
        char [] lineElements = line.toCharArray();
        int countDigit = 0;
        for (int i = 0; i < lineElements.length; i++){
            if(Character.isDigit(lineElements[i])){
                countDigit++;
            }
        }
        return countDigit;
    }
}
