public class BucleWhile {

    public void signoAlternowhile(){
        System.out.println();
        System.out.println("While: ");
        int i=1;
        while(i<10){
            if(i%2==0)
                System.out.print("- ");
            else
                System.out.print("+ ");
                i++;
        }
        System.out.println("");
    }

    public void signoAlternoGenerativowhile(){
        System.out.println("While: ");
        int i=1;
        while(i<10){
            int j=1;
            while(j<i){
                System.out.print((i%2==0)?"-":"+");
                j++;
            }
            System.out.print(" ");
            i++;
        }
        System.out.println("");
    }
}
