package by.epam.my_study.work_with_string_as_with_array_of_char;

public class String4 {
    /*
    В строке найти количество чисел
     */

    public static void main(String[] args){
        String line = "0adsas 5115 d5531dsfdfmsdc464lm5   k44";
        String[] numberArray = line.split("\\D");

        int countNumbers = 0;
        for(int i = 0; i < numberArray.length; i++ ){
            if(numberArray[i].length() > 0){
                countNumbers++;
            }
        }

        System.out.println("result: " + countNumbers);
    }

}
