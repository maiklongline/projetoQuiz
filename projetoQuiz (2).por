programa {
  funcao inicio() {
    //variaveis
    inteiro respC = 0,respE= 0, op
    real porc
    caracter resp

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
          escreva("\nIniciando dificuldade fácil\n")
          escreva("1. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("2. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("3. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("4. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("5. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("6. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("7. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("8. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("9. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("10. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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
        caso 2:
        //Medio
          escreva("\nIniciando dificuldade Média\n")
          escreva("1. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("2. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("3. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("4. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("5. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("6. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("7. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("8. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("9. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("10. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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
          escreva("\nIniciando dificuldade Difícil\n")
          escreva("1. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("2. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("3. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("4. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("5. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("6. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("7. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("8. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("9. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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

          escreva("10. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipopótomo\n")
          escreva("d) Girafa\n")
          escreva("e) Leão\n")
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
      }
      escreva("\n\n\n")
      escreva("Suas respostas certas foram " + respC + "\n")
      escreva("Suas respostas erradas foram " + respE +"\n")
    }
    }
