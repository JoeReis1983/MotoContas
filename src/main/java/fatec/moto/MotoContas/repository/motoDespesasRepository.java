package fatec.moto.MotoContas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.motoDespesas;

public interface motoDespesasRepository extends JpaRepository<motoDespesas, Long>{
  
  public motoDespesas findByNome(String nome);

}
