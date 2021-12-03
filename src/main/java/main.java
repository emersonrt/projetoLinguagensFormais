import model.AutomatoFinito;
import service.AutomatoDigestService;
import utils.TextUtils;

import java.util.ArrayList;
import java.util.List;

public class main {

    //    M = (Q, Σ, δ, q0, F) //q0 estado inicial
    //    Q = {S, A, B, X} //conjunto de estados
    //    Σ = {a, b} //alfabeto
    //    E = q0 // estado inicial
    //    F = {X} // conjunto de estados finais/de aceitação
    //    δ(S,a) = {A}
    //    δ(S,b) = {B}
    //    δ(A,a) = {A}
    //    δ(A,b) = {B}
    //    δ(B,b) = {B, X}

    public static void main(String[] args) {

        AutomatoDigestService service = new AutomatoDigestService();

        List<String> texto = new ArrayList<>();
        texto.add("M = (Q, Σ, δ, E, F)");
        texto.add("Q = {S,A,B,X}");
        texto.add("Σ = {a, b}");
        texto.add("E = q0");
        texto.add("F = {X}");
        texto.add("δ(S,a) = {A}");
        texto.add("δ(S,b) = {B}");
        texto.add("δ(A,a) = {A}");
        texto.add("δ(A,b) = {B}");
        texto.add("δ(B,b) = {B, X}");

        texto = TextUtils.removeWhiteSpacesArray(texto);

        AutomatoFinito af = service.lerAutomatoFinito(texto);

        System.out.println("\n\n-------------------- Linguagens Formais -------------------------------------------");
        System.out.println(af);
        System.out.println(af.getTipo());
        System.out.println("-----------------------------------------------------------------------------------\n\n");

    }

}
