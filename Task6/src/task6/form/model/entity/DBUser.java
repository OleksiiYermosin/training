package task6.form.model.entity;

/**
 * Enum that imitates DB
 */
public enum DBUser {
    FIRST_USER("Melnik", "melnik123"),
    SECOND_USER("Ivanov", "ivanov228"),
    THIRD_USER("Melnik", "melnik100");

    private final String surname;
    private final String login;

    DBUser(String surname, String login) {
        this.surname = surname;
        this.login = login;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    /**
     * Method that checks is enum have given string
     * @param login - login
     * @return true - if enum have given string, otherwise - false
     */
    public static boolean isExist(String login){
        for(DBUser user : DBUser.values()){
            if(login.equals(user.getLogin())){
                return true;
            }
        }
        return false;
    }
}
