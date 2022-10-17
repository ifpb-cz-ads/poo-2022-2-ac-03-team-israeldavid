class PessoaTeste{

     public static void main (String[] args){
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Rodrigo";
        p1.idade = 16;
        
        if(p1.idade>=16){
            System.out.print(p1.nome + " pode votar!");
        }
        else{
            System.out.print("O cidadão não pode votar!");
        }
    }
}