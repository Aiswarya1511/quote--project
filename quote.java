import java.util.Random;

class QuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "Life is not about what we expect, it's about what we accept.!",
            "Dream big, work hard, stay humble.!",
            "Code is like humor. When you have to explain it, it’s bad.!",
            "Success is not final, failure is not fatal: it is the courage to continue that counts.",
            "Do something today that your future self will thank you for."
        };

        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        System.out.println("✨ Your Quote of the Day ✨");
        System.out.println(quotes[index]);
    }
}
