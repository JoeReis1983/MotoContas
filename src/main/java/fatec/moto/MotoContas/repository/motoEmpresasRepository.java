package fatec.moto.MotoContas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.motoEmpresas;

public interface motoEmpresasRepository extends JpaRepository<motoEmpresas, Long>{
  
  public motoEmpresas findByNome(String nome);

}
