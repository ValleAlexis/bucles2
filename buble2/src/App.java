public class App {
    public static void main(String[] args) throws Exception {
        //declarar 
        Buclefor2 bf;
        BucleWhile bw;
        //insranciar
        bf = new Buclefor2();
        bw = new BucleWhile();
        //llamar al metodo
        bf.signoAlterno();
        bf.signoAlternoGenerativo();
        bf.signoAlternoGenerativoMejora();
        bf.escalera();
        bw.signoAlternowhile();
        bw.signoAlternoGenerativowhile();
    }
}
