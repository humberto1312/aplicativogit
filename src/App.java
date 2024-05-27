import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        String fileName = "output.txt";

        System.out.println("Digite seus textos. Digite 'sair' para terminar e salvar no arquivo.");

        while (true) {
            System.out.print("Digite um texto: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            content.append(input).append(System.lineSeparator());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content.toString());
            System.out.println("Textos salvos com sucesso em " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}