package by.epam.my_study.work_with_string;

/*
Вводится строка. Требуется удаить из нее повторяющиеся символы и все пробелы. Например из abc cde def получить abcdef
 */
public class String7 {
    public static void main(String[] args){
        StringBuilder line = new StringBuilder("abc cde def");

        System.out.println(spaceAndDoubleDel(line));
    }

    public static StringBuilder spaceAndDoubleDel(StringBuilder line){
        for(int i = 0; i < line.length(); i++){
            char isRepeat = line.charAt(i);
            for(int j = i + 1; j < line.length(); j++){
                if (isRepeat == line.charAt(j)){
                    line.deleteCharAt(j);
                    j--;
                }
            }
        }

        line.deleteCharAt(line.indexOf(" "));
        return line;
    }
}
