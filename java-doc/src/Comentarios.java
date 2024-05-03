public class Comentarios {
    // Comentário one line: somenta somente nessa linha

    /*
     * 
     * Comentário Mult Line: comentário com mais de uma linha, comentário mais detalhado
     * 
     */


    /**
     * 
     * 
     * Comentário Documentation: serve para indicar que você pretende elaborar um comentário a nível de documentação
     * 
     * 
     * 
     */

     // Forma errada de usar os comentários

        /*
        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade de somar ou  multiplicar
        * dois números
        */

        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
        }
    // O código deve ser leg;ivel, não explicado por comentários. Senão o código ficaria de difícil visualização

}
