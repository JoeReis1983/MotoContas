package fatec.moto.MotoContas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.motoUsuario;

public interface motoUsuarioRepository extends JpaRepository<motoUsuario,Long> {

  public List<motoUsuario> findByNome(String nome);
  
}
