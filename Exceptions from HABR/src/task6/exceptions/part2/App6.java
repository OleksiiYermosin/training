package task6.exceptions.part2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App6 {

    public void f() throws IOException, InterruptedException {}

}

class App6_1 extends App6{

    @Override
    public void f() throws FileNotFoundException {}

}
