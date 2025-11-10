package br.edu.unicesumar.sistemaECommerce.utils;


//UTILIZA O UTILS QUANDO ALGUM MÉTODO É UTILIZADO PARA OUTRAS CLASSES
public class Utils {
    
    public static boolean validarCPF(String cpf){
        if(cpf.length() < 11){
            return false;
        }
        return true;
    }
}
