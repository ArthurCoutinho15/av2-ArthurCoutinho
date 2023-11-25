
import entities.Arvore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        Scanner scanner = new Scanner(System.in);
        Arvore arvore = new Arvore();
        sc = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\av2EstruturaDeDados\\dados.txt"));

        int num = 0;

        Arvore.Node raiz = null;

        do {

            System.out.println("<Inserir 1> <Excluir 2> <Pesquisar 3> <Pré ordem 4> <Sair 5>");
             num = scanner.nextInt();

            if (num == 1) {
                while (sc.hasNext()) {
                    int valor = Integer.parseInt(sc.nextLine().trim());
                    raiz = arvore.insert(raiz, valor);
                }
                arvore.print(raiz);
            } else if (num == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("Digite um valor para excluir: ");
                int val = scanner.nextInt();
                raiz = arvore.deleteNode(raiz, val);
                arvore.print(raiz);
            } else if (num == 3) {

            } else if (num == 4) {
                System.out.println("Preorder:");
                arvore.preOrder(raiz);
            } else if (num != 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (num != 5);

        System.out.println("Exiting the program.");
    }
}

