package homework;

public class Hello {

    String world = "everyone";

    public String sayHello(String who){
        String sentence;
        if (who != "")
            sentence = "Hello " + who + " :)";
        else
            sentence = "Hello " + world + " :)";
        return sentence;
    }
}
