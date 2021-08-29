package fatec.moto.MotoContas.service;



import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.Autorizacao;
import fatec.moto.MotoContas.entity.Usuario;
import fatec.moto.MotoContas.repository.AutorizacaoRepository;
import fatec.moto.MotoContas.repository.UsuarioRepository;

@Service
public class UsuarioService {
  @Autowired
  private AutorizacaoRepository autRepo;
  @Autowired
  private UsuarioRepository usuarioRepo;
  
  @Transactional
  public Usuario cadastrarUsuario(String nome, String senha, String autorizacao){
    Autorizacao aut = new Autorizacao();
		aut.setNome(autorizacao);
		autRepo.save(aut);	

		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);
		usuario.setAutorizacoes(new HashSet<Autorizacao>());
		usuario.getAutorizacoes().add(aut);
		usuarioRepo.save(usuario);
    return usuario;
  }
  
}
