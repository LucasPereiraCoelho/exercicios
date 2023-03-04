package Listas_Exercícios;

public class OperacaoMatematica {
    //1º item modificador de acesso: public / private;
    //2º item método possui retorno? sim? (qual tipo?) não? = void;
    //3º item nome do método;
    //4º item método possui parâmetros? sim? (qual tipo?)
    public int somarNumeros(int param1, int param2){
    
        return param1 + param2;
    }

   
    
    public int subtrairNumeros(int param1, int param2){
    
        return param1 - param2;
    }
     
   
    
    public int multiplicarNumeros(int param1, int param2){
    
        return param1 * param2;
    }
    
   
    
    public double dividirNumeros(int param1, int param2){
    
        return param1 / param2;
    }

    
    
    public float porcentagem (float param1, float porcentagem){

        return (float)((param1 * porcentagem) / 100);
    }

   
    
    public float media (float param1, float param2, float param3, int media){
    
        return ((param1 + param2 + param3) / media);
    
    }

   
    
    public float imc (float param1, float param2){
    
        return (param1 / (param2 * param2));
        
    }

    
    public boolean maiorQue (double param1, double param2){
    
        return (param1 > param2);
    
    }
    

    public int numeroMaior (int param1, int param2, int param3){
    
        if (param1 > param2 && param1 > param3){
        
            return (param1);
            
        }else if (param2 > param1 && param2 > param3){
        
            return (param2);
        }else{
        
            return (param3);
        }
         
    
    }
    
    
}