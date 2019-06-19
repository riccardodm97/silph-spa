package it.silph.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.silph.model.Fotografo;
import it.silph.repository.FotografoRepository;

@Service
public class FotografoService {
	
	@Autowired
	private FotografoRepository fotografoRepository;
	
	@Transactional
	public List<Fotografo> getFotografiByNome(String nome){
		return (List<Fotografo>) fotografoRepository.findByNome(nome);
	}
}
