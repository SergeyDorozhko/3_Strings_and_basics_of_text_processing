package by.epam.my_study.work_with_string_as_with_array_of_char;

/*
Дан массив названий переменных в camalCase. Преобразовать названия в snake_case.
*/
public class String1 {

    public static void main(String[] args) {

        String [] camalCase = {"onoNameNumberSix", "dsfsdfDSfhg", "numberThreeWord"};

        for(String element : camalCase){
                System.out.println(toSnakeCase(element));
        }

    }





    public static String toSnakeCase(String camelCaseName){
        char[] arrayOfWordElements = camelCaseName.toCharArray();

        int countUpperCase = 0;
        for(int i = 0; i < arrayOfWordElements.length; i++){
            if(arrayOfWordElements[i] >= 32 && arrayOfWordElements[i] <= 90){
                countUpperCase++;
            }
        }



        char [] arrayWithUnderscoreAndToLowercase = new char[arrayOfWordElements.length + countUpperCase];

        for(int i = 0, j = i; i < arrayWithUnderscoreAndToLowercase.length; i++, j++){
            if(arrayOfWordElements[j] >= 32 && arrayOfWordElements[j] <= 90){
                arrayWithUnderscoreAndToLowercase[i] = '_';
                arrayOfWordElements[j] = (char) (arrayOfWordElements[j] + 32);
                i++;
            }

            arrayWithUnderscoreAndToLowercase[i] = arrayOfWordElements[j];
        }

        return new String(arrayWithUnderscoreAndToLowercase);
    }


}
