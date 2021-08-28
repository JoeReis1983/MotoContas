package fatec.moto.MotoContas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import org.springframework.transaction.annotation.Transactional;

import fatec.moto.MotoContas.entity.motoAutorizacao;
import fatec.moto.MotoContas.entity.motoUsuario;
import fatec.moto.MotoContas.repository.motoAutorizacaoRepository;
import fatec.moto.MotoContas.repository.motoUsuarioRepository;
import fatec.moto.MotoContas.service.motoUsuarioService;

@SpringBootTest
@Transactional
@Rollback
class MotoContasApplicationTests {
	@Autowired
	private motoAutorizacaoRepository autRepo;

	@Autowired
	private motoUsuarioRepository usuarioRepo;
  
	@Autowired
	private motoUsuarioService usuarioService;
	


	// @Test
	// void contextLoads() {
	// }
	
	@Test
	void motoAutorizacaoRepositorySaveTestOk(){
		motoAutorizacao aut = new motoAutorizacao();
		aut.setNome("ROLE_TESTE");
		autRepo.save(aut);
		assertNotNull(aut.getId());		
	}

	// @Test
	// void usuarioRepositorySaveTestOk(){
	// 	motoAutorizacao aut = new motoAutorizacao();
	// 	aut.setNome("ROLE_TESTE1");
	// 	autRepo.save(aut);	


	// 	motoUsuario usuario = new motoUsuario();
	// 	usuario.setNome("Celso Reis");
	// 	usuario.setSenha("Moto1");
	// 	usuario.setEmail("celso.reis@fatec.sp.gov.br");
	// 	usuario.setCidade("São José dos Campos");
	// 	usuario.setEstado("São Paulo");
	// 	usuario.setPais("Brasil");
	// 	usuario.setAutorizacoes(new HashSet<motoAutorizacao>());
	// 	usuario.getAutorizacoes().add(aut);
	// 	usuarioRepo.save(usuario);
	// 	assertNotNull(usuario.getId());		
	// }
	
	

	// @Test
	// void autorizacaoRepositoryFindByNome(){
	// 	Autorizacao aut = new Autorizacao();
	// 	aut.setNome("ROLE_TESTE2");
	// 	autRepo.save(aut);
	// 	assertNotNull(autRepo.findByNome("ROLE_TESTE2"));		
	// }

	// @Test
	// void usuarioRepositorySaveTestOk(){
	// 	Autorizacao aut = new Autorizacao();
	// 	aut.setNome("ROLE_TESTE1");
	// 	autRepo.save(aut);	

	// 	Usuario usuario = new Usuario();
	// 	usuario.setNome("ROLE_TESTE_Usuario");
	// 	usuario.setSenha("ROLE_TESTE_Senha");
	// 	usuario.setAutorizacoes(new HashSet<Autorizacao>());
	// 	usuario.getAutorizacoes().add(aut);
	// 	usuarioRepo.save(usuario);
	// 	assertNotNull(usuario.getId());		
	// }
	
	// @Test
	// void autorizacaoRepositoryFindByAutorizacoesNomeTestOk(){
	// 	Autorizacao aut = new Autorizacao();
	// 	aut.setNome("ROLE_TESTE1");
	// 	autRepo.save(aut);	

	// 	Usuario usuario = new Usuario();
	// 	usuario.setNome("ROLE_TESTE_Usuario");
	// 	usuario.setSenha("ROLE_TESTE_Senha");
	// 	usuario.setAutorizacoes(new HashSet<Autorizacao>());
	// 	usuario.getAutorizacoes().add(aut);
	// 	usuarioRepo.save(usuario);
	// 	List<Usuario> usuarios = usuarioRepo.findByAutorizacoesNome("ROLE_TESTE1");
	// 	assertFalse(usuarios.isEmpty());
	// }


	// @Test
	// void usuarioCadastrarUsuarioTestOk(){

	// 	usuarioService.cadastrarUsuario("teste","teste","ROLE_TESTE1");
	// 	List<Usuario> usuarios = usuarioRepo.findByAutorizacoesNome("ROLE_TESTE1");
	// 	assertFalse(usuarios.isEmpty());
	
	// }

}
