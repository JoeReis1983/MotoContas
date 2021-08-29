package fatec.moto.MotoContas.service;

import java.sql.Date;

// import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoEmpresas;
import fatec.moto.MotoContas.repository.motoEmpresasRepository;

@Service
public class motoEmpresasService {
  @Autowired
  private motoEmpresasRepository empRepo;
  
  @Transactional
  public void cadastrarEmpresas (String nome, String tipo, String retencao){
    motoEmpresas emp = new motoEmpresas();
		emp.setNome(nome);
    emp.setTipo(tipo);
    emp.setRetencao(retencao);  
    empRepo.save(emp);	
  }  
}
