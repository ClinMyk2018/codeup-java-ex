import java.util.Random;

public class ServerNameGenerator {
    static String[] adjs = {"Plump", "Sugary", "Salubrious", "Clumpy", "Dumpy", "Scawwy", "Spicy", "Swagalicous", "Drowsy", "Secretive"};
    static String[] nouns = {"Wombat", "Slug", "Dogg-o", "Cornucopia", "Trombone", "Basket", "Sugar Glider", "Burrito", "Bass", "Queen"};

    static Random randomizer = new Random();

    public static String randomWord (String[] strings) {
        return strings[randomizer.nextInt(strings.length)];
    }

    public static String newServerName(String adj, String noun) {
        return "Your new server name has been created:\n" +
                adj+"-"+noun;
    }

    public static void main(String[] args) {
        System.out.println(newServerName(randomWord(adjs), randomWord(nouns)));
    }
}
