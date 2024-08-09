public class ContaCorrente{

String usuario;
String senha;
double saldo;
string agência;

double realizarExtrato(){
return "Seu saldo é" + saldo;

}
void depositar(double valor){
    saldo += 200;
    saldo += valor;
    
}

}


//int, boolean,char,float