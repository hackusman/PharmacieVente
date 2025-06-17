import java.util.Scanner;
import java.text.DecimalFormat;

public class PharmacieVente {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SYSTEME DE VENTE PHARMACIE ===");
        
        // Saisie des informations produit
        System.out.print("Nom du produit: ");
        String nomProduit = scanner.nextLine();
        
        System.out.print("Prix unitaire du produit: ");
        double prixUnitaire = scanner.nextDouble();
        
        System.out.print("Quantité à vendre: ");
        int quantite = scanner.nextInt();
        
        System.out.print("Taux de TVA (%): ");
        double tauxTVA = scanner.nextDouble();
        
        System.out.print("Autres taux (% - 0 si aucun): ");
        double autresTaux = scanner.nextDouble();
        
        // Calcul des montants
        double montantBrut = prixUnitaire * quantite;
        double montantTVA = montantBrut * (tauxTVA / 100);
        double montantAutresTaxes = montantBrut * (autresTaux / 100);
        double montantTotal = montantBrut + montantTVA + montantAutresTaxes;
        
        // Confirmation
        System.out.println("\nRécapitulatif de la vente:");
        System.out.println("Produit: " + nomProduit);
        System.out.println("Prix unitaire: " + df.format(prixUnitaire) + " F");
        System.out.println("Quantité: " + quantite);
        System.out.println("Montant brut: " + df.format(montantBrut) + " F");
        System.out.print("Confirmer la vente (O/N)? ");
        String confirmation = scanner.next();
        
        if (confirmation.equalsIgnoreCase("O")) {
            // Affichage de la facture
            System.out.println("\n=== FACTURE PHARMACIE ===");
            System.out.println("+-------------------------------------------+");
            System.out.printf("| %-20s | %-15s |\n", "Produit:", nomProduit);
            System.out.printf("| %-20s | %-15s |\n", "Quantité:", quantite);
            System.out.printf("| %-20s | %-15s |\n", "Prix unitaire:", df.format(prixUnitaire) + " F");
            System.out.println("+-------------------------------------------+");
            System.out.printf("| %-20s | %-15s |\n", "Montant brut:", df.format(montantBrut) + " F");
            System.out.printf("| %-20s | %-15s |\n", "TVA (" + tauxTVA + "%):", df.format(montantTVA) + " F");
            
            if (autresTaux > 0) {
                System.out.printf("| %-20s | %-15s |\n", "Autres taxes (" + autresTaux + "%):", df.format(montantAutresTaxes) + " F");
            }
            
            System.out.println("+-------------------------------------------+");
            System.out.printf("| %-20s | %-15s |\n", "MONTANT TOTAL:", df.format(montantTotal) + " F");
            System.out.println("+-------------------------------------------+");
            System.out.println("\nMerci pour votre achat !");
        } else {
            System.out.println("Vente annulée.");
        }
        
        scanner.close();
    }
}
