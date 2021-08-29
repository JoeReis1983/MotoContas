package fatec.moto.MotoContas.service;

import java.sql.Date;

// import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoAutorizacao;
import fatec.moto.MotoContas.entity.motoDespesas;
// import fatec.moto.MotoContas.entity.motoUsuario;
import fatec.moto.MotoContas.repository.motoAutorizacaoRepository;
// import fatec.moto.MotoContas.repository.motoUsuarioRepository;
import fatec.moto.MotoContas.repository.motoDespesasRepository;

@Service
public class motoDespesasService {
  @Autowired
  private motoDespesasRepository despRepo;
  
  @Transactional
  public void cadastrarDespesas (String nome, String tipo, Date data, String valor){
    motoDespesas desp = new motoDespesas();
		desp.setNome(nome);
    desp.setTipo(tipo);
    desp.setData(data);
    desp.setValor(valor);
	
  
    despRepo.save(desp);	
  }
  
}
