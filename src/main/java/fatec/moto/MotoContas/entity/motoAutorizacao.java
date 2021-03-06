package fatec.moto.MotoContas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moto_autorizacao")

public class motoAutorizacao{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_id")
  private Long id;

  @Column(name = "aut_nome")
  private String nome;

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
    
}