package modulo1;

public class a3 {
    public static void main (String [] args){
        // Byte = 8bits que vai de 0 a 255 - 11111111
        byte idade = 127;
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);
        // byte não aceita mais porque tem a possibilidade de numero negativo
        // -128 a 127 ( conta o zero)
    
        System.out.println("---------------------------------------------------");
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        System.out.println(minS);
        System.out.println(maxS);
        // Short = 2 bytes = 16bits vai de 0 até 65535 - 1111111111111111
        // vai de -32768 a 32767
    

        System.out.println("----------------------------------------------------");
        int minI =Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        System.out.println(minI);
        System.out.println(maxI);
        // int 4 bytes = 32bits-  vai de 0 até 4294967296
        // vai de -2147483648 a 2147483647


        System.out.println("----------------------------------------------------");
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;
        System.out.println(minL);
        System.out.println(maxL);
        // long 8 bytes - 64bits- 


    // long n1 = minI;  == conversao implicita
    // explicitas - cast    
    // byte n2 = (byte)minL // não converte correramente == o
    // long n3 = (long) "Nathalia" /// não funciona
    // System.out.println(n2);    

    }
    
}
