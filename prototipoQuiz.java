
import java.util.Scanner;

public class prototipoQuiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int respC = 0, respE = 0;
        double porc;
        String resp,op;
        System.out.println("Bem vindo ao Quiz sobre o Reino Animal");
        System.out.println("escolha o Nivel de dificuldade");
        System.out.println("Digite: Facil");
        System.out.println("Digite: Medio");
        System.out.println("Digite: Dificil");
        op = scan.nextLine().toLowerCase();
        op = op.replaceAll("á", "a").replaceAll("é", "e").replaceAll("í", "i")
        .replaceAll("ó", "o").replaceAll("ú", "u");
        switch (op) {
            case "facil":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE FACIL INICIADA");
                System.out.println("1.Qual é o nome do maior mamífero terrestre? ");
                System.out.println("a) Rinoceronte-branco\nb) Elefante-africano\nc) Hipopótamo\nd) Girafa\ne) Leão\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual animal é conhecido por ter a mordida mais forte em relação ao seu tamanho corporal?");
                System.out.println("a) Leão\r\n"
                        + "b) Tubarão-branco\r\n"
                        + "c) Crocodilo de água salgada\r\n"
                        + "d) Tucunaré\r\n"
                        + "e) Hiena\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual é o mamífero mais rápido do mundo em terra firme?");
                System.out.println("a) Guepardo\r\n"
                        + "b) Antílope\r\n"
                        + "c) Leopardo\r\n"
                        + "d) Coiote\r\n"
                        + "e) Lebre\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Qual animal é conhecido por ter o cérebro proporcionalmente maior em relação ao seu tamanho corporal?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Elefante\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Corvo\r\n"
                        + "e) Polvo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é o animal com o maior período de gestação?");
                System.out.println("a) Elefante africano\r\n"
                        + "b) Baleia-azul\r\n"
                        + "c) Tubarão-baleia\r\n"
                        + "d) Gorila\r\n"
                        + "e) Hipopótamo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual é o único mamífero capaz de voar?");
                System.out.println("a) Morcego\r\n"
                        + "b) Pássaro\r\n"
                        + "c) Esquilo\r\n"
                        + "d) Ouriço\r\n"
                        + "e) Coala\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Qual é o animal que tem o maior número de dentes?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual é o animal mais venenoso do mundo?");
                System.out.println("a) Medusa\r\n"
                        + "b) Cobra-rei\r\n"
                        + "c) Vespa-de-mar\r\n"
                        + "d) Peixe-pedra\r\n"
                        + "e) Mosquito\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual animal possui o tempo de vida mais longo?");
                System.out.println("a) Tartaruga\r\n"
                        + "b) Elefante\r\n"
                        + "c) Baleia\r\n"
                        + "d) Morcego\r\n"
                        + "e) Coruja\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual é o animal com o sistema de comunicação mais complexo?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        case "medio":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE MEDIO INICIADA");
                System.out.println("1.Qual é o nome do maior mamífero terrestre?");
                System.out.println("a) Rinoceronte-branco\nb) Elefante-africano\nc) Hipopótamo\nd) Girafa\ne) Leão\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual animal é conhecido por ter a mordida mais forte em relação ao seu tamanho corporal?");
                System.out.println("a) Leão\r\n"
                        + "b) Tubarão-branco\r\n"
                        + "c) Crocodilo de água salgada\r\n"
                        + "d) Tucunaré\r\n"
                        + "e) Hiena\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual é o mamífero mais rápido do mundo em terra firme?");
                System.out.println("a) Guepardo\r\n"
                        + "b) Antílope\r\n"
                        + "c) Leopardo\r\n"
                        + "d) Coiote\r\n"
                        + "e) Lebre\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Qual animal é conhecido por ter o cérebro proporcionalmente maior em relação ao seu tamanho corporal?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Elefante\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Corvo\r\n"
                        + "e) Polvo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é o animal com o maior período de gestação?");
                System.out.println("a) Elefante africano\r\n"
                        + "b) Baleia-azul\r\n"
                        + "c) Tubarão-baleia\r\n"
                        + "d) Gorila\r\n"
                        + "e) Hipopótamo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual é o único mamífero capaz de voar?");
                System.out.println("a) Morcego\r\n"
                        + "b) Pássaro\r\n"
                        + "c) Esquilo\r\n"
                        + "d) Ouriço\r\n"
                        + "e) Coala\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Qual é o animal que tem o maior número de dentes?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual é o animal mais venenoso do mundo?");
                System.out.println("a) Medusa\r\n"
                        + "b) Cobra-rei\r\n"
                        + "c) Vespa-de-mar\r\n"
                        + "d) Peixe-pedra\r\n"
                        + "e) Mosquito\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual animal possui o tempo de vida mais longo?");
                System.out.println("a) Tartaruga\r\n"
                        + "b) Elefante\r\n"
                        + "c) Baleia\r\n"
                        + "d) Morcego\r\n"
                        + "e) Coruja\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual é o animal com o sistema de comunicação mais complexo?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        case "dificil":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE DIFICIL INICIADA");
                System.out.println("1.Qual é o nome do maior mamífero terrestre?");
                System.out.println("a) Rinoceronte-branco\nb) Elefante-africano\nc) Hipopótamo\nd) Girafa\ne) Leão\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual animal é conhecido por ter a mordida mais forte em relação ao seu tamanho corporal?");
                System.out.println("a) Leão\r\n"
                        + "b) Tubarão-branco\r\n"
                        + "c) Crocodilo de água salgada\r\n"
                        + "d) Tucunaré\r\n"
                        + "e) Hiena\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual é o mamífero mais rápido do mundo em terra firme?");
                System.out.println("a) Guepardo\r\n"
                        + "b) Antílope\r\n"
                        + "c) Leopardo\r\n"
                        + "d) Coiote\r\n"
                        + "e) Lebre\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Qual animal é conhecido por ter o cérebro proporcionalmente maior em relação ao seu tamanho corporal?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Elefante\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Corvo\r\n"
                        + "e) Polvo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é o animal com o maior período de gestação?");
                System.out.println("a) Elefante africano\r\n"
                        + "b) Baleia-azul\r\n"
                        + "c) Tubarão-baleia\r\n"
                        + "d) Gorila\r\n"
                        + "e) Hipopótamo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual é o único mamífero capaz de voar?");
                System.out.println("a) Morcego\r\n"
                        + "b) Pássaro\r\n"
                        + "c) Esquilo\r\n"
                        + "d) Ouriço\r\n"
                        + "e) Coala\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Qual é o animal que tem o maior número de dentes?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual é o animal mais venenoso do mundo?");
                System.out.println("a) Medusa\r\n"
                        + "b) Cobra-rei\r\n"
                        + "c) Vespa-de-mar\r\n"
                        + "d) Peixe-pedra\r\n"
                        + "e) Mosquito\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual animal possui o tempo de vida mais longo?");
                System.out.println("a) Tartaruga\r\n"
                        + "b) Elefante\r\n"
                        + "c) Baleia\r\n"
                        + "d) Morcego\r\n"
                        + "e) Coruja\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual é o animal com o sistema de comunicação mais complexo?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        default:
        System.out.println("Insira uma das opções validas");
        return;
        
    }

        if (respC > 8) {
            System.out.println("Você foi muito bem");
        } else if (respC >= 5) {
            System.out.println("Você foi bem");
        } else {
            System.out.println("Procure melhorar");
        }

        System.out.println("RESPOSTAS CERTAS: " + respC + "\nRESPOSTAS ERRADAS:" + respE+"\nDIFICULDADE:"+op);
    }
}