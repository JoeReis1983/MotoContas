package fatec.moto.MotoContas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{
  
  public Autorizacao findByNome(String nome);
  
}
