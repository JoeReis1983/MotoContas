package fatec.moto.MotoContas.service;

// import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoAutorizacao;
// import fatec.moto.MotoContas.entity.motoUsuario;
import fatec.moto.MotoContas.repository.motoAutorizacaoRepository;
// import fatec.moto.MotoContas.repository.motoUsuarioRepository;

@Service
public class motoAutorizacaoService {
  @Autowired
  private motoAutorizacaoRepository autRepo;
  @Autowired
  private motoAutorizacao aut;
  
  @Transactional
  public void cadastrarAutorizacao (String autorizacao){
		aut.setNome(autorizacao);
		autRepo.save(aut);	
  }
  
}
