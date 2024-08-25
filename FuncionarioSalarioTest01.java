package OrientacaoAobjeto.main.test;

import OrientacaoAobjeto.main.dominio.FuncionarioNoTest;

public class FuncionarioSalarioTest01 {
    public static void main(String[] args) {
        FuncionarioNoTest funcionario = new FuncionarioNoTest();

        funcionario.name = "Lucas";
        funcionario.idade = 35;
        funcionario.salario = new double[] {2.435, 3.531, 4.768};


        funcionario.ImprimeFuncionario();
    }
}
