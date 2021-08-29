package fatec.moto.MotoContas.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto_despesas")
public class motoDespesas{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "despesa_id")
  private Long id;
  
  @Column(name = "despesa_nome")
  private String nome;

  @Column(name = "despesa_tipo")
  private String tipo;

  @Column(name = "despesa_data")
  private Date data;

  @Column(name = "despesa_valor")
  private String valor;

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
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }


}