public class Buclefor2 {
    //metodo
    public void signoAlterno(){
        System.out.println("For: ");
        for(int i=1;i<10;i++){
            if(i%2==0)
                System.out.print("- ");
            else
                System.out.print("+ ");
        }
        System.out.println("");
    }

    public void signoAlternoGenerativo(){
        System.out.println("For: ");
        for(int i=1;i<10;i++){
            if(i%2==0){
                for (int j = 1; j <=i; j++) {
                    System.out.print("- ");
            }
        }
            else{
                for (int j = 1; j <=i; j++) {
                    System.out.print("+ ");
            }
        }   
        }
        System.out.println("");
    }

    public void signoAlternoGenerativoMejora(){
        System.out.println("For: ");
        for(int i=1;i<10;i++){
            for(int j = 1; j <=i; j++) {
                System.out.print((i%2==0)?"-":"+");
            System.out.print(" ");
            }   
        }
        System.out.println("");
    }

    public void escalera(){
        for(int i=1;i<=10;i++){
            System.out.println("|_");
                for(int j=1;j<=i;j++){
                    System.out.print("  ");
                }
        }
    }

}
