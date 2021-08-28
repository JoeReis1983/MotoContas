package fatec.moto.MotoContas.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "motoEmpresas")
public class motoEmpresas{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "empresa_id")
  private Long id;

  @Column(name = "empresa_nome")
  private String nome;
  @Column(name = "empresa_tipo")
  private String tipo;
  @Column(name = "usuario_retencao")
  private String retencao;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getRetencao() {
    return retencao;
  }
  public void setRetencao(String retencao) {
    this.retencao = retencao;
  }
}