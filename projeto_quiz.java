import java.util.Scanner;

public class projeto_quiz {

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
                System.out.println("\n");
        
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
                break;
		case "medio":
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
            
            System.out.println("\n\n\n\n\n\n");
            
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
            
            System.out.println("\n\n\n\n\n\n");
        
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
            
            System.out.println("\n\n\n\n\n\n");
            
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
            
            System.out.println("\n\n\n\n\n\n");
          
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
            
            System.out.println("\n\n\n\n\n\n");

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
            
            System.out.println("\n\n\n\n\n\n");
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
            
            System.out.println("\n\n\n\n\n\n");

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
            
            System.out.println("\n\n\n\n\n\n");
            
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
                break;
        case "dificil":
                System.out.println("DIFICULDADE DIFICIL INICIADA");
                System.out.println("1.Podemos dividir o Reino Animal em nove filos mais representativos. Qual o único no qual é possível encontrar organismos com exoesqueleto quitinoso?");
                System.out.println("a) Filo Porífera\nb) Filo Arthropoda\nc) Filo Molusca\nd) Filo Cnidária\ne) Filo Nematódea\n");
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
            
            System.out.println("\n\n\n\n\n\n");
            
                System.out.println(
                        "2.Qual a principal novidade evolutiva dos poríferos?");
                System.out.println("a) Esqueleto\r\n"
                        + "b) Condrócitos\r\n"
                        + "c) Coanócitos\r\n"
                        + "d) Cutícula\r\n"
                        + "e) Crânio\n");
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
            
            System.out.println("\n\n\n\n\n\n");
         
                System.out.println("3.. O polvo tem três corações e azul é sua cor primária devido ao pigmento hemocianina presente em seu sangue?");
                System.out.println("a) Verdadeiro\r\n"
                        + "b) Falso\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b")) {
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
            
            System.out.println("\n\n\n\n\n\n");
            
                System.out.println(
                        "4.Quais foram os primeiros animais invertebrados a surgir?");
                System.out.println("a) Artrópodes\r\n"
                        + "b) Crustáceos\r\n"
                        + "c) Poríferos\r\n"
                        + "d) Sapos\r\n"
                        + "e) Peixes\n");
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

                System.out.println("5.Qual é a característica distintiva dos Cnidários??");
                System.out.println("a) Corpo Segmentado\r\n"
                        + "b) Exoesqueleto Calcário\r\n"
                        + "c) Simetria Bilateral\r\n"
                        + "d) Células Urticantes (Cnidocitos)\r\n"
                        + "e) Nenhuma das alternativas está correta\n");
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
            
            System.out.println("\n\n\n\n\n\n");
       
                System.out.println("6.Qual dos seguintes não pertence ao filo dos Nematelmintos?");
                System.out.println("a) Minhoca\r\n"
                        + "b) Nematódeo\r\n"
                        + "c) Ancilostomose\r\n"
                        + "d) Sanguessuga\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")) {
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
            System.out.println("\n\n\n\n\n\n");

	System.out.println("7.Nem todos os animais são eucariontes, existem alguns que são autótrofos.");System.out.println("a) Verdadeiro\r\n"+"b) Falso\r\n");System.out.println("Qual é a alternativa certa?");resp=scan.nextLine().toLowerCase();while(!resp.equals("a")&&!resp.equals("b"))

	{
		System.out.println("Digite alguma das alternativas!");
		resp = scan.nextLine().toLowerCase();
	}

	if("b".equals(resp))
	{
		System.out.println("Certa resposta");
		respC++;
	}else
	{
		System.out.println("Resposta errada");
		respE++;
	}

	System.out.println("8.Quais dos grupos abaixo possuem endo esqueleto?");System.out.println("a)Cordados e artrópodes\r\n"+"b) Artrópodes e equinodermos\r\n"+"c) Anelídeos e artrópodes\r\n"+"d) Equinodermos e anelídeos\r\n"+"e) Equinodermos e cordados\n");System.out.println("Qual é a alternativa certa?");resp=scan.nextLine().toLowerCase();while(!resp.equals("a")&&!resp.equals("b")&&!resp.equals("c")&&!resp.equals("d")&&!resp.equals("e"))
	{
		System.out.println("Digite alguma das alternativas!");
		resp = scan.nextLine().toLowerCase();
	}

	if("e".equals(resp)){
		System.out.println("Certa resposta");
		respC++;
	}else{
		System.out.println("Resposta errada");
		respE++;
	}
	System.out.println("9.Qual o hábito de vida da helicops infrataeniatus?");
	System.out.println("a) Terrestre e diurna\r\n"
	+"b) Terrestre e noturna\r\n"
			+"c) Aquática e diurna \r\n"
	+"d) Aquática e noturna\r\n"
			+"e) Nenhuma das alternativas está correta\n");
	System.out.println("Qual é a alternativa certa?");
	
	resp=scan.nextLine().toLowerCase();
	
	while(!resp.equals("a")&&!resp.equals("b")&&!resp.equals("c")&&!resp.equals("d")&&!resp.equals("e")){
		System.out.println("Digite alguma das alternativas!");resp=scan.nextLine().toLowerCase();
		}

	if("c".equals(resp)){
		System.out.println("Certa resposta");
		respC++;
		}else{
			System.out.println("Resposta errada");
			respE++;
		}

	System.out.println("10.Qual o menor membro da ordem sirenia?");
	System.out.println("a) Peixe boi\r\n"
			+"b) Baiacu\r\n"
			+"c) Peixe-boi-mini\r\n"
			+"d) Dugongo\r\n"
			+"e) Peixe -boi-da-Amazonia\r\n");
	System.out.println("Qual é a alternativa certa?");
	resp=scan.nextLine().toLowerCase();
		while(!resp.equals("a")&&!resp.equals("b")&&!resp.equals("c")&&!resp.equals("d")&&!resp.equals("e")){
			System.out.println("Digite alguma das alternativas!");
			resp=scan.nextLine().toLowerCase();
		}

		if("c".equals(resp)){
		System.out.println("Certa resposta");
		respC++;
		}else{
			System.out.println("Resposta errada");
			respE++;
			}

		break;
		default:
			System.out.println("Insira uma das opções validas");
			return;
        }

			if(respC>8){
				System.out.println("Você foi muito bem");
				}else if(respC>=5){
					System.out.println("Você foi bem");
					}else{
						System.out.println("Procure melhorar");
						}

			System.out.println("RESPOSTAS CERTAS: "+respC+"\nRESPOSTAS ERRADAS:"+respE+"\nDIFICULDADE:"+op);
	}
}

