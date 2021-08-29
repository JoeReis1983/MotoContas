package fatec.moto.MotoContas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.motoRecebimentos;

public interface motoRecebimentosRepository extends JpaRepository<motoRecebimentos, Long>{
  
  public motoRecebimentos findByNome(String nome);

}
