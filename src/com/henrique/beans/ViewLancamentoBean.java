package com.henrique.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.henrique.model.Lancamento;

@ManagedBean
@ApplicationScoped
public class ViewLancamentoBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	
	private List<Lancamento> lancamentos;
	private Lancamento lancamento;
	private Lancamento lancamentoSelecionado;
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	
	public Lancamento getLancamento() {
		return lancamento;
	}
	
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	
	public ViewLancamentoBean(){
		
		lancamentos = new ArrayList<>();
		lancamento = new Lancamento();
		
	}
	
	public void cadastrar() {
		 
		this.lancamentos.add(lancamento);
		lancamento = new Lancamento();
	}
	
	public boolean mostrar(){
		
		if (this.lancamentos.isEmpty()) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public void excluir() {
		
		this.lancamentos.remove(this.lancamentoSelecionado);
		
	}

	public Lancamento getLancamentoSelecionado() {
		return lancamentoSelecionado;
	}

	public void setLancamentoSelecionado(Lancamento lancamentoSelecionado) {
		this.lancamentoSelecionado = lancamentoSelecionado;
	}
	
	public void limpar() {
		this.lancamentos.clear();
	}

	
}
