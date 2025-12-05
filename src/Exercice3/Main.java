package Exercice3;

public class Main {
    public static void main(String[] args) {
        Categorie categorie1 = new Categorie("Ordinateur Portable", "O PR");
        Categorie categorie2 = new Categorie("Ordinateur Poste", "O PO");

        Categorie[] categories = new Categorie[2];
        categories[0] = categorie1;
        categories[1] = categorie2;

        Article article1 = new Article(14, "DELL INSPIRON", categorie1);
        Article article2 = new Article(4, "SONY VAIO", categorie1);
        Article article3 = new Article(74, "TERRA", categorie2);
        Article article4 = new Article(785, "HP Compaq", categorie2);

        Article[] articles = new Article[4];
        articles[0] = article1;
        articles[1] = article2;
        articles[2] = article3;
        articles[3] = article4;

        for (int i = 0; i < categories.length; i++) {
            Categorie categorie = categories[i];
            System.out.println(categorie.getLibelle() + " :");

            for (int j = 0; j < articles.length; j++) {
                Article article = articles[j];

                if (article.getCategorie().getId() == categorie.getId()) {
                    System.out.println("  - " + article.toString());
                }
            }
            System.out.println();
        }
    }
}
