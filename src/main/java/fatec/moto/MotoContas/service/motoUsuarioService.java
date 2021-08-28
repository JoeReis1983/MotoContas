package fatec.moto.MotoContas.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoAutorizacao;
import fatec.moto.MotoContas.entity.motoUsuario;
import fatec.moto.MotoContas.repository.motoAutorizacaoRepository;
import fatec.moto.MotoContas.repository.motoUsuarioRepository;

@Service
public class motoUsuarioService {
  @Autowired
  private motoAutorizacaoRepository autRepo;
  @Autowired
  private motoUsuarioRepository usuarioRepo;
  
  @Transactional
  public motoUsuario cadastrarUsuario(String nome, String senha, String autorizacao, String email, String cidade, String estado, String pais){
    motoAutorizacao aut = new motoAutorizacao();
		aut.setNome(autorizacao);
		autRepo.save(aut);	

		motoUsuario usuario = new motoUsuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);

    usuario.setAutorizacoes(new HashSet<motoAutorizacao>());
		usuario.getAutorizacoes().add(aut);


    usuario.setEmail(email);
    usuario.setCidade(cidade);
    usuario.setEstado(estado);
    usuario.setPais(pais);

		usuarioRepo.save(usuario);
    return usuario;
  }
  
}
