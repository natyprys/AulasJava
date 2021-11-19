package Atividade2;

public class View {
   public static void main(String[] args) {
       
    PontosTuristicos pt = new PontosTuristicos();
    pt.nome = "Igrejinha";
    pt.descrição = " Igreja Nossa Senhora de Fátima ";
    pt.localização= " Asa Sul ";

    IController ic = new Controller();
    //ic.salvar(pt);

} 
}
