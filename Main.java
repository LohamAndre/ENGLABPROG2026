public class Main {

    public static void main(String[] args) {

              String texto = String.join(" ", args);

        String[] palavras = texto.split(" ");

        int quantidadeVogais = 0;
        int palavrasPares = 0;
        int palavrasImpares = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {

                quantidadeVogais++;
            }
        }

        for (int i = 0; i < palavras.length; i++) {

            int tamanho = palavras[i].length();

            if (tamanho % 2 == 0) {
                palavrasPares++;
            } else {
                palavrasImpares++;
            }
        }


        System.out.println("Quantidade de palavras: " + palavras.length);
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Palavras com letras pares: " + palavrasPares);
        System.out.println("Palavras com letras ímpares: " + palavrasImpares);
    }
}