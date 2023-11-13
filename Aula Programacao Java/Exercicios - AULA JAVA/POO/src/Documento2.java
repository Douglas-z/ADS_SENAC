public class Documento2 {

    public static void main(String[] args) {

        Documento doc1 = new Documento();
        doc1.nome = "Alfredo";

        Documento doc2 = doc1;
        doc2.nome = "juliana";

        Documento doc3 = new Documento();
        doc3.nome = "juliana";
        doc2 = doc3;

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
