package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//busca o pelo nome do curso que ta relacionado aos topicos
	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
	/* outra forma de fazer a consulta acima caso eu não queira usar o padrão do Spring
	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	List<Topico> carregaPorNomeDoCurso(@Param("nomeCurso")String nomeCurso);
	*/
	
}
