package task4;

/**
 * Interface that stores patterns of regular expressions
 * @author Oleksii Yermosin
 * @version 1.0
 */
public interface RegularExpressions {

    String surnameRegEx = "[A-Z]{1}[a-z]+|[А-ЯЁІЇ]{1}[а-яёії']+$";

    String nickRegEx = "^[A-Za-z][A-Za-z0-9_-]{3,25}$";

    String nameRegEx = "[A-Z]{1}[a-z]+|[А-ЯЁІЇ]{1}[а-яёії']+$";

    String patronymicRegEx = "[A-Z]{1}[a-z]+|[А-ЯЁІЇ]{1}[а-яёії']+$";

    String commentRegEx = "[A-Za-zА-Яа-яЁёІіЇї0-9.,!?-_`\"\"\\s]";

    String groupRegEx = "WORK|HOME|UNIVERSITY|FRIEND|RELATIVE/i";

    String homePhoneRegEx = "\\d{6,7}";

    String personalPhoneRegEx = "\\+?[0-9]{12}|[0-9]{10}";

    String emailRegEx = "[a-z0-9_-]{2,}@[a-z0-9_-]{2,}\\.[a-z]{2,}";

    String skypeRegEx = "[a-zA-Z][a-zA-Z0-9\\.,-_]{5,31}";

    String indexRegEx = "[0-9]{5}";

    String cityNameRegEx = "[A-Za-zА-Яа-яЁЇІёїі'-]{2,32}";

    String streetNameRegEx = "[A-Za-zА-Яа-яЁЇІёїі'-]{2,32}";

    String houseNumberRegEx = "[0-9]{1,4}[A-Za-zA-Яа-яЁЇІёїі]*";

    String flatNumberRegEx = "0|^[^0][0-9]+";
}
