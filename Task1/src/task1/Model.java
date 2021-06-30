package task1;

public class Model {

    private String firstString;
    private String secondString;

    public String calculateMessage() {
        String message;
        if (firstString.equals("Hello") && secondString.equals("world!")) {
            message = firstString + " " + secondString;
        }else{
            message = "Incorrect data, try again!";
        }
        return message;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }
}
