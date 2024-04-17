import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        System.out.println("Введіть рядок s:");
        String s = scanner.nextLine();

        System.out.println("Введіть рядок t:");
        String t = scanner.nextLine();

        StringProcessor stringProcessor = new StringProcessor(inputText, s, t);

        System.out.println("Початковий рядок:");
        System.out.println(stringProcessor.getInputText());

        System.out.println("Рядок після обробки:");
        System.out.println(stringProcessor.processText());
    }
}

class StringProcessor {
    private String inputText;
    private String s;
    private String t;

    public StringProcessor(String inputText, String s, String t) {
        this.inputText = inputText;
        this.s = s;
        this.t = t;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String processText() {
        String[] words = inputText.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if (words[i].equals(s) && (i == words.length - 1 || !words[i + 1].equals(s))) {
                result.append(" ").append(t);
            }

            result.append(" ");
        }

        return result.toString();
    }
}
