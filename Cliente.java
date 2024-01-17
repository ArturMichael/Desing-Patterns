public class Cliente
    {

       public static void Main(string[] args)
        {
            InterfaceCliente existente = new Adaptador();
            existente.mostrar();
        }
        
    }