 public class CalculoPorcentagem {

  public void calculaPorcentagem(Pessoa pessoa) {
    // Se a pessoa retornou de viagem
    if (pessoa.estaRetornandoViagem.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30; // Aumenta a porcentagem de infecção em 30%
      pessoa.orientacaoFinal = "Você ficará sob observação por 05 dias.";
    }

    // Se o cartão de vacinação da pessoa não está em dia
    if (pessoa.cartaoVacinaEmDia.equals("NAO")) {
      pessoa.porcentagemInfeccao += 100; // Aumenta a porcentagem de infecção em 100%
    }

    // Se a pessoa teve sintomas recentemente
    if (pessoa.teveSintomasRecentemente.equals("SIM")) {
      pessoa.porcentagemInfeccao += 300; // Aumenta a porcentagem de infecção em 300%
    }

    // Se a pessoa teve contato com pessoas sintomáticas
    if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")) {
      pessoa.porcentagemInfeccao += 300; // Aumenta a porcentagem de infecção em 300%
    }
  }
}
  