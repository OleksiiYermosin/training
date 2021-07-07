package task5.controller;

/**
 * Interface that stores regular expressions
 */
public interface RegularExpressions {

    String REGEX_SURNAME_EN = "^[A-Z][a-z]{1,20}$";

    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ']{1,20}$";

    String REGEX_NICK = "^[A-Za-z][A-Za-z0-9_-]{4,25}$";

    String REGEX_NAME_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ']{1,20}$";

    String REGEX_NAME_EN = "^[A-Z][a-z]{1,20}$";

    String REGEX_PATRONYMIC_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ']{1,20}$";

    String REGEX_PATRONYMIC_EN = "^[A-Z][a-z]{1,20}$";

    String REGEX_COMMENT = "[A-Za-zА-Яа-яЁёІіЇї0-9.,!?-_`\"\"\\s]";

    String REGEX_GROUP = "WORK|HOME|UNIVERSITY|FRIEND|RELATIVE/i";

    String REGEX_HOME_PHONE = "\\d{6,7}";

    String REGEX_MOBILE_PHONE = "\\+?[0-9]{12}|[0-9]{10}";

    String REGEX_EMAIL = "[a-z0-9_-]{2,}@[a-z0-9_-]{2,}\\.[a-z]{2,}";

    String REGEX_SKYPE = "[a-zA-Z][a-zA-Z0-9\\.,-_]{5,31}";

    String REGEX_INDEX = "[0-9]{5}";

    String REGEX_CITY_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ'\\-]{1,20}$";

    String REGEX_CITY_EN = "^[A-Z][a-z\\-]{1,20}$";

    String REGEX_STREET_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ'\\-]{1,20}$";

    String REGEX_STREET_EN = "^[A-Z][a-z\\-]{1,20}$";

    String REGEX_HOUSE_EN = "^[0-9]{1,4}[A-Za-z]*";

    String REGEX_HOUSE_UA = "^[0-9]{1,4}[А-ЩЬЮЯЇІЄҐа-щьюяїієґ]*";

    String REGEX_FLAT = "0|^[^0][0-9]+";
}
