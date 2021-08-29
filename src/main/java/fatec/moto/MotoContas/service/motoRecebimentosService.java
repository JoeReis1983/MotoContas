package fatec.moto.MotoContas.service;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoRecebimentos;
import fatec.moto.MotoContas.repository.motoRecebimentosRepository;

@Service
public class motoRecebimentosService {
  @Autowired
  private motoRecebimentosRepository recRepo;
  
  @Transactional
  public void cadastrarRecebimentos (String nome, String tipo, String distancia, String valor, String tempo, Date data){
    motoRecebimentos rec = new motoRecebimentos();
		rec.setNome(nome);
    rec.setTipo(tipo);
    rec.setDistancia(distancia);
    rec.setTempo(tempo);
    rec.setData(data);
    rec.setValor(valor);  
    recRepo.save(rec);	
  }
  
}
