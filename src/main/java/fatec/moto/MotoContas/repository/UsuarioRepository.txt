package fatec.moto.MotoContas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.moto.MotoContas.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

  public List<Usuario> findByAutorizacoesNome(String autorizacao);
  
}
