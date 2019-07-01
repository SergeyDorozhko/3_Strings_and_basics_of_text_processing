package by.epam.my_study.work_with_string_as_with_array_of_char;

import java.util.Arrays;

public class String5 {
    /*
    удалить в строке все лишние пробелы, т.е. серии пдряд идущих пробелов заменить на одиночные. Крайние в строке удалить.
     */
    public static void main(String[] args){
        String line = "   What     a nice       day!   ";
        System.out.println(line);

        System.out.println(spaceDel(line));

    }

    public static String spaceDel(String text){
        char [] textElements = text.toCharArray();
        for (int i = 0; i < textElements.length; i++){

            if(i == 0 && textElements[i] == ' '){         //If line starts with space Del.
                textElements = Arrays.copyOfRange(textElements,i + 1, textElements.length - 1);
                i--;
                continue;
            }


            if(textElements[i] == ' ' && textElements[i - 1] == ' '){    //if find 2 space, space to the end.

                for (int j = i; j < textElements.length - 1; j++){
                   char forCopy = textElements[j];
                    textElements[j] = textElements[j + 1];
                    textElements[j + 1]= forCopy;
                }
            }

            if(textElements[textElements.length - 1] == ' '){   //if the last char is space remove it.
                textElements = Arrays.copyOf(textElements, textElements.length - 1);
                i--;
            }
        }

        return new String(textElements);
    }
}
