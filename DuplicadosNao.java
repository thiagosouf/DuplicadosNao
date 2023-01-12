import java.util.ArrayList;
import java.util.List;

public class DuplicadosNao {
    public static void main(String[] args) {
        List<String> meuArrayDuplicado = new ArrayList<>();
        String[] meuArray1 = new String[] { "Morango", "Uva", "Acerola", "Manga" };
        String[] meuArray2 = new String[] { "Pera", "Caju", "Morango", "Kiwi", "Manga" };
        for (int i = 0; i < meuArray1.length; i++) {
            for (int j = 0; j < meuArray2.length; j++) {
                if (meuArray1[i] == meuArray2[j]) {
                    meuArrayDuplicado.add(meuArray1[i]);
                }
            }
        }
        for (int i = 0; i < meuArrayDuplicado.size(); i++) {
            System.out.println(meuArrayDuplicado.get(i));

        }

    }
}
