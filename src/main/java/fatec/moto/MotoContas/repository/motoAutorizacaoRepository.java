package fatec.moto.MotoContas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.motoAutorizacao;

public interface motoAutorizacaoRepository extends JpaRepository<motoAutorizacao, Long>{
  
  public motoAutorizacao findByNome(String nome);
  
}
