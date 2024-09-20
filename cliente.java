import java.util.Date;

public class cliente {

  public enum TipoDocumento {
    CPF, RG, CNH, PASSAPORTE;
  }

  // atributos
  private int IdCliente;
  private String NomeCli;
  private static TipoDocumento old_Tipo_documento;
  private int CodDocum;
  private int RgCli;
  private String Endereco;
  private String Bairro;
  private String Cidade;
  private String Estado;
  private String Cep;
  private int DddRes;
  private String TelRes;
  private int DddCom;
  private String TelCom;
  private int DddCel;
  private String TelCel;
  private String Email;
  private int StatusCli;
  private Date DataCadCli;

  // get´s e set´s

  // g&s idcliente
  public int getIdCliente() {
    return IdCliente;
  }

  public void setIdCliente(int IdCliente) {
    this.IdCliente = IdCliente;
  }

  // g&s nomecli
  public String getNomeCli() {
    return NomeCli;
  }

  public void setNomeCli(String NomeCli) {
    this.NomeCli = NomeCli;
  }

  // g&s old_Tipo_documento
  public TipoDocumento getold_Tipo_documento() {
    return old_Tipo_documento;
  }

  public void setold_Tipo_documento(TipoDocumento old_Tipo_documento) {
    cliente.old_Tipo_documento = old_Tipo_documento;
  }

  // g&s coddocum
  public int getCodDocum() {
    return CodDocum;
  }

  public void setCodDocum(int CodDocum) {
    this.CodDocum = CodDocum;
  }

  // g&s Rg_cli
  public int getRgCli() {
    return RgCli;
  }

  public void setRgCli(int RgCli) {
    this.RgCli = RgCli;
  }

  // g&s Endereço
  public String getEndereco() {
    return Endereco;
  }

  public void setEndereco(String Endereco) {
    this.Endereco = Endereco;
  }

  // g&s Bairro
  public String getBairro() {
    return Bairro;
  }

  public void setBairro(String Bairro) {
    this.Bairro = Bairro;
  }

  // g&s Cidade
  public String getCidade() {
    return Cidade;
  }

  public void setCidade(String Cidade) {
    this.Cidade = Cidade;
  }

  // g&s Estado
  public String getEstado() {
    return Estado;
  }

  public void setEstado(String Estado) {
    this.Estado = Estado;
  }

  // g&s Cep
  public String getCep() {
    return Cep;
  }

  public void setCep(String Cep) {
    this.Cep = Cep;
  }

  // g&s dddres
  public int getDddRes() {
    return DddRes;
  }

  public void setdddres(int DddRes) {
    this.DddRes = DddRes;
  }

  // g&s telres
  public String geTelRes() {
    return TelRes;
  }

  public void setTeRres(String TelRes) {
    this.TelRes = TelRes;
  }

  // g&s dddcom
  public int getDddCom() {
    return DddCom;
  }

  public void setDddCom(int DddCom) {
    this.DddCom = DddCom;
  }

  // g&s telcom
  public String getTelCom() {
    return TelCom;
  }

  public void setTelCom(String TelCom) {
    this.TelCom = TelCom;
  }

  // g&s dddcel
  public int getDddcel() {
    return DddCel;
  }

  public void setDddCel(int DddCel) {
    this.DddCel = DddCel;
  }

  // g&s telcel
  public String getTelCel() {
    return TelCel;
  }

  public void setTelCel(String TelCel) {
    this.TelCel = TelCel;
  }

  // g&s email
  public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  // g&s statuscli
  public int getStatusCli() {
    return StatusCli;
  }

  public void setStatusCli(int StatusCli) {
    this.StatusCli = StatusCli;
  }

  // g&s datacadcli
  public Date getDatacadCli() {
    return DataCadCli;
  }

  public void setDatacadCli(Date DataCadCli) {
    this.DataCadCli = DataCadCli;
  }

  // Métodos

  // Efetuar pedido
  public void efetuaPedido() {
    System.out.println(NomeCli + " efetuou um pedido.");
  }

  // Efetuar pagamento
  public void efetuaPagamento() {
    System.out.println(NomeCli + " efetuou o pagamento.");
  }

  // Cadastrar cliente
  public void cadastraCliente() {
    System.out.println(NomeCli + " foi cadastrado(a) com sucesso.");
  }

  // Excluir cliente
  public void excluiCliente() {
    System.out.println("O cadastro de " + NomeCli + " foi excluído com sucesso.");
  }

  // Alteração de dados
  public void alteraDados() {
    System.out.println("Os dados de cadastro de " + NomeCli + " foram alterados com sucesso.");
  }

  // Consulta de dados
  public void consultaDados() {
    System.out.println("Os dados de " + NomeCli + " são: RG nº " + RgCli + " / " +
        " Endereço: " + Endereco + " - " + Bairro + ", " + Cidade +
        " - " + Estado + " / " + "CEP: " + Cep + " / " +
        "Tel. Cel: " + TelCel);
  }
  public static void main(String[] args) {
    // Corrigido o nome da classe Cliente
    cliente João = new cliente();

    // Correção nos métodos setters
    João.setNomeCli("João Carlos de Almeida");
    João.setIdCliente(1);
    João.setRgCli(45678901);
    João.setEndereco("Rua das Flores, 123");
    João.setBairro("Jardim Primavera");
    João.setCidade("São Paulo");
    João.setEstado("SP");
    João.setCep("01234567");
    João.setDddCel(11);
    João.setTelCel("912345678");

    // Exibindo a inclusão do cliente
    System.out.println("Inclui o cliente: " + João.getNomeCli() + ". ");

    // Chamadas de métodos corrigidos
    João.cadastraCliente();
    João.efetuaPedido();
    João.efetuaPagamento();
    João.alteraDados();
    João.consultaDados();
    João.excluiCliente();

    System.out.println("================");
  }
}
