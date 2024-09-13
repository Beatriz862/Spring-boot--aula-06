import java.util.ArrayList;

public class Main{
    publi static void mais(String[] args){

         Produto p1 =  new Produto("Celular", 2000);
         Produto p2 =  new Produto("Notebook", 4500);
         Produto p3 =  new Produto("Relógio", 200 )
    }

ArrayList<Porduto>produtos =  new ArrayList<>();

produtos.add(p1);
produtos.add(p2);
produtos.add(p3);


System.out.println(produtos.get(0).getNome());

     produtos.remove(0);

System.out.printnl(produtos.get(0).getNome);

System.out.printnl("O tamanho do ArrayList é" +produtos.size());

  for(int i = 0; i < produtos.size(); i++){
            
    System.out.println("O nome do produto é " +produtos.get(i).getNome()) ;
    System.out.println("O valor do produto é " +produts.get(i).getValor()) ;

}

}