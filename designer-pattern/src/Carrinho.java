import java.util.LinkedList;

public class Carrinho {
  
  private LinkedList<Pedido> pedidos = new LinkedList();
  
  public void addItem(Produto produto, int quantidade){
    this.pedidos.add(new Pedido(produto, quantidade));
  }

  public void removeItem(Produto p){
    this.removeItem(p);
  }

}
