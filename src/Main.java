public class Main {


    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "111.111.111-11", "31 1111-1111");
        Agencia agencia = new Agencia(111, 222222, "Gil");
        Conta minhaConta = new Conta(cliente1, agencia, 0.00);

        minhaConta.realizarOperacao('d', 450);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);

        System.out.println(minhaConta);
    }
}
