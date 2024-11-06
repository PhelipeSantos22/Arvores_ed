import model.Arvore;

public class Main {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();
        arvore.insertleaf(arvore.letraParaNumero('k'));
        arvore.insertleaf(arvore.letraParaNumero('d'));
        arvore.insertleaf(arvore.letraParaNumero('f'));
        arvore.insertleaf(arvore.letraParaNumero('m'));
        arvore.insertleaf(arvore.letraParaNumero('b'));
        arvore.insertleaf(arvore.letraParaNumero('t'));
        arvore.insertleaf(arvore.letraParaNumero('p'));
        arvore.insertleaf(arvore.letraParaNumero('z'));
        arvore.insertleaf(arvore.letraParaNumero('c'));
        arvore.insertleaf(arvore.letraParaNumero('l'));
        arvore.insertleaf(arvore.letraParaNumero('r'));

        arvore.prefixSearch();
        System.out.println(" ");
        System.out.println("==============");
        arvore.infixSearch();
        System.out.println(" ");
        System.out.println("==============");
        arvore.postfixSearch();

    }
}
