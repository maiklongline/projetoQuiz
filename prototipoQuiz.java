package prototipoQuiz;



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
                System.out.println("1.Qual animal com a mordida mais forte do mundo?\r\n");
                System.out.println("a) Crocodilo \r\n"
                        + "b) Leão\r\n"
                        + "c) Tubarão\r\n"
                        + "d) Lobo \r\n"
                        + "e) Tigre \n");
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
            System.out.println("\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual é a maior ave do mundo?");
                System.out.println("a)Águia real \r\n"
                        + "b) Arara-azul \r\n"                    
                        + "c) Avestruz \r\n"
                        + "d) Galinha \r\n"                    
                        + "e) Coruja \n");
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
                System.out.println("3. Qual é o animal símbolo da china?\r\n");
                System.out.println("a) Tigre\r\n"                		
                        + "b) Leão\r\n"
                        + "c) Panda\r\n"
                        + "d) Girafa\r\n"
                        + "e) Elefante\n");
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
            if (i == 3) {
                System.out.println(
                        "4.Qual é o animal mais rápido do mundo?\r\n");
                System.out.println("a) Tigre \r\n"
                        + "b) Hiena \r\n"
                        + "c) Leopardo\r\n"
                        + "d) Onça\r\n"
                        + "e) Guepardo \n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("e".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Como se chama um grupo de ovelhas?");
                System.out.println("a) Manada\r\n"
                        + "b) Rebanho \r\n"
                        + "c) Plantel  \r\n"
                        + "d) Bando  \r\n"
                        + "e) Enxame  \n");
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
            if (i == 5) {
                System.out.println("6. Qual o maior primata do mundo?\r\n");
                System.out.println("a) Babuíno\r\n"
                        + "b) Orangotango \r\n"
                        + "c) Gorila \r\n"
                        + "d) Chimpanzé\r\n"
                        + "e) Lêmures\n");
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
            if (i == 6) {
                System.out.println("7.Qual o maior urso do mundo?");
                System.out.println("a)Urso pardo\r\n"
                        + "b) Urso polar \r\n"
                        + "c) Urso negro \r\n"
                        + "d) Urso panda \r\n"
                        + "e) Urso malaio \n");
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
            if (i == 7) {
                System.out.println("8.Qual a única raça de cães que apresenta a língua azul?\r\n");
                System.out.println("a) Bulldog\r\n"
                        + "b) Golden \r\n"
                        + "c) Pastor alemão\r\n"
                        + "d) Chow Chow \r\n"
                        + "e) Boder collie\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual é o animal mais lento do mundo?");
                System.out.println("a) Jabuti \r\n"
                        + "b) Anta\r\n"
                        + "c) Tigre\r\n"
                        + "d) Lontra\r\n"
                        + "e) Bicho-preguiça\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("e".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Os elefantes vivem na:");
                System.out.println("a) Amazônia \r\n"
                        + "b) Pântano\r\n"
                        + "c) Tundra \r\n"
                        + "d) Savana \r\n"
                        + "e) Deserto \r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
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
                System.out.println("1.Quais são os dois únicos mamíferos que põem ovos?");
                System.out.println("a) Morcego e lontra\n"
                		+ "b) Furão e salamandra \n"
                		+ "c) Ornitorrinco e porco espinho\n"
                		+ "d) Equidnas e ornitorrincos \n"
                		+ "e) Suricato e coelho\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
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
                        "2.Quantos corações tem um polvo?");
                System.out.println("a) Um\r\n"
                        + "b) Dois\r\n"
                        + "c) Nenhhum\r\n"
                        + "d) Cinco\r\n"
                        + "e) Três\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("e".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual a velocidade máxima de um tubarão branco?");
                System.out.println("a) 10km/h\r\n"
                        + "b) 56km/h\r\n"
                        + "c) 52km/h\r\n"
                        + "d) 28km/h\r\n"
                        + "e) 40km/h\n");
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
            if (i == 3) {
                System.out.println(
                        "4.De qual família pertence os escorpiões?");
                System.out.println("a) Artrópodes\r\n"
                        + "b) Crustáceos\r\n"
                        + "c) Aracnídeos \r\n"
                        + "d) Blatídeos\r\n"
                        + "e) Poríferos\n");
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
            if (i == 4) {
                System.out.println("5.Qual o animal que mais mata humanos no mundo?");
                System.out.println("a) Cachorro\r\n"
                        + "b) Hipopótamo \r\n"
                        + "c) Mosquito\r\n"
                        + "d) Cobra\r\n"
                        + "e) Tubarão\n");
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
            if (i == 5) {
                System.out.println("6.Qual destes pássaros se mantém voando sem bater as asas ");
                System.out.println("a) Pardal \r\n"
                        + "b) Beija-flor\r\n"
                        + "c) Falcão \r\n"
                        + "d) Canário \r\n"
                        + "e) Arara\n");
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
            if (i == 6) {
                System.out.println("7.Qual aranha mais venenosa?");
                System.out.println("a) Viúva-negra\r\n"
                        + "b) Aranha-marrom\r\n"
                        + "c) Tarântula\r\n"
                        + "d) Aranha-armadeira \r\n"
                        + "e) Aranha-caranguejeira\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual foi o primeiro mamífero a ser clonado?");
                System.out.println("a) Cachorro\r\n"
                        + "b) Carneiro\r\n"
                        + "c) Ovelha\r\n"
                        + "d) Morcego \r\n"
                        + "e) Cavalo\n");
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
            if (i == 8) {
                System.out.println("9.A pele dos répteis é:");
                System.out.println("a) Grossa e peluda \r\n"
                        + "b) Lisa e colorida \r\n"
                        + "c) Peluda e brilhante\r\n"
                        + "d) Seca e impermeável \r\n"
                        + "e) Grossa e brilhante \n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual foi o maior dinossauro do mundo?");
                System.out.println("a) Triceratops\r\n"
                        + "b) Patagotitan mayorum \r\n"
                        + "c) Tyrannosaurus Rex \r\n"
                        + "d) Brachiosaurus\r\n"
                        + "e) ) Velociraptor\r\n");
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


