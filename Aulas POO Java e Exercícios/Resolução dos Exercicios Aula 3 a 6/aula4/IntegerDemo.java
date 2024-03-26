public class IntegerDemo {
    public static void main(String[] args) {
    	
        // Criação de variáveis inteiras com diferentes tipos
        int myInt = 100;
        byte myByte = 100;
        short myShort = 100;
        long myLong = 100;

        // Exibição dos valores iniciais
        System.out.println("Valor inicial de myInt: " + myInt);
        System.out.println("Valor inicial de myByte: " + myByte);
        System.out.println("Valor inicial de myShort: " + myShort);
        System.out.println("Valor inicial de myLong: " + myLong);

        // Modificação dos valores para 12345
        myInt = 12345;
        //myByte = 12345; // Isto causará um erro de compilação
        myByte = 127; // Corrigido para estar dentro do intervalo de um byte
        myShort = 12345;
        myLong = 12345;

        // Exibição dos valores modificados
        System.out.println("Valor modificado de myInt: " + myInt);
        System.out.println("Valor modificado de myByte: " + myByte);
        System.out.println("Valor modificado de myShort: " + myShort);
        System.out.println("Valor modificado de myLong: " + myLong);
    }
}