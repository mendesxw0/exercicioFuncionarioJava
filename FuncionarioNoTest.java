package OrientacaoAobjeto.main.dominio;

import OrientacaoAobjeto.main.test.FuncionarioSalarioTest02;

public class FuncionarioNoTest {

    public String name;
    public double[] salario;
    public int idade;

    public void ImprimeFuncionario(){
        System.out.println(this.name);
        System.out.println(this.idade);
        for(double salarios: salario){
            System.out.println(salarios);
        }

        mediaSalario();

    }
    public void mediaSalario(){
        float media = 0;
        for (double mediaMoney: salario){
            media += mediaMoney;

        }
        media /= salario.length;

        System.out.println("Média salarial "+ media);
    }
}
