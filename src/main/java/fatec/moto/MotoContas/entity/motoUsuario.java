package fatec.moto.MotoContas.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "motoUsuario")
public class motoUsuario{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "usuario_id")
  private Long id;

  @Column(name = "usuario_nome")
  private String nome;

  @Column (name = "usuario_senha")
  private String senha;
  
  @Column (name = "usuario_email")
  private String email;

  @Column (name = "usuario_cidade")
  private String cidade;

  @Column (name = "usuario_estado")
  private String estado;

  @Column (name = "usuario_pais")
  private String pais;

  @ManyToMany (fetch = FetchType.LAZY)
  @JoinTable (name = "motoUsuario_autorizacao", joinColumns = {@JoinColumn(name = "usuario_id")}, inverseJoinColumns = {@JoinColumn(name = "aut_id")}) 

  private Set <motoAutorizacao> autorizacoes;

  public Set<motoAutorizacao> getAutorizacoes() {
    return autorizacoes;
  }
  public void setAutorizacoes(Set<motoAutorizacao> autorizacoes) {
    this.autorizacoes = autorizacoes;
  }
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
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }



  




}