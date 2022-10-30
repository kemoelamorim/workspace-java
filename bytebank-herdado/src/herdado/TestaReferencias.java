package herdado;
public class TestaReferencias {

  public static void main(String[] args) {
    
    ControleBonificacao controle = new ControleBonificacao();

    Gerente g1 = new Gerente();
    g1.setSalario(1000);
    controle.registra(g1);
    
    System.out.println(controle.getSoma());
    
    EditorVideo edVideo = new EditorVideo();
    edVideo.setSalario(3000);
    controle.registra(edVideo);

    System.out.println(controle.getSoma());
    
    Designer designer = new Designer();
    designer.setSalario(2000);
    controle.registra(designer);

    System.out.println(controle.getSoma());
  }
}
