import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TotalCoutITCase {
    @Test
    public void TestCoutTotal(){



        HautVetement hautVetement = new HautVetement("suite", Taille.XS, 50, "Coton", Manche.COURTES);
        Client client = new Client("M", "t", LocalDate.now(), "001 d ", "M@mail", "03255");

        Commande commande = new Commande("001", LocalDate.now(), "vetement chaud", List.of(hautVetement), List.of(client));
        Commande commande1 = new Commande("001", LocalDate.now(), "vetement chaud", List.of(hautVetement), List.of(client));
        Commande commande3 = new Commande("001", LocalDate.now(), "vetement chaud", List.of(hautVetement), List.of(client));


        Commande cm = new Commande(List.of(commande1, commande3, commande));

        double result = cm.coutTotal();
        double attendu = cm.getVetement().stream()
                .mapToDouble(v -> v.getPrix_Unitaire())
                .sum();

        assertEquals(attendu, result, 0.001);
    }



}




