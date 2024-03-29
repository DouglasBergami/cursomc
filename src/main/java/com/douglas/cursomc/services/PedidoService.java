package com.douglas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.cursomc.domain.Pedido;
import com.douglas.cursomc.repositories.PedidoRepository;
import com.douglas.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository PedidoRepository;

	public Pedido buscar(Integer id) {

		Optional<Pedido> obj = PedidoRepository.findById(id);

		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class));

	}

}
