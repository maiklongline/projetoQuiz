programa {
  funcao inicio() {
    //variaveis
    inteiro respC = 0,respE= 0, op
    real porc
    caracter resp
    cadeia opcao

    //atribuindo escolhas
    escreva("Bem vindo ao quiz:Reino Animal\n")
    escreva("Escolha sua dificuldade\n")
    escreva("1) Fácil\n")
    escreva("2) Médio\n")
    escreva("3) Difícil\n")
    leia(op)
    enquanto(op != 1 e op != 2 e op != 3 ){
      escreva("Digite alguma das dificuldade!\n")
      leia(op)
    }

    escolha(op){
      //Facil
      caso 1:
          opcao = "Fácil"
          escreva("\nIniciando dificuldade fácil\n")
          escreva("1.Qual animal com a mordida mais forte do mundo?\n")
          escreva("a) Crocodilo\n")
          escreva("b) Leão\n")
          escreva("c) Tubarão\n")
          escreva("d) Lobo\n")
          escreva("e) Tigre\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "a" ou resp == "A"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }

          escreva("\n\n\n")

          escreva("2.Qual é a maior ave do mundo?\n")
          escreva("a) Águia real\n")
          escreva("b) Arara-azul\n")
          escreva("c) Avestruz\n")
          escreva("d) Galinha\n")
          escreva("e) Coruja\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("3. Qual o maior mamifero terrestre?\n")
          escreva("a) Tigre\n")
          escreva("b) Leão\n")
          escreva("c) Panda\n")
          escreva("d) Girafa\n")
          escreva("e) Elefante\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("4. Qual é o animal mais rápido do mundo?\n")
          escreva("a) Tigre\n")
          escreva("b) Hiena\n")
          escreva("c) Leopardo\n")
          escreva("d) Onça\n")
          escreva("e) Guepardo\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "e" ou resp == "E"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }       
          
          escreva("\n\n\n")

          escreva("5.Como se chama um grupo de ovelhas?\n")
          escreva("a) Manada\n")
          escreva("b) Rebanho\n")
          escreva("c) Plantel\n")
          escreva("d) Bando\n")
          escreva("e) Enxame\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("6. Qual o maior primata do mundo?\n")
          escreva("a) Babuíno \n")
          escreva("b) Orangotango\n")
          escreva("c) Gorila \n")
          escreva("d) Chimpanzé\n")
          escreva("e) Lêmures\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("7. Qual o maior urso do mundo?\n")
          escreva("a) Urso pardo\n")
          escreva("b) Urso polar\n")
          escreva("c) Urso negro\n")
          escreva("d) Urso panda\n")
          escreva("e) Urso malaio\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("8. Qual a única raça de cães que apresenta a língua azul?\n")
          escreva("a) Bulldog\n")
          escreva("b) Golden\n")
          escreva("c) Pastor alemão\n")
          escreva("d) Chow chow\n")
          escreva("e) Boder collie\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "d"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("9. Qual é o animal mais lento do mundo?\n")
          escreva("a) Jabuti\n")
          escreva("b) Anta\n")
          escreva("c) Tigre\n")
          escreva("d) Lontra\n")
          escreva("e) Bicho-preguiça\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "e" ou resp == "E"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("10. Os elefantes vivem na:\n")
          escreva("a) Amazônia\n")
          escreva("b) Pântano\n")
          escreva("c) Tundra\n")
          escreva("d) Savana\n")
          escreva("e) Deserto\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "D"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        

          pare
        caso 2:
        //Medio
          opcao = "Médio"
          escreva("\nIniciando dificuldade Média\n")
          escreva("1.Quais são os dois únicos mamíferos que põem ovos?\n")
          escreva("a) Morcego e lontra\n")
          escreva("b) Furão e salamandra \n")
          escreva("c) Ornitorrinco e porco espinho \n")
          escreva("d) Equidnas e ornitorrincos\n")
          escreva("e) Suricato e coelho \n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "D"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }

          escreva("\n\n\n")

          escreva("2.Quantos corações tem um polvo?\n")
          escreva("a) Um\n")
          escreva("b) Dois\n")
          escreva("c) Nenhum\n")
          escreva("d) Cinco\n")
          escreva("e) Três\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "e" ou resp == "E"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("3.Qual a velocidade máxima de um tubarão branco?\n")
          escreva("a) 10km/h\n")
          escreva("b) 56km/h\n")
          escreva("c) 52km/h\n")
          escreva("d) 28km/h\n")
          escreva("e) 40km/h\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("4. De qual família pertence os escorpiões?\n")
          escreva("a) Artrópodes\n")
          escreva("b) Crustáceos\n")
          escreva("c) Aracnídeos\n")
          escreva("d) Blatídeos\n")
          escreva("e) Poríferos\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "a" ou resp == "A"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }       
          
          escreva("\n\n\n")

          escreva("5.Qual o animal que mais mata humanos no mundo?\n")
          escreva("a) Cachorro\n")
          escreva("b) EHipopótamo\n")
          escreva("c) Mosquito\n")
          escreva("d) Cobra\n")
          escreva("e) Tubarão\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("6. Qual destes pássaros se mantém voando sem bater as asas?\n")
          escreva("a) Pardal\n")
          escreva("b) Beija-flor\n")
          escreva("c) Falcão\n")
          escreva("d) Pombo\n")
          escreva("e) Canário\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("7. Qual aranha mais venenosa?\n")
          escreva("a) Viúva-negra\n")
          escreva("b) Aranha-marrom\n")
          escreva("c) Tarântula\n")
          escreva("d) Aranha-armadeira \n")
          escreva("e) Aranha-caranguejeira\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "D"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("8. Qual foi o primeiro mamífero a ser clonado?\n")
          escreva("a) Cachorro\n")
          escreva("b) Carneiro\n")
          escreva("c) Ovelha\n")
          escreva("d) Morcego\n")
          escreva("e) Cavalo\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva(" 9. A pele dos répteis é:\n")
          escreva("a) Grossa e peluda\n")
          escreva("b) Lisa e colorida\n")
          escreva("c) Peluda e brilhante\n")
          escreva("d) Seca e impermeável\n")
          escreva("e) Grossa e brilhante\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "D"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("10.Qual foi o maior dinossauro do mundo? \n")
          escreva("a) Triceratops\n")
          escreva("b) Patagotitan mayorum\n")
          escreva("c) Tyrannosaurus Rex\n")
          escreva("d) Brachiosaurus\n")
          escreva("e) Velociraptor\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        

          pare
          caso 3:
          //Dificil
          opcao = "Difícil"
          escreva("\nIniciando dificuldade Difícil\n")
          escreva("1. Podemos dividir o Reino Animal em nove filos mais representativos. Qual o único no qual é possível encontrar organismos com exoesqueleto quitinoso.\n")
          escreva("a) Filo Porífera\n")
          escreva("b) Filo Arthropoda\n")
          escreva("c) Filo Nematódea\n")
          escreva("d) Filo Molusca\n")
          escreva("e) Filo Cnidária\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }

          escreva("\n\n\n")

          escreva("2. Qual a principal novidade evolutiva dos poríferos?\n")
          escreva("a) Condrócitos\n")
          escreva("b) Esqueleto\n")
          escreva("c) Coanócitos\n")
          escreva("d) Crânio\n")
          escreva("e) Cutícula\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "c"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("3. O polvo tem três corações e azul é sua cor primária devido ao pigmento hemocianina presente em seu sangue?\n")
          escreva("a) Verdadeiro\n")
          escreva("b) Falso\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "A" e resp != "B"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "a" ou resp == "A"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
          escreva("\n\n\n")

          escreva("4. Quais foram os primeiros animais invertebrados a surgir?\n")
          escreva("a) Artrópodes\n")
          escreva("b) Crustáceos\n")
          escreva("c) Poríferos\n")
          escreva("d) Peixes\n")
          escreva("e) Sapos\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }       
          
          escreva("\n\n\n")

          escreva("5. Qual é a característica distintiva dos Cnidários?\n")
          escreva("a) Corpo Segmentado\n")
          escreva("b) Simetria Bilateral\n")
          escreva("c) Exoesqueleto Calcário\n")
          escreva("d) Células Urticantes (Cnidocitos)\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "A" e resp != "B" e resp != "C" e resp != "D"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "d" ou resp == "D"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("6. Qual dos seguintes não pertence ao filo dos Nematelmintos?\n")
          escreva("a) Minhoca\n")
          escreva("b) Nematódeo\n")
          escreva("c) Ancilostomose\n")
          escreva("d) Sanguessuga\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "A" e resp != "B" e resp != "C" e resp != "D"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "e" ou resp == "E"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("7. Nem todos animais são eucariontes, existem alguns que são autótrofos.\n")
          escreva("a) Verdadeiro\n")
          escreva("b) Falso\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "A" e resp != "B"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "b" ou resp == "B"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("8. Quais dos grupos abaixo possuem endo esqueleto?\n")
          escreva("a) Cordados e artrópodes\n")
          escreva("b) Artrópodes e equinodermos\n")
          escreva("c) Anelídeos e artrópodes\n")
          escreva("d) Equinodermos e anelídeos\n")
          escreva("e) Equinodermos e cordados\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "e" ou resp == "E"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("9. Qual o hábito de vida da helicops infrataeniatus?\n")
          escreva("a) Terrestre e diurna\n")
          escreva("b) Terrestre e noturna\n")
          escreva("c) Aquática e diurna\n")
          escreva("d) Aquática e noturna\n")
          escreva("e) Nenhuma das alternativas são corretas\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          
          escreva("\n\n\n")

          escreva("10. Qual o menor membro da ordem sirenia?\n")
          escreva("a) Peixe boi\n")
          escreva("b) Baiacu\n")
          escreva("c) Peixe-boi-mini\n")
          escreva("d) Dugongo\n")
          escreva("e) Peixe -boi-da-Amazonia\n")
          escreva("Qual a alternativa certa?\n")
          leia(resp)

          enquanto(resp != "a" e resp != "b" e resp != "c" e resp != "d" e resp != "e" e resp != "A" e resp != "B" e resp != "C" e resp != "D" e resp != "E"){
            escreva("Digite alguma das alternativas!\n")
            leia(resp)
          }

          se(resp == "c" ou resp == "C"){
            escreva("Resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }        
          pare
      }
      escreva("\n\n\n")
      se (respC > 8){
        escreva("Você foi muito bem!")
      }senao se(respC >= 5){
        escreva("Você foi bem")
      }senao{
        escreva("Procure melhorar!")
      }
      escreva("\nRESPOSTAS CERTAS: " + respC + "\nRESPOSTAS ERRADAS: " + respE+"\nDIFICULDADE: "+opcao)

    }
    }
