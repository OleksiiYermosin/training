package task4;

/**
 * Class that stores and manages data
 * @author Oleksii Yermosin
 * @version 1.0
 * @see Controller
 * @see View
 */
public class Model {
    /**
     * Field that stores surname of user
     */
    private String surname;
    /**
     * Field that stores nickname of user
     */
    private String nickname;

    /**
     * Method that assigns surname to corresponding field
     * @param surname - surname of user
     * @see  Model#setNickname(String)
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Method that assigns nickname to corresponding field
     * @param nickname - nickname of user
     * @see Model#setSurname(String)
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter of field surname
     * @return surname
     * @see Model#getNickname()
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Getter of field nickname
     * @return nickname
     * @see Model#getSurname()
     */
    public String getNickname() {
        return nickname;
    }
}
