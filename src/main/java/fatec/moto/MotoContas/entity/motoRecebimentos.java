package fatec.moto.MotoContas.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto_recebimentos")
public class motoRecebimentos{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  @Column(name = "recebimento_id")
  private Long id;
  @Column(name = "recebimento_nome")
  private String nome;
  @Column(name = "recebimento_tipo")
  private String tipo;
  @Column(name = "recebimento_distancia")
  private String distancia;
  @Column(name = "recebimento_valor")
  private String valor;
  @Column(name = "recebimento_tempo")
  private String tempo;
  @Column(name = "recebimento_data")
  private Date data;

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
  public String getDistancia() {
    return distancia;
  }
  public void setDistancia(String distancia) {
    this.distancia = distancia;
  }
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }
  public String getTempo() {
    return tempo;
  }
  public void setTempo(String tempo) {
    this.tempo = tempo;
  }
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }


  
}