public class Main {
    public static void main(String[] args) {

        String NomeNinja1 = "Naruto Uzumaki";
        int IdadeNinja1 = 17;
        char dificuldadeNinja1 = 'S';
        String MissaoNinja1 = "Treinamento no Monte Myouboku";

        String NomeNinja2 = "Sasuke Uchiha";
        int IdadeNinja2 = 17;
        char dificuldadeNinja2 = 'S';
        String MissaoNinja2 = "Vigiar Orochimaru";

        String NomeNinja3 = "Sakura Haruno";
        int IdadeNinja3 = 17;
        char dificuldadeNinja3 = 'S';
        String MissaoNinja3 = "Investigar livro do Kakashi";

        if (IdadeNinja1 > 15 && dificuldadeNinja1 != 'C' && dificuldadeNinja1 != 'D') {
            System.out.println("O ninja " + NomeNinja1 + " completou sua missão");
        } else {
            System.out.println("O ninja " + NomeNinja1 + " não concluiu sua missão");
        }
        if (IdadeNinja2 > 15 && dificuldadeNinja2 != 'C' && dificuldadeNinja2 != 'D') {
            System.out.println("O ninja " + NomeNinja2 + " completou sua missão");
        } else {
            System.out.println("O ninja " + NomeNinja2 + " não concluiu sua missão");
        }
        if (IdadeNinja3 > 15 && dificuldadeNinja3 != 'C' && dificuldadeNinja3 != 'D') {
            System.out.println("O ninja " + NomeNinja3 + " completou sua missão");
        } else {
            System.out.println("O ninja " + NomeNinja3 + " não concluiu sua missão");
        }
    }
}