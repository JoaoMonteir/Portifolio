package petshop;

import java.time.LocalDateTime;

public class Agendamento {
    private Cliente cliente;
    private Pet pet;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento(Cliente cliente, Pet pet, Servico servico, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.pet = pet;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public Servico getServico() {
        return servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
