class Conta {
    int numero;
    double saldo;
    int status; //1-ATIVA 2-BLOQUEADA 3-CANCELADA
    int categoria; //1-COMUM 2-ESPECIAL 3-VIP

    /** Metodo construtor de <<create>*/
    public Conta(int numero) {
      saldo = 0;
      status = 1;
      categoria = 1;
    }

    /** Metodo creditar. Credita "valor" no saldo
     */
    public void creditar(double valor) {
      if (status == 1){
          saldo =  saldo + valor;
        if (saldo <= 50000){
            categoria = categoria;
        }else
          if (saldo > 50000 && saldo <= 100000){
            categoria = 2;
          }else{
            categoria = 3;
          }
      }else if (status == 0 || status == 9)
        saldo = saldo;
    }

    /** Metodo debitar. Debita "valor" do saldo
     */
      double taxa;
    public void debitar(double valor) {
     if (status == 1){
          saldo =  saldo - valor;
        if (saldo < 0){
            taxa = 10.0;
            saldo = saldo - taxa;
        }else
          if (saldo >= 0){
            taxa = 0.0;
            saldo = saldo - taxa;
          }
      }else if (status == 0 || status == 9)
        saldo = saldo;
    
    }
}
