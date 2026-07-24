public class CuentaBancaria 
{
 private String titular;
 private Integer numeroCuenta;
 private Double saldo;
 
 public CuentaBancaria
 (
  String titular,
  Integer numeroCuenta,
  Double saldo  
 )
 {
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
 }

 public String getTitular()
 {
    return this.titular;
 }

 public void setTitular(String nombre)
 {
    this.titular = nombre;
 }

 public Integer getCuenta()
 {
    return this.numeroCuenta;
 }

 public void setCuenta(Integer numero)
 {
    this.numeroCuenta = numero;
 }

 public Double getSaldo()
 {
    return this.saldo;
 }

 public void setSaldo(Double dinero)
 {
    this.saldo = dinero;
 }

 public void depositar(double monto)
 {
    if(monto > 0)
    {
        System.out.println("Deposito realizado exitosamente");    
        this.saldo += monto;  
    }
    else
    {
        System.out.println("No es posible depositar el monto, cantidad invalida.");
    }
 }

 public void retirar(double monto)
 {
    if(this.saldo > monto)
    {
        System.out.println("Retiro realizado exitosamente."); 
        this.saldo -= monto; 
    }
    else System.out.println("No es posible realizar el retiro, fondos insuficientes."); 

 }
 
 public void getInfo()
 {
    System.out.println("Titular de la cuenta: " + this.titular);
    System.out.println("Numero de cuenta: " + this.numeroCuenta);
    System.out.println("Saldo de la cuenta: $" + this.saldo);


 }

}
 
    

